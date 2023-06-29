import java.security.PrivilegedAction;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        Employee Paulo = new Employee("Paulo", "15/01/2004", "04/07");
        System.out.println(Paulo);
        System.out.println("Age: " + Paulo.getAge());
        System.out.println("Pay: " + Paulo.collectPay());

        System.out.println();

       SalariedEmployee Levi = new SalariedEmployee("Levi", "19/06/1959", "01/12", 20000);
        System.out.println(Levi);
        System.out.println("Age: " + Levi.getAge());
        System.out.println("Monthly Payment: $" + Math.round(Levi.collectPay()));

        System.out.println();

        HourlyEmployee Juliana = new HourlyEmployee("Juliana", "30/10/1983", "07/08", 40);
        System.out.println(Juliana);
        System.out.println("Age: " + Juliana.getAge());
        System.out.println("Weekly Payment: $" + Math.round(Juliana.collectPay()));


    }

}
