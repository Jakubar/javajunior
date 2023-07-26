package my.employee;
import java.time.LocalDate;
import java.time.Month;

import my.employee.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("John", "Johnson", 1996, 20.000  );
        System.out.println("Work for:" + employeeOne.getDateOfWork());

        LocalDate currentdate = LocalDate.now();
        int currentYear = currentdate.getYear();
        System.out.println("Current month: "+currentYear);
    }

}