package fi.eriran.day8.runtime;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day8.parser.InstructionParser;
import fi.eriran.day8.pojo.InstructionRunnerResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InstructionRunnerTest {

    @Test
    void example() {
        InstructionRunnerResponse runnerResponse = new InstructionRunner().findAccumulatorValueAtInfiniteLoop(
                new InstructionParser().parse(new LineInputParserProxy().parse("Day8TestInput"))
        );
        assertTrue(runnerResponse.isRanIntoInfiniteLoop());
        assertEquals(
                5,
                runnerResponse.getFinalAccumulatorValue()
        );
    }
}