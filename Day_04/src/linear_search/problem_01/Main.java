package linear_search.problem_01;

public class Main {
    public static void main(String[] args) {
        int [] arr={0,1,3,2,3,7,5,4};
        int index=FirstNegativeNumber.findIndex(arr);
        if(index<0){
            System.out.println("Negative integer not found!!!");
        }else{
            System.out.println("Index of first negative integer in Array is :"+index);
        }
    }

}
