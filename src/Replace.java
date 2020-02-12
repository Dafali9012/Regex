import java.nio.file.Files;
import java.nio.file.Paths;

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
        return "\n"+hej_1.replaceAll("(?:[\\d]+|[\\n](?=\\n))", "@");
    }
}
