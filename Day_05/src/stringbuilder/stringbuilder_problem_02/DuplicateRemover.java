package stringbuilder.stringbuilder_problem_02;

import java.util.HashSet;

public class DuplicateRemover {

    public String removeDuplicate(String text){
        StringBuilder sb=new StringBuilder();
        HashSet <Character> hs=new HashSet<>();
        for(char ch:text.toCharArray()){
            if(!hs.contains(ch)){
                hs.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
