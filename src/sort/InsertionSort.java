package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        //  Verilmiş tam ədədlər massivini artan sırada sıralayın.
        System.out.println(Arrays.toString(insertionSortArtan(arr)));

        //  Verilmiş tam ədədlər massivini azalan sırada sıralayın.
        System.out.println(Arrays.toString(insertionSortAzalan(arr)));

        int[] firstN = Arrays.copyOf(arr,3);
        // Massivdəki ilk k ən kiçik ədədi tapın (sıralanmış şəkildə).
        System.out.println(Arrays.toString(firstN));
    }

    public static int[] insertionSortArtan(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int z=arr[i];
            int j=i-1;

            while (j>=0 && arr[j] > z){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=z;
        }
        return arr;
    }

    public static int[] insertionSortAzalan(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int z=arr[i];
            int j=i-1;

            while (j>=0 && arr[j] < z){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=z;
        }
        return arr;
    }


}
