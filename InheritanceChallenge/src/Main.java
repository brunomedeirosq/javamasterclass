public class Main {

    public static void main(String[] args) {

        SalariedEmployee tim = new SalariedEmployee("Tim", "11/11/1985","01/01/2020", 40000);
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        tim.retire();
        System.out.println(tim);
        System.out.println("Pay = " + tim.collectPay());

        HourlyEmployee joe = new HourlyEmployee("Joe","25/11/1981",10);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());
        System.out.print("Double Pay = " + joe.getDoublePay());

    }

}
