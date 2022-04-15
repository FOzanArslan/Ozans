import random
def newQuestion():
  print("\033[H\033[J", end="")
  if(not eval(CONFIG["questionIdAutomatic"])):
    while True:
      newQuestionId=input('ENTER A NUMERIC [UNUSED] QUESTION ID: ')
      if(not newQuestionId.isnumeric()):
        print('YOU ENTERED AN INVALID NUMBER')
        continue
      if (newQuestionId in QUESTIONCONFIG.keys()):
        print('THIS ID IS ALREADY USED.')
        continue
      
      break
  else: 
    newQuestionId= str(max(map(int, readJSON('questions.json').keys()))+ 1)
  
  while True:
    questionText=input(f'WRITE TO QUESTION TEXT (AT LEAST {CONFIG["minQuestionCharLength"]} CHARS): ')
    if(len(questionText) >= CONFIG["minQuestionCharLength"]):
      break
    print('THIS QUESTION IS TOO SHORT')
  while True:
    questionDiff=input('QUESTION DIFFICULTY [1-5]: ')
    if('1'<= questionDiff <='5'):
      break
    print('PLEASE ENTER A VALID VALUE 1-5')
    
  while True:
    questionAnswers=input(f'Write at least {CONFIG["minAnswerCount"]} answer: ')
    answerCount = len(questionAnswers.split(','))
    if(answerCount >= int(CONFIG["minAnswerCount"])):
      if('*' in questionAnswers):
        break
      else:
        print('THE CORRECT ANSWER IS NOT INDICATED')
    else:    
      print('TOO FEW ANSWERS')
  questionsData= readJSON('questions.json')
  questionsData[newQuestionId]= {
    "Text":questionText,
    "Difficulty":questionDiff,
    "Answers":questionAnswers.split(',')
      }

  with open("questions.json","w") as questionFile:
    questionFile.write(str(questionsData).replace("'",'"'))

  print('QUESTION ADDED SUCCESFULLY')
  while True:
    anotherQ= input('Do you want to add another question Y/N').upper()
    if(anotherQ=='Y'):
      newQuestion()
    elif(anotherQ=='N'):
      quizApp()
    else:
      print('Please enter a valid answer.')
  return 0
  


def readJSON(file):
   with open(file, 'r') as jsonFile:
          lines=jsonFile.readlines()
          jointLines= ''.join(lines)
          jointLines.replace('\n', '')
          jsonData=eval(jointLines)
          return jsonData

def quizAttempt():
  questions=list(QUESTIONCONFIG.values())
  random.shuffle(questions)
  print("\033[H\033[J", end="")
  userPoint= 0
  for i in range(len(questions)):
    print(questions[i]['Text'])
    indexQuestionAnswer= None
    for x in range(len(questions[i]['Answers'])):
      print(chr(97+x),'-)',questions[i]['Answers'][x].replace('*',''))

      if ('*' in questions[i]['Answers'][x]):
        indexQuestionAnswer = x
      
    while True:    
      userQuestionAnswer= input('Your answer: ')
      if(len(userQuestionAnswer)!= 1  or not 'a' <=userQuestionAnswer.lower()<= 'z'):
        print('This is not a valid answer! Please try again.')
        continue
      break

    if(indexQuestionAnswer == ord(userQuestionAnswer.lower())-97):
      print('Your answer is correct.')
      userPoint +=1
    else: 
      print(f'Your answer is incorrect. Correct answer is "{chr(97+ indexQuestionAnswer)}"')
    print()
  print('Your quiz is over. Your point is', userPoint, end="\n")
  while True:
    userLast= input('Press M to main menu, press R to retake the quiz: ').upper()
    if (userLast== 'M'):
      quizApp()
    elif (userLast == 'R'):
      quizAttempt()
    else:
      print('Please give a valid answer.')
        
  
def quizApp():
  print("\033[H\033[J", end="")
  print('--------------WELCOME TO THE QUIZ---------------')
  print('1-) ADD QUESTION')
  print('2-) TAKE THE QUIZ')
  print('3-) QUIT')

  while True:
    userMenuInput=input('')
    if('1'<=userMenuInput<='3'):
      if(userMenuInput== '1'):
        newQuestion()   
      elif(userMenuInput=='2'):
        quizAttempt()
      elif(userMenuInput=='3'):
        print('Thanks. I had a lot of fun writing the code')

    else: 
      print("\033[H\033[J", end="")
      print('--------------WELCOME TO THE QUIZ--------------')
      print('1-) ADD QUESTION')
      print('2-) TAKE THE QUIZ')
      print('3-) QUIT')

QUESTIONCONFIG = readJSON('questions.json')      
CONFIG = readJSON('configuration.json')
open('questions.json', 'r')
print('--------------WELCOME TO THE QUIZ--------------')

quizApp()
    
  