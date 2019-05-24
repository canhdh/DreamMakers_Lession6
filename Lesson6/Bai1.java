import java.util.Scanner;

public class Bai1 {
    public static boolean isPrimeNumber (int n){
        if( n < 2)
            return false;
        int rootSquare = (int) Math.sqrt(n);
        for(int i = 2; i <= rootSquare; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(isPrimeNumber(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
