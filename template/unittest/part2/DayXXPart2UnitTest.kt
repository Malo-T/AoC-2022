package day{d2}.part2

import day{d2}.Day{d2}
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class Day{d2}Part2UnitTest {

    private val day = Day{d2}()

    @ParameterizedTest
    @MethodSource("provide")
    fun computePart2(input: String, expectedOutput: Int) {
        // when
        val result = day.part2(day.parse2(input))

        // then
        assertEquals(expectedOutput, result)
    }

    companion object {
        @JvmStatic
        fun provide(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(input_d{d1}_p2_1, result_d{d1}_p2_1),
                Arguments.of(input_d{d1}_p2_2, result_d{d1}_p2_2),
                Arguments.of(input_d{d1}_p2_3, result_d{d1}_p2_3),
                Arguments.of(exercise_d{d1}_p2, -1),
            )
        }
    }

}
