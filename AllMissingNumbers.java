import java.util.ArrayList;
public class Main
{
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] arr = {4,3,2,7,8,2,3,7};
        ArrayList<Integer> ans = new ArrayList<>();
        // cycle sort
        int i=0, n=arr.length;
        while(i<n){
            int ele = arr[i];
            if(ele==i+1||ele==arr[ele-1]) i++;
            else swap(arr,ele-1,i);
        }
        for(int k = 0 ; k < n ; k++ ){
            if(arr[k] != k+1) ans.add(k+1);
        }
        // System.out.println(ans);
        for(int ele:ans){
            System.out.println(ele);
        }
	}
}
