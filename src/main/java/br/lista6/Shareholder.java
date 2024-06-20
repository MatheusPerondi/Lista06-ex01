package cesul.br.ex02;

import cesul.br.ex02.Person;
import cesul.br.ex02.Sex;

import java.time.LocalDate;

public class Shareholder extends Person {
    private Double shareValue;
    private Integer numberOfShares;
    private Double participationPercentage;

    public Shareholder(String name, String rg, String cpf, LocalDate birthDate, Sex sex, Double shareValue, Integer numberOfShares, Double participationPercentage) {
        super(name, rg, cpf, birthDate, sex);
        this.shareValue = shareValue;
        this.numberOfShares = numberOfShares;
        this.participationPercentage = participationPercentage;
    }

    @Override
    public Double calculateIncome() {
        double capital = shareValue * numberOfShares;
        double income = 0.0;

        if (participationPercentage <= 25.0) {
            income = capital * 0.01;
        } else if (participationPercentage <= 50.0) {
            income = capital * 0.05;
        } else {
            income = capital * 0.10;
        }

        return income;
    }

    public Double getShareValue() {
        return shareValue;
    }

    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    public Double getParticipationPercentage() {
        return participationPercentage;
    }
}
