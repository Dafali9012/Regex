import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Replace {
    private static String hej_1;
    private static String hej_2;

    static {
        try {
            hej_1 = Files.readString(Paths.get("replacements/hej_1"));
            hej_2 = Files.readString(Paths.get("replacements/hej_2"));
        } catch (Exception e) {e.printStackTrace();}
    }

    public static String replace_1() {
        /* Daniel: fungerar fin fint :) */
        return  hej_1.replaceAll("\\d+|\\s(?=\\s)", "");
    }

    public static String replace_2() {
        String result = Stream.of(hej_2.replaceAll("[ ]+", " ")
        .split("\\n"))
        .map(s -> s.trim())
        .collect(Collectors.joining("\n"));
        return result;
    }
}
