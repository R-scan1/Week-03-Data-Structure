package stringbuilder.stringbuilder_problem_01;

public class StringReversal {

    public static String reverseString(String text){
        StringBuilder sb=new StringBuilder();
        sb.append(text);
        return sb.reverse().toString();
    }
}
