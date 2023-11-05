package ReadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileReader {


   public void readFile(){
       String filePath="C://jdj";
       try {
           Path path= Paths.get(filePath);

           List<String> lines= Files.readAllLines(path);
           for(String line:lines) {
              System.out.println(line);
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

   }

}
