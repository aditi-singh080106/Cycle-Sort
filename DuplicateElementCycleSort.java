import java.util.Scanner;
import java.util.HashMap;
public class Main
{
    // Find duplicate
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void main(String[] args) {
        int[] arr = {2,3,7,5,9,1,3,4,6,8};
        int i = 0 , n = arr.length ;
        while(i<n){
            if(arr[i] == i+1) i++;
            else{
                if(arr[i]==arr[arr[i]]){
                    System.out.print("Duplicate element is : "+arr[i]);
                    break;
                }
                else swap(arr,arr[i],i);
            }
        }
	}
}
