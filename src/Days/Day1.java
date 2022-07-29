package Days;

import enums.Day1Enums;
import utility.InputReader;

import java.util.HashMap;
import java.util.Map;

import static enums.Day1Enums.BASEMENT_FIRST;
import static enums.Day1Enums.END_FLOOR;

public class Day1 {
    final static int STARTING_FLOOR = 0;
    static InputReader inputReader;

    static {
        inputReader = new InputReader();
    }

    public Day1() {

        Map<Day1Enums, Integer> resolution = processInput("resources/D1/input");
        System.out.println("D1 - Santa will finish on the floor: " + resolution.get(END_FLOOR));
        System.out.println("D1/2 - Santa will go to the ground on the floor: " + resolution.get(BASEMENT_FIRST));
    }

    public Map<Day1Enums, Integer> processInput(String relativePath) {
        int firstBase = 0;
        Map<Day1Enums, Integer> result = new HashMap<>();
        String fileContent = inputReader.fileReader(relativePath);
        int currentFloor = STARTING_FLOOR;
        boolean ifBasementReached = false;
        for (int i = 0; i < fileContent.length(); i++) {
            switch (fileContent.charAt(i)) {
                case '(' -> currentFloor++;
                case ')' -> currentFloor--;
            }
            if (!ifBasementReached && currentFloor < 0) {
                firstBase = i + 1;
                ifBasementReached = true;
                result.put(BASEMENT_FIRST, firstBase);
            }
        }
        result.put(END_FLOOR, currentFloor);
        return result;
    }


}
