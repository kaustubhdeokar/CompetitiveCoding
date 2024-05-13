//WHENEVER GIVEN RANGE FROM 1-N, use cyclic sort.

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 1, 4 };
        cyclicSort(nums);
    }

    public static void cyclicSort(int[] nums) {
        int n = 0;
        while (n < nums.length) {

            while (nums[n] != nums[nums[n] - 1]) {
                swap(nums, n, nums[n] - 1);
            }
            n += 1;
        }
    }

    public static void print(int[] nums){
        for(int n:nums){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}