package cesul.br.ex02;

import java.time.LocalDate;

public class Employee extends Person {
    private Double salary;
    private String pis;
    private String ctps;

    public Employee(String name, String rg, String cpf, LocalDate birthDate, Sex sex, Double salary, String pis, String ctps) {
        super(name, rg, cpf, birthDate, sex);
        this.salary = salary;
        this.pis = pis;
        this.ctps = ctps;
    }

    @Override
    public Double calculateIncome() {
        double inss = salary * 0.11;
        double incomeTax = 0.0;

        if (salary <= 2259.20) {
            incomeTax = 0.0;
        } else if (salary <= 2826.65) {
            incomeTax = salary * 0.075 - 142.80;
        } else if (salary <= 3751.05) {
            incomeTax = salary * 0.15 - 354.80;
        } else if (salary <= 4664.68) {
            incomeTax = salary * 0.225 - 636.13;
        } else {
            incomeTax = salary * 0.275 - 869.36;
        }

        return salary - inss - incomeTax;
    }

    public Double getSalary() {
        return salary;
    }

    public String getPis() {
        return pis;
    }

    public String getCtps() {
        return ctps;
    }
}
