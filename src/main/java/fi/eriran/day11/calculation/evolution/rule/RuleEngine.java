package fi.eriran.day11.calculation.evolution.rule;

import fi.eriran.day11.calculation.evolution.rule.adjacent.AdjacentCalculator;
import fi.eriran.day11.pojo.Position;
import fi.eriran.day11.pojo.seat.SeatMap;

public class RuleEngine {

    private final AdjacentCalculator adjacentCalculator;

    public RuleEngine() {
        adjacentCalculator = new AdjacentCalculator();
    }

    public boolean shouldBecomeOccupied(SeatMap previousState, int x, int y, Position currentPosition) {
        return Position.EMPTY_SEAT.equals(currentPosition)
                && !hasAdjacentOccupied(previousState, x, y);
    }

    public boolean shouldBecomeEmpty(SeatMap previousState, int x, int y, Position currentPosition) {
        return Position.OCCUPIED_SEAT.equals(currentPosition)
                && hasFourOrMoreAdjacentOccupied(previousState, x, y);
    }

    private boolean hasAdjacentOccupied(SeatMap seatMap, int x, int y) {
        return adjacentCalculator.hasAdjacentOccupied(seatMap, x, y);
    }

    private boolean hasFourOrMoreAdjacentOccupied(SeatMap seatMap, int x, int y) {
        return adjacentCalculator.countAdjacentOccupied(seatMap, x, y) >= 4;
    }
}