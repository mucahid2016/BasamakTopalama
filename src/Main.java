import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, basNumber = 0, tempNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        a = input.nextInt();
        tempNumber = a;
        for (int i = 0; a != 0; i++) {
            a /= 10;
            basNumber++;
        }
        a = tempNumber;
        int basMod, basValue, baspow = 1, result = 0, mod = 10;
        for (int y = 1; y <= basNumber; y++) {
            basMod = a % mod;
            basValue = basMod / baspow;
            mod *= 10;
            baspow *= 10;
            result += basValue;
        }
        System.out.println(result);
    }
}
