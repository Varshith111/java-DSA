import java.util.*;

public class nto1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        display(n);

    }
    static void display(int n){
        if(n==0){
            return;
        }
        else{

            display(n-1);
            System.out.println(n);

        }
    }
}
