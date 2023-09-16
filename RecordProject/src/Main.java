public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(Integer.toString(i),
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "25-11-1981",
                    "Java Masterclass");
            System.out.println(s.toString());
            //since we have toString() implemented on our Student class sout will call toString implicitly without calling the s.toString()
            System.out.println(s);

        }

        Student pojoStudent = new Student("student 1","Maria","01/08/2012","music class");
        LPAStudent recordStudent = new LPAStudent("student 2","Miguel","09/02/2016","music class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName());
        System.out.println(recordStudent.name());

        pojoStudent.setId("student 1000");
//        recordStudent.id("student 2000");

        System.out.println(pojoStudent.getId());
        System.out.println(recordStudent.id());

    }
}
