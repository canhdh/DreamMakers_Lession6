import java.util.Scanner;

public class Bai2 {
    public static int UCLN(int a, int b){
        while(a != b){
            if(a > b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        int a, b;
        System.out.println("Nhap a va b: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("UCLN cua " + a +"va" + b + "la: " + UCLN(a, b));
    }
}
