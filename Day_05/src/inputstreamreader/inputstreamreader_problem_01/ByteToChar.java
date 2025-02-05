package inputstreamreader.inputstreamreader_problem_01;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteToChar {
    public static void conversion() {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("src/sample.txt"), StandardCharsets.UTF_8))) {
              String line;
              while((line=bf.readLine())!=null){
                  System.out.println(line);
              }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());        }
    }
}
