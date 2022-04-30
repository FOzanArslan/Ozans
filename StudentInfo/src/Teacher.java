public class Teacher {
     String teacherName;
     String teacherBranch;
     String teacherMpno;

    public Teacher(String teacherName, String teacherBranch, String teacherMpno){
        this.teacherName= teacherName;
        this.teacherBranch= teacherBranch;
        this.teacherMpno= teacherMpno;
    }
    public  void printTeacher(){
        System.out.println("Teacher Name: "+teacherName);
        System.out.println("Teacher Branch: "+teacherBranch);
        System.out.println("Teacher Mpno: "+teacherMpno);

    }
}
