package sort;

import java.util.Arrays;

public class SelectionSort {

//    Verilmiş bir tam ədədlər massivini artan sıraya görə Selection Sort alqoritmindən istifadə edərək sıralamalısan.

//   1. selectionSort adlı bir metod yaz.
//   2. Bu metod int[] array qəbul etməlidir.
//   3. Massivi yerində (in-place) sort et.
//   4. Əlavə köməkçi massiv istifadə etmə.


    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){

        for (int i=0; i < arr.length-1; i++){
            int max=i;

            for (int j=i+1; j < arr.length; j++){
                if (arr[j]>arr[max]){
                    max=j;
                }
            }
            int a = arr[i];
            arr[i] = arr[max];
            arr[max]=a;
        }

        return arr;

    }

    //Time Complexity hemise O(n²) dir,
//    Çünki ilk element üçün n dəfə müqayisə aparılır,
//    İkinci üçün n-1, sonra n-2 və s.
//    Bu da n + (n-1) + (n-2) + ... + 1 = n(n-1)/2 ≈ O(n²) edir.

//    Space Complexity: O(1) → Çünki əlavə yaddaş istifadə etmir (in-place sort edir).
//    Stable sort deyil → Bərabər elementlərin sırası dəyişə bilər.
//    Kiçik massivlər üçün sadədir, amma böyük massivlər üçün yavaşdır.
}
