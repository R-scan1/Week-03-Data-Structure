package linear_search.problem_02;

public class Main {
    public static void main(String[] args) {
        String [] sentences={"Hi there","How are you","Do you study","Keep moving forward","Learn for yourself","Be positive"};
        String target="positive";
        String result=SearchWord.findSentence(sentences,target);
        if(result!=null){
            System.out.println("Sentence that have word "+target+" is :"+result);
        }
        else{
            System.out.println("Word Not Found");
        }
    }
}
