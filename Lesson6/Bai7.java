import java.util.Scanner;

public class Bai7 {
    public static int findFibo(int n){
        int f0 = 0, f1 = 1, fn = 1;
        if(n == 0 || n == 1)
            return n;
        for(int i = 2; i < n; i++){
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        return fn;
    }
    public static boolean isprimeNumber(int n){
        if(n < 2)
            return false;
        int squareRoot = (int) Math.sqrt(n);
        for(int i = 2; i <= squareRoot; i++){
            if(n%i == 0){
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
        int i = 2;
        while(findFibo(i) < n){
            if(isprimeNumber(findFibo(i)))
                System.out.print(findFibo(i) + " ");
            i++;
        }
    }
}
