import Days.Day1;
import enums.Day1Enums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utility.InputReader;

import static Days.Day1.*;

@DisplayName("Testing the Day1 class")
class Day1Test {
    InputReader inputReader;
    Day1 day1;

    @BeforeEach
    void init() {
        inputReader = new InputReader();
//        day1 = new Day1();
    }

    @ParameterizedTest
    @ValueSource(strings = {"input1:3", "input2:0", "input3:0", "input4:3", "input5:3", "input6:-1", "input7:-1", "input8:-3", "input9:-3"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D1/" + files.split(":")[0];
        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.END_FLOOR), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"input10:1", "input11:5"})
    void checkSecondPart(String files) {
        String inputFile = "test-resources/D1/" + files.split(":")[0];
        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.BASEMENT_FIRST), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"input:74:1795"})
    void checkOriginalInput(String files) {
        String inputFile = "resources/D1/" + files.split(":")[0];
        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.END_FLOOR), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
        Assertions.assertEquals(processInput(inputFile).get(Day1Enums.BASEMENT_FIRST), Integer.parseInt(files.split(":")[2]), "Expected result is not correct");
    }
}
