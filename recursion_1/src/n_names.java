import java.util.Scanner;

class n_names {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String name = input.next();
        names(name,n);
    }
    static void names(String name,int n){
        if(n==0){
            return;
        }
        else{
        System.out.println(name);
        names(name,n-1);
        }
    }
}
