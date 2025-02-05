package linear_search.problem_01;

public class FirstNegativeNumber {
    public static int findIndex(int [] arr){
        int index=-1;
        if(arr.length==0){
            return index;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                index=i;
                return index;
            }
        }
        return index;
    }
}
