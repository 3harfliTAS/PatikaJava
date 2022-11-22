public class MainS {
    public static void main(String[] args) {

        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FIZIK101","FIZ");
        Course kimya = new Course("Kimya","KIMYA101","KIM");

        Teacher t1 =new Teacher("Aydin","9055","MAT");
        Teacher t2 =new Teacher("Busra","9056","FIZ");
        Teacher t3 =new Teacher("Aypare","9057","KIM");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Inek Saban",4,"1401",mat,fizik,kimya,70);
        s1.addBulExamNote(50,70,40);
        s1.isPass();

        Student s2 = new Student("Pala Remzi",4,"1403",mat,fizik,kimya,100);
        s2.addBulExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Inek ",4,"1402",mat,fizik,kimya,50);
        s3.addBulExamNote(50,20,40);
        s3.isPass();


    }
}


public class Student {
    String name ;
    int stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int sozlu =0;


    public Student(String name, int stuNo, String classes, Course mat, Course fizik, Course kimya,int sozlu){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = avarage;
        this.isPass = isPass;
        this.sozlu =sozlu;

    }

  public void addBulExamNote(int mat,int fizik,int kimya){

        if(mat >= 0 && mat <=100){
            this.mat.note=mat;
        }

      if(fizik >= 0 && fizik <=100){
          this.fizik.note = (fizik * 8/10)+(sozlu * 2/10);
      }

      if(kimya >= 0 && kimya <=100){
          this.kimya.note=kimya;
      }

  }

  public void isPass( ){
        if(this.mat.note == 0 && this.fizik.note == 0 && this.kimya.note == 0 ){

            System.out.println("Notlar tam girilmemis");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama:" + this.avarage);
        }
            if(this.isPass){
                System.out.println("Sinifi gecti");
            }
            else{
                System.out.println("Sinifta kaldi");
            }
        }


    public void calcAvarage(){
        this.avarage =(this.mat.note +this.fizik.note +this.kimya.note)/3;

    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 50;
    }

    public void printNote(){

        System.out.println("============");
        System.out.println("Ogrenci:"+ this.name);
        System.out.println("Ogrenci: MAT:"+ this.mat.note);
        System.out.println("Ogrenci:Fizik:"+ this.fizik.note);
        System.out.println("Ogrenci:Kimya"+ this.kimya.note);

    }


}


public class Teacher {

    String name,mpno,branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}


public class Course {
        Teacher courseTeacher;
        String name;
        String code;
        String prefix;
        int note;
        int sozlu;

    public Course(String name, String code, String prefix) {
        this.courseTeacher = courseTeacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            System.out.println("Islem basarili");
        }
        else {
            System.out.println(t.name +" Akademisyeni bu dersi veremez");
        }
    }

    public void printTeacher(){
        if(courseTeacher !=null){
            System.out.println(this.name+"dersin Akademisyeni"+courseTeacher.name);
        }
        else{
            System.out.println(this.name+"dersine Akademisyen atanmamistir");
        }
    }
}





