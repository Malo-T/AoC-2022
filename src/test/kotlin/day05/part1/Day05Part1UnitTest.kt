package day05.part1

import day05.Day05
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Day05Part1UnitTest {

    private val day = Day05()

    @ParameterizedTest
    @MethodSource("provide")
    fun computePart1(input: String, expectedOutput: String) {
        // when
        val result = day.part1(day.parse(input))

        // then
        assertEquals(expectedOutput, result)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(input_d5_p1_1, result_d5_p1_1),
                Arguments.of(exercise_d5_p1, "RFFFWBPNS"),
            )
        }
    }

}
