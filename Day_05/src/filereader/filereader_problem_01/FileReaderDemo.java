package filereader.filereader_problem_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
     public static void fileReader(){

         try(BufferedReader br=new BufferedReader(new FileReader("src/sample.txt"))){
             String line;
             while ((line=br.readLine())!=null){
                 System.out.println(line);
             }
         }catch (IOException e){
             e.printStackTrace();
         }
     }
}
