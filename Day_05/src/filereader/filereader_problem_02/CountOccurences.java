package filereader.filereader_problem_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurences {
    public static int occurences(String target){
        int count=0;
        StringBuffer sb=new StringBuffer();
        try(BufferedReader br=new BufferedReader(new FileReader("src/sample.txt"))){
            String line;
            while((line=br.readLine())!=null){
                sb.append(line).append(" ");
            }

            String temp=sb.toString();
            String [] words=temp.split("\\s+");

        for(String string:words){
            if(string.equals(target)){
                count++;
            }
        }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }
}
