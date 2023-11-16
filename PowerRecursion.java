import java.util.Scanner;

public class PowerRecursion {
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * Power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        int x = sc.nextInt();
        System.out.print("Enter the power N: ");
        int n = sc.nextInt();
        System.out.println("X power N is: " + Power(x, n));
        sc.close();
    }
}
