package fi.eriran.day13;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day13.calculation.EarliestBuslineResponseHandler;
import fi.eriran.day13.calculation.earliest.EarliestBuslineFinder;
import fi.eriran.day13.parser.TimetableParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShuttleSearch {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(Level.INFO,
                () -> "Part one result: " + new EarliestBuslineResponseHandler().handle(
                        new EarliestBuslineFinder().find(
                                new TimetableParser().parse(
                                        new LineInputParserProxy().parse("Day13Input")
                                )
                        )
                )
        );
    }
}
