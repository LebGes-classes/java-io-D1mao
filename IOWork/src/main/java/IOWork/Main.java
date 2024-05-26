package IOWork;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    private static void writeJsonToFile(JSONObject jsonObject, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static JSONObject readJsonFromFile(String filePath) {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            String jsonString = lines.collect(Collectors.joining());
            return new JSONObject(jsonString.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.readFromExcel("C:\\jaba\\java2\\IOWork\\journal.xlsx");

        JSONObject json = journal.toJson();
        System.out.println("JSON: " + json.toString());

        writeJsonToFile(json, "journal.json");

        JSONObject jsonFromFile = readJsonFromFile("journal.json");

        System.out.println(jsonFromFile);
    }
}
