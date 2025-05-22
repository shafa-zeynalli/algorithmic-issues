package sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Current arr:");
        printArr(array);
        mergeSort(array,0,array.length-1);
        System.out.println("Sorted arr:");
        printArr(array);
    }

    private static void mergeSort(int[] array,int left, int right) {
        if (left < right){
            int middle = (left + right) / 2;

            mergeSort(array,left,middle);
            mergeSort(array,middle + 1,right);

            merge(array,left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int leftSize = middle-left +1;
        int rightSize = right - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i=0; i<leftSize; ++i){
            leftArray[i]=array[left+i];
        }
        for (int j=0; j<rightSize; ++j){
            rightArray[j]=array[middle+1+j];
        }

        int i=0;
        int j=0;
        int k=left;

        while (i<leftSize && j<rightSize){
            if(leftArray[i]<=rightArray[j]){
                array[k]=leftArray[i];
                i++;
            }else{
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            array[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<rightSize){
            array[k]=rightArray[j];
            j++;
            k++;
        }

    }

    private static void printArr(int[] array) {
        for (int value : array){
            System.out.print(value + " ");
        }
    }
}
