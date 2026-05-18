    import java.util.Scanner;

    public class sumofn {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            System.out.println(sum(n));
        }
        static int sum(int n){
            if(n==1){
                return 1;
            }
            else{
                return n + sum(n-1);
            }
        }
    }
