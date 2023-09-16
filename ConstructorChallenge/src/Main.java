public class Main {

    public static void main(String[] args) {
        Customer bruno = new Customer();

        System.out.println(bruno.getName());
        System.out.println(bruno.getCreditLimit());
        System.out.println(bruno.getEmailAddress());

        Customer cristina = new Customer("Cristina",200.123,"cristina@gmail.com");
        System.out.println(cristina.getName());
        System.out.println(cristina.getCreditLimit());
        System.out.println(cristina.getEmailAddress());

        Customer maria = new Customer("Maria","maria@gmail.com");
        System.out.println(maria.getName());
        System.out.println(maria.getCreditLimit());
        System.out.println(maria.getEmailAddress());
    }
}
