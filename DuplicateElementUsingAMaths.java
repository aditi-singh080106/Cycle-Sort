import java.util.Scanner;
import java.util.HashMap;
public class Main
{
    // Find duplicate
	public static void main(String[] args) {
        int[] arr = {2,3,7,5,9,1,3,4,6,8};
        int tsum = 0 , n = arr.length-1 ; 
        for(int i = 0; i <= n ; i++ ){
            tsum+=arr[i];
        }
        int actuallSum = (n*(n+1))/2;
        System.out.print("Duplicate ele is : "+(tsum-actuallSum));
	}
}
