/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspro;

/**
 *
 * @author Hemant-PC
 */
public class IndexPO {

    public static void main(String[] args) {

        int[] ar = {1, 1, 13, 5, 13};
//        int value = 2;
//        int c = 0;
//        for (int k = 1, i = 0, j = 2; i < ar.length && k < ar.length && j < ar.length; i++, k++, j++) {
//
//            if ((ar[i] == ar[k]) & (ar[k] == ar[j]) & (ar[i] == ar[j])) {
//                c++;
//            }
//        }
        System.out.println(centeredAverage(ar));
//        System.out.println("Number is " + c);
Object object = new Object();

    }

    public static int centeredAverage(int[] nums) {
         int i = 0;
        int sum = 0;
        while (i < nums.length) {
            if (nums[i] == 13) {
                i = i + 2;
                continue;
            }
            sum = sum + nums[i];
            i++;
        }
       
        return sum;
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            if (max <= nums[i]) {
                max = Math.max(nums[i], nums[j]);
            } else if (min >= nums[i]) {
                min = Math.min(nums[i], nums[j]);
            }

        }
        System.out.println(max + "=max \n min" + min);
        return max - min;
    }
}
