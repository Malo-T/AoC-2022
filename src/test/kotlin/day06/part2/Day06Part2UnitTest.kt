package day06.part2

import day06.Day06
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Day06Part2UnitTest {

    private val day = Day06()

    @ParameterizedTest
    @MethodSource("provide")
    fun computePart2(input: String, expectedOutput: Int) {
        // when
        val result = day.part2(input)

        // then
        assertEquals(expectedOutput, result)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(input_d6_p2_1, result_d6_p2_1),
                Arguments.of(input_d6_p2_2, result_d6_p2_2),
                Arguments.of(input_d6_p2_3, result_d6_p2_3),
                Arguments.of(input_d6_p2_4, result_d6_p2_4),
                Arguments.of(input_d6_p2_5, result_d6_p2_5),
                Arguments.of(exercise_d6_p2, 2980),
            )
        }

    }

}
