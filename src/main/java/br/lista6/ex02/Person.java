package br.lista6.ex02;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String rg;
    private String cpf;
    private LocalDate birthDate;
    private Sex sex;

    public Person(String name, String rg, String cpf, LocalDate birthDate, Sex sex) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Sex getSex() {
        return sex;
    }
    public abstract Double calculateIncome();
}
