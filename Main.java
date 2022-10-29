import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int num2 = input.nextInt();
        int count = 1;
        int ebob = 1;
        while (count <= num1){
            if (num1 % count == 0 && num2 % count == 0) {
                ebob = count;
            }
            count++;

        }
        System.out.println("EBOB : " + ebob);
        count = 1;
        while (count <= (num1 * num2)){
            if (count % num1 == 0 && count % num2 == 0) {
                System.out.println("EKOK : " + count);
                break;
            }
            count++;
        }
    }
}