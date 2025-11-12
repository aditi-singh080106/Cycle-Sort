import java.util.Scanner;
public class Main
{
    // Cycle Sort : Missing Number (Using Math)
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
	    int n = arr.length ;
	    int sum = 0 ; 
	    for(int j = 0 ; j < n ; j++ ){
	        sum+=arr[j];
	    }
	    int missed = (n*(n+1))/2-sum;
	    System.out.println("Missing number is : "+missed);
	}
} 
