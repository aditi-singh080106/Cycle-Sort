import java.util.Scanner;
public class Main
{
    // Cycle Sort
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
        return;
    }
	public static void main(String[] args) {
	    int[] arr = {5,4,1,6,3,2};
	    print(arr);
	    for(int i = 0 ;i<arr.length;i++){
	        while(arr[i] != i+1){
	           // swap
	           int correctIdx = arr[i]-1;
	           int temp = arr[i];
	           arr[i] = arr[correctIdx];
	           arr[correctIdx] = temp;
	        }
	    }
	    print(arr);
	}
}
