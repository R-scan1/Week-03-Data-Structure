package filereader.filereader_problem_02;

public class Main {
    public static void main(String[] args) {
        String target="text";
        int count=CountOccurences.occurences(target);
        System.out.println("Number of occurences of word "+target+" in file is "+count  );
    }
}
