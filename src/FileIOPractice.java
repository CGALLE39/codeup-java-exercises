import util.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.ArrayList;


public class FileIOPractice {
    public static void main(String[] args) {
        Input in = new Input();
        Path filepath = Paths.get("data", "movies-to-watch.txt");
        List<String> lines;
        try {
            lines = Files.readAllLines(filepath);
            String movieName = in.getString("give me a MOVIE");
            String movieGenre = in.getString("gimmie the genre");
            int number = lines.size() + 1;
            String lineForFile = String.format("%d. %s", number, movieName);
            Files.write(filepath, Arrays.asList(lineForFile), StandardOpenOption.APPEND);
            lines.add(lineForFile);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

            ////// create new file/directory path
            try {
                Files.createFile(filepath);
            } catch (IOException o) {
                o.printStackTrace();
                try {
                    Files.createDirectory(filepath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }



/// ADD TO DATA
//            try {
//            Files.write(filepath, Arrays.asList("8. Shutter Island"), StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
            // create new repo
//            Path newDirectory(Paths.get(" ""test"));
//            try {
//                Files.createDirectory(newDirectory);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}