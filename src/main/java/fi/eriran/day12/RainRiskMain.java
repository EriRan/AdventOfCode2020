package fi.eriran.day12;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day12.calculation.ManhattanCalculator;
import fi.eriran.day12.calculation.flight.FlightPathCalculator;
import fi.eriran.day12.parser.DirectionCommandParser;

public class RainRiskMain {

    public static void main(String[] args) {
        System.out.println(
                "Part one manhattan distance is: "
                + new ManhattanCalculator().calculate(
                        new FlightPathCalculator().calculate(
                                new DirectionCommandParser().parse(
                                        new LineInputParserProxy().parse("Day12Input")
                                )
                        )
                )
        );
    }
}
