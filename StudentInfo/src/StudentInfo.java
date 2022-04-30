public class StudentInfo {
    public static void main(String[] args){
        Teacher matTeacher = new Teacher("ozan", "Math","04400");
        Teacher turkTeacher = new Teacher("Kamil", "Turk","04424");
        Teacher physTeacher = new Teacher("Evrim", "Phys","04532");

        Course mat = new Course("Math126", "126", 30,"Math", matTeacher);
        Course turk = new Course("Turk101", "101", 20, "Turk", turkTeacher);
        Course phys = new Course("Phys182", "182",30,"182",physTeacher);

        Student Ozan = new Student("Ozan", "2468148", 3,mat,phys,turk);
        Ozan.addBulkExamNote(80,40,70,20,100,50);
        Ozan.calcAverage();
        Ozan.isPass();

    }
}
