package ex02;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Shareholder {

    @Test
    public void testCalculateIncome() {
        Shareholder shareholder1 = new Shareholder("John Doe", "123456", "98765432100", LocalDate.of(1980, 1, 1), Sex.MALE, 100.00, 100, 10.0);
        assertEquals(100.00, shareholder1.calculateIncome(), 0.01);

        Shareholder shareholder2 = new Shareholder("Jane Doe", "123456", "98765432101", LocalDate.of(1985, 5, 5), Sex.FEMALE, 100.00, 100, 30.0);
        assertEquals(500.00, shareholder2.calculateIncome(), 0.01);

        Shareholder shareholder3 = new Shareholder("Alice Smith", "123456", "98765432102", LocalDate.of(1990, 10, 10), Sex.FEMALE, 100.00, 100, 60.0);
        assertEquals(1000.00, shareholder3.calculateIncome(), 0.01);
    }
}
