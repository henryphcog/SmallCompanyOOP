public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public boolean retire() {
        if (getAge() < 64) { // Calling method from class 'Worker'
            isRetired = false;
        } else {
            isRetired = true;
        }
        return isRetired;
    }

    @Override
    public double collectPay() {
        return annualSalary / 12;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + retire() +
                "} " + super.toString();
    }
}
