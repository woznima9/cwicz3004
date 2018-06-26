package ksiazkajavapodstawyhorstmann;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        Employee bob = new Employee("Bartosz Borkowski", 50000, 1989, 10, 1);
        Employee alice1 = new Employee("Alicja Adamczuk", 75000, 1987, 12, 15);
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Karol Krakowski", 80000, 1987, 12, 15));
        staff.add(new Employee("Henryk Kwiatek", 50000, 1989, 10, 1));
        staff.add(new Employee("Waldemar Kowalski", 40000, 1990, 3, 15));
        showStaff(staff);

        for (Employee emp : staff) {
            emp.raiseSalary(5);
        }
        showStaff(staff);
        for (Employee emp : staff) {
            emp.raiseSalary(5);
        }

        System.out.println(staff.get(1).getName());
        staff.add(1, alice1);
        staff.add(bob);
        staff.add(5, alice1);


        showStaff(staff);
        System.out.println();
        double pracownik = staff.get(0).getSalary();
        System.out.println(pracownik);

        alice1.raiseSalary(7);
        showStaff(staff);
        for (Employee empl : staff) {
            empl.raiseSalary(9);
        }
        showStaff(staff);
        Employee usuniety = staff.remove(1);
        System.out.println("usuniety " +usuniety);
        showStaff(staff);

    }
    //psvm

    private static void showStaff(ArrayList<Employee> staff) {
        for (Employee emp : staff) {
            System.out.println(emp.getName() + " " + emp.getSalary());
        }
        System.out.println(" ");
    }

}
