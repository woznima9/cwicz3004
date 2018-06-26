package ksiazkajavapodstawyhorstmann;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar= new GregorianCalendar(year, month-1,day);
        this.hireDay = calendar.getTime();
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

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary (double byPercent) {
        double raise = salary*byPercent/100;
        salary +=raise;
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null) return false;
        if (getClass()!= obj.getClass()) return false;
        Employee other = (Employee)obj;
        return Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
