package fi.eriran.day11.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day11.calculation.evolution.SeatStateAdjacentEvolver;
import fi.eriran.day11.parser.SeatMapParser;
import fi.eriran.day11.pojo.seat.SeatMap;
import fi.eriran.day11.util.SeatMapStringifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OccupiedSeatCounterTest {

    @Test
    void example() {
        SeatMap originalSeatMap = new SeatMapParser().parse(new LineInputParserProxy().parse("Day11TestInput"));
        System.out.println("Original: \n" + new SeatMapStringifier().print(originalSeatMap));
        new SeatMapStringifier().print(originalSeatMap);
        SeatMap evolvedMap = new SeatStateAdjacentEvolver()
                .createEvolved(
                        originalSeatMap
                );
        System.out.println("Evolved: \n" + new SeatMapStringifier().print(evolvedMap));
        assertEquals(37, new OccupiedSeatCounter().count(evolvedMap));
    }
}