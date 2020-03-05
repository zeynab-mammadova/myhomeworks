package az.company.atHome.StreamExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Streamfile2 {
    public static void main(String[] args) throws IOException {
        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));
    }
}
