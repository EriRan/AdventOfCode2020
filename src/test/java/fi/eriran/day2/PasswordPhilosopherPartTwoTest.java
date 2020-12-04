package fi.eriran.day2;

import com.google.common.io.Resources;
import fi.eriran.day2.philosopher.PasswordPhilosopherPartTwo;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PasswordPhilosopherPartTwoTest {

    @Test
    void sameResultAsExample() throws IOException {
        assertEquals(
                1,
                new PasswordPhilosopherPartTwo().countValidPasswords(Resources.getResource("day2TestInput"))
        );
    }
}