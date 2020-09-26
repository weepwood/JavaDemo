package c4;


import java.time.LocalDate;

/**
 * @author lanqilu
 * @date Created in 2020/09/26  16:01
 * @description
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", (double) 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", (double) 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", (double) 40000, 1990, 3, 15);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}


class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, Double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
