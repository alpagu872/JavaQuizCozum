public class Employee {
    public static int count;
    private String name;
    private int Salary;
    private Boolean isActive;

    public Employee(String name, int salary, Boolean isActive) {
        count++;
        this.name = name;
        Salary = salary;
        this.isActive = isActive;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
