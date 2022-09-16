package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
    public InputReader() {
    }

    public String fileReaderString(String res) throws NullPointerException{
        String text = "";
        try (Scanner scanner = new Scanner(new File(res))) {
            while (scanner.hasNext()) {
                text = scanner.nextLine();
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return text;
    }

    public ArrayList<String> fileReaderArray(String res) throws NullPointerException{
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(res))) {
            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return list;
    }
}
