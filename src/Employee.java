public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax = 1;
    double overtimeFee = 0;
    double salaryIncrease = 0;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (this.salary > 1000) {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.overtimeFee += (this.workHours - 40) * 30;
        }
    }

    void raiseSalary() {
        if (2021 - this.hireYear < 9) {
            this.salaryIncrease = 0.05;
        } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear <= 19) {
            this.salaryIncrease = 0.1;
        } else if (2021 - this.hireYear >= 20) {
            this.salaryIncrease = 0.15;
        } else {
            System.out.println(this.name + " is not eligible for a raise.");
        }
    }

//    void salaryCalculation() {
//        this.salary = (this.salary * this.salaryIncrease + this.overtimeFee) - this.tax;
//    }

    void print() {
        System.out.println("Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + this.tax + "\n" +
                "Overtime Fees: " + this.overtimeFee + "\n" +
                "Salary Increase: " + (this.salary * this.salaryIncrease) + "\n" +
                "Salary + Overtime Fees after Tax Deductions: " + (this.salary + this.overtimeFee - this.tax) + "\n" +
                "Total Salary: " + (this.salary + (this.salary * this.salaryIncrease + this.overtimeFee) - this.tax));
    }
}
