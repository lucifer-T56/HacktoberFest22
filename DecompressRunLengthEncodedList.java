import java.util.*;
public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {

        int n=0;
        for(int i=0;i<nums.length;i +=2) {
            n += nums[i];
        }
        int[] arr =  new int[n];
        int start = 0;
        for(int i=0 ; i<nums.length ; i+=2) {
            Arrays.fill(arr,start,start+nums[i],nums[i+1]);
            start += nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }
}
