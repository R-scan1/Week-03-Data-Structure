package stringbuilder.stringbuilder_problem_02;

public class Main {
    public static void main(String[] args) {
        String text="aaeerrfdcdafg";
        DuplicateRemover duplicateRemover=new DuplicateRemover();
        String result=duplicateRemover.removeDuplicate(text);
        System.out.println("Original String :"+text+"\nString without :"+result);
    }
}
