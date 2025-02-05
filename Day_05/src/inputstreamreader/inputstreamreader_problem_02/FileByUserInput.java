package inputstreamreader.inputstreamreader_problem_02;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileByUserInput {


        public static void inputStreamToFile(){
            String fileName = "demo.txt";

            try (
                    InputStreamReader isr = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(isr);
                    FileWriter fw = new FileWriter(fileName, true);
                    BufferedWriter bw = new BufferedWriter(fw);
            ) {
                System.out.println("Enter text which you want to add to file (type exit whenever you want to stop) :");
                String userInput;

                while (true) {
                    userInput = br.readLine();
                    if ("exit".equalsIgnoreCase(userInput)) {
                        break;
                    }
                    bw.write(userInput);
                    bw.newLine();
                }

                System.out.println("Given text has been saved in file " + fileName);
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }


}
