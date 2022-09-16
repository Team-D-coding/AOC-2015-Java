import Days.Day1;
import enums.Day1Enums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static Days.Day2.processInput;

public class Day2Test {

    @ParameterizedTest
    @ValueSource(strings = {"input1:58", "input2:43"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
        Assertions.assertEquals(processInput(inputFile), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {})
    void checkSecondPart(String files) {
        String inputFile = "test-resources/D2/" + files.split(":")[0];
//        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.BASEMENT_FIRST), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"input:1598415:1795"})
    void checkOriginalInput(String files) {
        String inputFile = "resources/D2/" + files.split(":")[0];
        Assertions.assertEquals(processInput(inputFile), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
//        Assertions.assertEquals(Day1.processInput(inputFile).get(Day1Enums.BASEMENT_FIRST), Integer.parseInt(files.split(":")[2]), "Expected result is not correct");
    }
}
