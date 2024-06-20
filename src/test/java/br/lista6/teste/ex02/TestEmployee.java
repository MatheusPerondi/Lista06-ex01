package br.lista6.teste.ex02;

44import br.lista6.ex02.Employee;
import br.lista6.ex02.Sex;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmployee {

    @Test
    public void testCalculateIncome() {
        Employee employee1 = new Employee("John Doe", "123456", "98765432100", LocalDate.of(1980, 1, 1), Sex.MALE, 2000.0, "123456789", "CTPS1234");
        assertEquals(1780.00, employee1.calculateIncome(), 0.01);

        Employee employee2 = new Employee("Jane Doe", "123456", "98765432101", LocalDate.of(1985, 5, 5), Sex.FEMALE, 2500.00, "123456789", "CTPS1234");
        assertEquals(1977.20, employee2.calculateIncome(), 0.01);

        Employee employee3 = new Employee("Alice Smith", "123456", "98765432102", LocalDate.of(1990, 10, 10), Sex.FEMALE, 3000.00, "123456789", "CTPS1234");
        assertEquals(2295.20, employee3.calculateIncome(), 0.01);

        Employee employee4 = new Employee("Bob Johnson", "123456", "98765432103", LocalDate.of(1975, 12, 12), Sex.MALE, 4000.00, "123456789", "CTPS1234");
        assertEquals(2933.87, employee4.calculateIncome(), 0.01);

        Employee employee5 = new Employee("Charlie Brown", "123456", "98765432104", LocalDate.of(2000, 3, 3), Sex.MALE, 5000.00, "123456789", "CTPS1234");
        assertEquals(3335.64, employee5.calculateIncome(), 0.01);
    }
}
