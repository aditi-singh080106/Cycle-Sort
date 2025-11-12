import java.util.Scanner;
public class Main
{
    // Cycle Sort : Missing Number (Using another array)
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
        return;
    }
	public static void main(String[] args) {
	    int[] arr = {5,4,1,0,3,2,7};
	    print(arr);
	    boolean[] brr = new boolean[arr.length+1];
	    for(int i = 0 ; i < arr.length ; i++ ){
	        brr[arr[i]] = true;
	    }
	    for(int i = 0 ; i < brr.length ; i++ ){
	        if(!brr[i]){
	            System.out.println("Missing ele : "+i);
	            break;
	        }
	    }
	}
}
