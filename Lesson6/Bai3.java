import java.util.Scanner;

public class Bai3 {
    public static final char MAX_55 = 55;
    public static String convertNumber(int n, int b){
        int m;
        int remainder = n;
        StringBuilder sb = new StringBuilder();
        while(remainder > 0){
            if(b > 10){
                m = remainder % b;
                if(m >= 10){
                    sb.append((char)(MAX_55 + m));
                }
                else{
                    sb.append(m);
                }
            }
            else{
                sb.append(remainder % b);
            }
            remainder = remainder / b;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int n, b;
        System.out.println("Nhap n va co so a: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = sc.nextInt();
        System.out.println("So " + n + " trong he co so " + b + " la: " + convertNumber(n, b));
    }
}
