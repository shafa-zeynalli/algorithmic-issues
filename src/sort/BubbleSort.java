package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
//        int[] arr = { 10, 13, 14, 29, 37};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            boolean sirali=true;

            for (int j =0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    sirali=false;
                    int a = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=a;
                }
            }
            if (sirali) return arr;
        }
        return arr;
    }
}
