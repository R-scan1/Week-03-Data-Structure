package stringbuffer.stringbuffer_problem_01;

public class StringConcatenate {
    public static String concatenate(String[] arr) {
        StringBuffer sb=new StringBuffer();
        for(String str:arr){
           sb.append(str);
           sb.append(" ");
        }
        return sb.toString();
    }
}
