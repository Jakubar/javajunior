package my.employee.model;
import java.util.Date;
import java.time.LocalDate;
import java.time.Month;

public class Employee {

    private String name;
    private String surname;
    private int yearStartWork;
    private int yearCurrent;
    private double sallary;


    public Employee(){

    }

    public Employee(String name, String surname, int yearStartWork, double sallary){
        this.name = name;
        this.surname = surname;
        this.yearStartWork = yearStartWork;
        this.sallary = sallary;
    }

    public int getDateOfWork(){ return yearCurrent - yearStartWork;}

    public void setName(String name){ this.name = name; }
    public String getName(String name){ return name; }

    public void setSurname(String surname){ this.surname = surname; }
    public String getSurname(String surname){ return surname;}

    public void setYearStartWork(int yearStartWork){ this.yearStartWork = yearStartWork; }
    public int getYearStartWork(int yearStartWork){ return yearStartWork; }

    public void setYearCurrent(int yearCurrent){
        LocalDate currentdate = LocalDate.now();
        yearCurrent = currentdate.getYear();
        this.yearCurrent = yearCurrent;
    }
    public int getYearCurrent(int yearCurrent){ return yearCurrent;}

    public void setSallary(double sallary){ this.sallary = sallary; }
    public double getSallary(double sallary){ return sallary; }



}
