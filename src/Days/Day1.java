package Days;

import utility.InputReader;

public class Day1 {
    final static int STARTING_FLOOR = 0;
    int firstBase = 0;
    static InputReader inputReader;

    static {
        inputReader = new InputReader();
    }

    public Day1() {

        System.out.println("D1 - Santa will finish on the floor: " + processInput("resources/D1/input"));
        System.out.println("D1/2 - Santa will go to the ground on the floor: " + firstBase);
    }

    private int processInput(String relativePath) {
        inputReader.fileReader(relativePath);
        int result = STARTING_FLOOR;
        boolean ifBasementReached = false;
        for (int i = 0; i < relativePath.length(); i++) {
            switch (relativePath.charAt(i)) {
                case '(' -> result++;
                case ')' -> result--;
            }
            if (!ifBasementReached && result < 0) {
                firstBase = i + 1;
                ifBasementReached = true;
            }
        }
        return result;
    }


}
