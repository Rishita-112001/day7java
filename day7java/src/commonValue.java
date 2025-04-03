//take the common elements from two array and put it in arraylist

import java.util.ArrayList;
import java.util.Scanner;

public class commonValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the array2:");
        int n1 = sc.nextInt();
        int[] arr2 = new int[n1];

        for (int i = 0; i<n1;i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> nums1 = new ArrayList(10);
        for(int i = 0; i<n; i++){
            for (int j=0; j<n1; j++){
                if (arr1[i]==arr2[j]){
                    nums1.add(arr2[j]);
                }
            }
        }
        System.out.println(nums1);
    }
}
