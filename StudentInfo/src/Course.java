public class Course {
     String courseName;
     int oralExamPer;
     int oralExamNote;
     String courseCode;
     String coursePrefix;
     int courseNote;
     Teacher courseTeacher;

    public Course(String courseName, String courseCode,int oralExamPer, String coursePrefix, Teacher t1){
        this.courseTeacher = t1;
        this.courseName= courseName;
        this.courseCode = courseCode;
        this.coursePrefix = coursePrefix;
        this.courseNote = 0;
        this.oralExamPer = oralExamPer;
        this.oralExamNote= 0;

    }
    public void addTeacher(Teacher teacher){
         this.courseTeacher = teacher;
    }
    public void teacherInfo(){
        this.courseTeacher.printTeacher();
    }

}
