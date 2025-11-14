import java.util.ArrayList;
public class Main
{
    // humesaha answere 1 tp n+1 ki range m hoga
    // First missing Positive number
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int[] arr = {4,3,2,7,8,2,3,7};
        ArrayList<Integer> ans = new ArrayList<>();
        // cycle sort
        for(int num = 1 ; num < arr.length+1 ; num++ ){
            boolean flag = false;
            for(int i = 0 ; i < arr.length ; i++ ){
                if(num==arr[i]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.print("Missing Positive : "+num);
                break;
            }
        }
	}
}
