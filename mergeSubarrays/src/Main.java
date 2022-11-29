import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<int[]> merge(int[][] arrays){
        Arrays.sort(arrays);
        ArrayList<int[]> list = new ArrayList<>(Arrays.asList(arrays));
        for(int i = 1; i != list.size(); i++){
            if(list.get(i)[0] <= list.get(i - 1)[1]){
                list.get(i)[0] = list.get(i-1)[0];
                list.remove(i -1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrays = new int[n][2];
        for(int i = 0; i != n; i++){
            arrays[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }
        for(int[] arr: merge(arrays)){
            System.out.println(Arrays.toString(arr));
        }
    }
}