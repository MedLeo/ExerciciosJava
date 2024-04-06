package EmployeeEntities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() { //calculo salário líquido
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) { //calculo aumento salarial com % fornecida
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String toString() { //retorno String com o bônus
        return name + ", $ " + String.format("%.2f", netSalary());
    }


}
