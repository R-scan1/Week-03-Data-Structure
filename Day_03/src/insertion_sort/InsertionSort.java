package insertion_sort;

import java.util.Arrays;

public class InsertionSort {
       public int [] sort(int [] id){
           int n=id.length;
           for(int i=0;i<n;i++){
               int key=id[i];
               int j=i-1;

               while(j>=0 && id[j]>key){
                   id[j+1]=id[j];
                   j--;
               }
               id[j+1]=key;
           }
           return id;
       }

    public void display(int[] sortedID) {
        System.out.println("Sorted Employee ID: "+ Arrays.toString(sortedID));
    }
}
