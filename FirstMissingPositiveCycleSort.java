import java.util.*;
public class Main
{
    // humesaha answere 1 tp n+1 ki range m hoga
    // First missing Positive number
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] arr = {4,3,2,7,8,2,3,7};
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            set.add(arr[i]);
        }
        for(int i = 1 ; i <= arr.length+1 ; i++ ){
            if(!set.contains(i)){
                System.out.print("Missing number is : "+i);
                break;
            }
        }
	}
}
