class Student {
    String name;
    int age;

    void introduce() {
        System.out.println(name + " is " + age + " years old");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Hodan";
        student1.age = 21;
        student1.introduce();
        Student student2 = new Student();
        student2.name = "Naima"; 
        student2.age = 19;     
        student2.introduce();
    }
}