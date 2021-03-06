package fi.eriran.day2;

import fi.eriran.day2.philosopher.PasswordPhilosopherPartOne;
import fi.eriran.day2.philosopher.PasswordPhilosopherPartTwo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PasswordPhilosopherMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () -> "Part one valid passwords: " +
                        new PasswordPhilosopherPartOne().countValidPasswords("day2Input")
        );

        logger.log(
                Level.INFO,
                () -> "Part two valid passwords: " +
                        new PasswordPhilosopherPartTwo().countValidPasswords("day2Input")
        );
    }
}
