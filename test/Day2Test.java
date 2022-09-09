import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Day2Test {

    @ParameterizedTest
    @ValueSource(strings = {"input1:58", "input2:43"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
//        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.END_FLOOR), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {})
    void checkSecondPart(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
//        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.BASEMENT_FIRST), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }
}
