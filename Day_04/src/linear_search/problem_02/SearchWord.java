package linear_search.problem_02;

public class SearchWord {
    public static String findSentence(String [] sentences,String target){
        for(int i=0;i<sentences.length;i++){
            String [] temp=sentences[i].split("\\s+");
            for(int j=0;j< temp.length;j++){
                if(temp[j].equalsIgnoreCase(target)){
                    return sentences[i];
                }
            }
        }
      return null;
    }
}
