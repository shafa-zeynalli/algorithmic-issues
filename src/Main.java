import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {9,9,9};

        plusOne(nums);
    }

    public static int[] plusOne(int[] digits) {
        int n=digits.length-1;
        // [1,2,3]

        if(digits[n]<9){
            digits[n]++;
            return digits;
        }

        while(n >= 0 && digits[n]==9){
            digits[n] = 0;
            n--;
        }

        if(n == -1){
            int[] arr = new int[digits.length+1];
            arr[0]=1;
            return arr;
        }

        digits[n]++;
        return digits;
    }

    public static int removeDuplicates(int[] nums) {
        int k =0;
        List<Integer> arr=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    k++;
                }

            }
            if(!arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        return arr.size();
    }
}