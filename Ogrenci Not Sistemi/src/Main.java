public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Umut", "0534 234 23 23", "Mat" );
        Teacher t2 = new Teacher("Kaan", "0534 345 45 45", "Fizik" );
        Teacher t3 = new Teacher("Kutluhan", "0534 987 83 83", "Kimya" );

        Course mat= new Course("Mat", "FZK101", "FZK");
        Course fizik= new Course("Fizik", "FZK101", "FZK");
        Course kimya= new Course("Kimya", "FZK101", "FZK");

        mat.Teacher(t1);
        fizik.Teacher(t2);
        kimya.Teacher(t3);

        Student s1 = new Student("Esma", "20160601111", 4, mat, fizik, kimya);
        s1.addBulkExamNote(mat.notlar(37,57), fizik.notlar(39,69), kimya.notlar(60,50));
        s1.printNote();

        Student s2 = new Student("Yakup", "20160601234", 4, mat, fizik, kimya);
        s2.addBulkExamNote(mat.notlar(39,67), fizik.notlar(40,100), kimya.notlar(65,90));
        s2.printNote();

        Student s3 = new Student("Ayşegül", "20160601324", 4, mat, fizik, kimya);
        s3.addBulkExamNote(mat.notlar(100,67), fizik.notlar(100,100), kimya.notlar(100,90));
        s3.printNote();

    }
}