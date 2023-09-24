import java.time.Instant;
import java.util.Date;

public class Worker {

    //instance variables for class Worker, when an object from class Worker is created, these fields are set with value
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker() {
    }

    public int getAge() {
        int currentYear = 2023;
        return (currentYear - Integer.parseInt(birthDate.substring(6)));
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
       this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
