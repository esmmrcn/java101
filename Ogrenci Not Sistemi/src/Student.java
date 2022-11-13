public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    void addBulkExamNote(double mat, double fizik, double kimya) {
        this.mat.note = mat;
        this.fizik.note = fizik;
        this.kimya.note = kimya;
    }

    void isPass() {
        calcAvarage();
        this.isPass = avarage > 55;
    }

    void calcAvarage() {
        avarage = (this.mat.note + this.fizik.note + this.kimya.note) / 3;

    }

    void printNote() {
        System.out.println("---------------------------------");
        mat.print();
        fizik.print();
        kimya.print();
        isPass();
        System.out.println(this.name + " GNO :"+this.avarage);
        System.out.println( this.isPass? "Sınıfı Geçti." : "Sınıfta Kaldı.");

    }

}
