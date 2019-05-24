import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static List<Integer> primeNumber(int n){
        int i = 2;
        List<Integer> listNumber = new ArrayList<Integer>();
        while(n > 1){
            if(n % i == 0){
                n = n / i;
                listNumber.add(i);
            }
            else
                i++;
        }
        if(listNumber.isEmpty())
            listNumber.add(n);
        return listNumber;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Integer> listNumber = primeNumber(n);
        System.out.print("Ket qua:" + n + " = ");
        for(int i = 0; i < listNumber.size() - 1; i++){
            System.out.print(listNumber.get(i) + " x ");
        }
        System.out.println(listNumber.get(listNumber.size()-1));
    }
}
