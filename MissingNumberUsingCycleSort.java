import java.util.Scanner;
public class Main
{
    // Cycle Sort : Missing Number
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
        return;
    }
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
	public static void main(String[] args) {
	    int[] arr = {5,4,1,0,3,2,7};
	    print(arr);
	    int n = arr.length ;
	    int i = 0 ; 
	    while(i<n){
	        if(arr[i] == i|| arr[i] == n) i++;
	        else{
	            swap(arr,i,arr[i]);
	        }
	    }
	    print(arr);
	    for(int j = 0 ; j < n ; j++ ){
	        if(arr[j]!=j){
	            System.out.print("Missing number is : "+j);
	            break;
	        }
	    }
	}
} 
