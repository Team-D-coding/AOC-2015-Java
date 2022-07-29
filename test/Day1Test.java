import Days.Day1;
import enums.Day1Enums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import utility.InputReader;


@DisplayName("Testing the Day1 class")
class Day1Test {
    InputReader inputReader;
    Day1 day1;

    @BeforeEach
    void init() {
        inputReader = new InputReader();
        day1 = new Day1();
    }

    @ParameterizedTest
    @ValueSource(strings = {"input1:0", "input2:0", "input3:3", "input4:3", "input5:3", "input6:-1", "input7:-1", "input8:-3", "input9:-3"})
    void checkFirstPart(String files) {
        String inputFile = "test-resources/D1/" + files.split(":")[0];
        String text = inputReader.fileReader(inputFile);
        Assertions.assertEquals(day1.processInput(text).get(Day1Enums.END_FLOOR), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }

    @ParameterizedTest
    @ValueSource(strings = {"input10:1", "input11:5"})
    void checkSecondPart(String files) {
        String inputFile = "test-resources/D1/" + files.split(":")[0];
        String text = inputReader.fileReader(inputFile);
        Assertions.assertEquals(day1.processInput(text).get(Day1Enums.BASEMENT_FIRST), Integer.parseInt(files.split(":")[1]), "Expected result is not correct");
    }
}
