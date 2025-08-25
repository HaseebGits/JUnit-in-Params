import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentScoreTest {

    @ParameterizedTest
    @CsvSource({
            "50, 50, 2500",
            "-10, 50, -1",
            "50, -5, -1",
            "-1, -1, -1",
            "150, 50, -1",
            "50, 150, -1",
            "150, 150, -1"
    })
    void studentScoreCalculator(int mathScore, int computerScore, int expectedScore) {
        StudentScore score = new StudentScore();
        score.calculateSatScore(mathScore, computerScore);
        assertEquals(expectedScore, score.getSatScore());
    }
}
