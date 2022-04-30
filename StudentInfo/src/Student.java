public class Student {


         String studentName;
         String studentNo;
         int studentClasses;
        Course math;
        Course phys;
        Course turk;
        Double studentAverage;
        private boolean studentIsPass;

        public Student(String studentName, String studentNo, int studentClasses, Course math, Course phys ,Course turk){
            this.studentName = studentName;
            this.studentNo = studentNo;
            this.studentClasses = studentClasses;
            this.math = math;
            this.phys = phys;
            this.turk = turk;
            this.studentIsPass = false;
        }

    public void addBulkExamNote(int mat,int oralMat, int phys,int oralPhys, int turk ,int oralturk){
            if (mat>=0 && mat<=100 && oralMat>=0 && oralMat<=100){
                this.math.courseNote = mat;
                this.math.oralExamNote = oralMat;
            }
            if (phys>=0 && phys<=100 && oralPhys>=0 && oralPhys<=100){
                this.phys.courseNote = phys;
                this.phys.oralExamNote = oralPhys;
            }
            if (turk>=0 && turk<=100 && oralturk>=0 && oralturk<=100){
                this.turk.courseNote = turk;
                this.turk.oralExamNote = oralturk;
            }
    }
    public void isPass(){
            if (this.studentAverage>=50){ System.out.println("Öğrenci dersi geçmiştir");
            this.studentIsPass = true;}
            else {
                System.out.println("Öğrenci dersten kalmıştır.");
                this.studentIsPass = false;
            }
    }
    public double calcAverage(){
            double studentmath = (this.math.oralExamNote*this.math.oralExamPer)/100+((this.math.courseNote)*(100- this.math.oralExamPer))/100;
            double studentphys = (this.phys.oralExamNote*this.phys.oralExamPer)/100+((this.phys.courseNote)*(100- phys.oralExamPer))/100;
            double studentturk = (this.turk.oralExamNote*turk.oralExamPer)/100+((this.turk.courseNote)*(100- turk.oralExamPer))/100;
            double average = (studentmath+studentphys+studentturk)/3;

        System.out.println(average);
            this.studentAverage = average;
            return studentAverage;
    }
    public void printNote(){}


}
