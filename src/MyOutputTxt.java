import java.io.FileWriter;
import java.io.IOException;

public class MyOutputTxt {
    public static void WriterMethod(String writeMe) {
        try(FileWriter fw = new FileWriter("src/txtFiles/output.txt", false)) {
            fw.write(writeMe);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
