import java.util.Scanner;

public class Bai5 {
    public static boolean isprimeNunber(int n){
        if(n < 2)
            return false;
        int squareRoot = (int) Math.sqrt(n);
        for(int i = 2; i <= squareRoot; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n + " so nguyen to dau tien la: ");
        int dem = 0;
        int i = 2;
        while(dem < n){
            if(isprimeNunber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}
