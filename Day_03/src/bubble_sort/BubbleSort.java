package bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    public int [] sort(int[] arr) {
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=i+1;j<arr.length-1;j++){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                swapped=true;
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    void display(int [] arr){
        System.out.println("Sorted Marks Array"+ Arrays.toString(arr));
    }
}
