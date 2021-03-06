package fi.eriran.day1;

import fi.eriran.common.parser.IntegerInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportRepairMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Integer> input = new IntegerInputParserProxy().parse("day1Input");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new ReportRepairerTwoPair().repair(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: " + new ReportRepairerThreePair().repair(input)
        );
    }
}
