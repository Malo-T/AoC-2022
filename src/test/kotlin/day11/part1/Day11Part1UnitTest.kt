package day11.part1

import day11.Day11
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Day11Part1UnitTest {

    private val day = Day11()

    @ParameterizedTest
    @MethodSource("provide")
    fun computePart1(input: String, expectedOutput: Int) {
        // when
        val result = day.part1(day.parse1(input))

        // then
        assertEquals(expectedOutput, result)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(input_d11_p1_1, result_d11_p1_1),
                Arguments.of(input_d11_p1_2, result_d11_p1_2),
                Arguments.of(input_d11_p1_3, result_d11_p1_3),
                Arguments.of(exercise_d11_p1, -1),
            )
        }

    }

}
