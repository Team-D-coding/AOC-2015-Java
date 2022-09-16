package Days;

import enums.Day2Enums;
import utility.InputReader;

import java.lang.reflect.Array;
import java.util.*;

import static enums.Day2Enums.WRAP_NEED;

public class Day2 {
    static InputReader inputReader;

    static {
        inputReader = new InputReader();
    }

    public Day2() {
        int resolution = processInput("resources/D2/input");
        System.out.println("D2 - The needed Wrap is: " + resolution);
//        System.out.println("D3/2 - The needed String is: " + resolution.get(STRING_NEED));
    }

    public static int processInput(String relativePath) {
        int resolution = 0;
        ArrayList<String> input = inputReader.fileReaderArray(relativePath);
        for (String line : input) {
            resolution += calculateSurface(line);
        }
        return resolution;
    }

    private static int calculateSurface(String line) {
        int result = 0;
        int[] edgesArray = Arrays.stream(line.split("x")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> edges = new ArrayList<>();
        Collections.addAll(edges, Arrays.stream(edgesArray).boxed().toArray(Integer[]::new));
        edges.sort(Comparator.naturalOrder());
        result = 2 * edges.get(0) * edges.get(1) + 2 * edges.get(1) * edges.get(2) + 2 * edges.get(0) * edges.get(2) + edges.get(0) * edges.get(1);
        return result;
    }

}
