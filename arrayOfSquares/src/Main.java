import java.util.Scanner;

public class Main {
    public static int[] arrayOfSquares(int[] nums) {
        int n = nums.length;
        if(n == 0) return nums;
        if(n == 1) return new int[]{nums[0] * nums[0]};

        int l = 0, i = n - 1, r = n - 1;
        int[] res = new int[n];
        
        while(l <= r){
            if(Math.abs(nums[l]) >= Math.abs(nums[r])){
                res[i] = nums[l] * nums[l];
                l++;
            } else{
                res[i] = nums[r] * nums[r];
                r--;
            }
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i != n; i++){
            arr[i] = sc.nextInt();
        }
        for(int num : arrayOfSquares(arr))
            System.out.println(num);
    }
}

//6
//-4 -3 -2 1 2 3

//0

//1
//3

//8
//-12 -10 -8 -7 -5 -3 -2 -1