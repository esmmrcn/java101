public class Course {
    String name;
    String code;
    String prefix;
    double note;
    int sozluNotu;
    int sinavNotu;
    Teacher courseTeacher;

    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
    }

    void Teacher (Teacher t1){
        if(t1.branch.equals(this.name)){
            this.courseTeacher = t1;
            System.out.println("Akademisyen " +this.name+ " kursuna eklendi.");
        }else{
            System.out.println("Akademisyen bu dersi veremez.");
        }
    }


    double notlar(int sozluNotu, int sinavNotu){
        this.sozluNotu=sozluNotu;
        this.sinavNotu=sinavNotu;

        if(this.name.equals("Mat"))
            this.note= (40*sozluNotu + 70*sinavNotu)/100;
        else if(this.name.equals("Fizik"))
            this.note= (30*sozluNotu + 70*sinavNotu)/100;
        else if(this.name.equals("Kimya"))
            this.note= (20*sozluNotu + 70*sinavNotu)/100;

        return this.note;
    }

    public void print(){
        System.out.println(this.name + " not ortalaması : "+ this.note);
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
