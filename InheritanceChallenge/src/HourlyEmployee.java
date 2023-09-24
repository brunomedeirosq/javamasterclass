public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, double hourlyPayRate) {
        super(name, birthDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return collectPay()*2;
    }

    @Override
    public double collectPay() {
        return hourlyPayRate*40;
    }
}
