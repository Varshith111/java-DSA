import java.util.Scanner;
public class sorted_array {
    public static void main(String[] args) {
    int[] arr = {1,3,4,7,78,33};
    System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr , int index){
        if(index == arr.length-1){
            return true;

        }
        else{
            return arr[index]<arr[index+1] && sorted(arr , index+1);
        }
    }
}
