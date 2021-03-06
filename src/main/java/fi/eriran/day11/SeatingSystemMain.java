package fi.eriran.day11;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day11.calculation.OccupiedSeatCounter;
import fi.eriran.day11.calculation.evolution.SeatStateAdjacentEvolver;
import fi.eriran.day11.calculation.evolution.SeatStateLineOfSightEvolver;
import fi.eriran.day11.parser.SeatMapParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SeatingSystemMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () ->
                        "Part one occupied seat count: "
                                + new OccupiedSeatCounter().count(
                                new SeatStateAdjacentEvolver().createEvolved(
                                        new SeatMapParser().parse(
                                                new LineInputParserProxy().parse("Day11Input")
                                        )
                                )
                        )
        );

        logger.log(
                Level.INFO,
                () -> "Part two occupied seat count: "
                        + new OccupiedSeatCounter().count(
                        new SeatStateLineOfSightEvolver().createEvolved(
                                new SeatMapParser().parse(
                                        new LineInputParserProxy().parse("Day11Input")
                                )
                        )
                ));
    }
}
