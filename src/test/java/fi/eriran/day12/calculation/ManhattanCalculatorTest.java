package fi.eriran.day12.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day12.calculation.flight.direct.DirectFlightPathCalculator;
import fi.eriran.day12.calculation.flight.waypoint.WaypointFlightPathCalculator;
import fi.eriran.day12.parser.DirectionCommandParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanCalculatorTest {

    @Test
    void examplePartOne() {
        assertEquals(
                25,
                new ManhattanCalculator().calculate(
                        new DirectFlightPathCalculator().calculate(
                                new DirectionCommandParser().parse(
                                        new LineInputParserProxy().parse("Day12TestInput")
                                )
                        )
                )
        );
    }

    @Test
    void examplePartTwo() {
        assertEquals(
                286,
                new ManhattanCalculator().calculate(
                        new WaypointFlightPathCalculator().calculate(
                                new DirectionCommandParser().parse(
                                        new LineInputParserProxy().parse("Day12TestInput")
                                )
                        )
                )
        );
    }
}