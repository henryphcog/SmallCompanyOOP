public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 0;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() { // method overriding
        return "Employee{" +
                "employeeNumber=" + employeeNo +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

}
