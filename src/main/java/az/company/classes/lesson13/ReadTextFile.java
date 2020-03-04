package az.company.classes.lesson13;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ReadTextFile {
        public static void main(String[] args) throws IOException {
            Path path = Paths.get("./data", "subj_verb.txt");
            HashMap<String, List<String>> sentence= (HashMap<String, List<String>>) Files.readAllLines(path, StandardCharsets.UTF_8);

        }
    }

