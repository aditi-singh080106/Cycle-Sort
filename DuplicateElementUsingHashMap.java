import java.util.Scanner;
import java.util.HashMap;
public class Main
{
    // Find duplicate
	public static void main(String[] args) {
        int[] arr = {2,3,7,5,9,1,3,4,6,8};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else map.put(arr[i],1);
        }
        for(Integer ele : map.keySet()){
            if(map.get(ele)>1){
                System.out.println(ele+" is a dupicate element.");
                break;
            }
        }
	}
}
