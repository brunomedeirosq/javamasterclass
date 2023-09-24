public class Main extends Object {

    public static void main(String[] args) {
        Student max = new Student("Max", 14);
        System.out.println(max.toString());
        System.out.println(max);

        PrimarySchoolStudent joe = new PrimarySchoolStudent("Joe", 12, "Bruno");
        System.out.println(joe);
    }

}

class Student {

    //instance variables
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return name + " " + age;

//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {

    String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name,age);
        this.parentName = parentName;
    }

    public PrimarySchoolStudent(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}


