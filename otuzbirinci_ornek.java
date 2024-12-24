package JAVA101;
import java.util.Scanner;
public class otuzbirinci_ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        System.out.println("basamak sayısını giriniz");
        int number = input.nextInt();
        int sum,num1=0,num2=1;
        for (int i=0;i<=number;i++) {
            System.out.println(num1+"+"+num2+"=" + (num1 + num2));
            sum = num1+num2;
            num1 = num2 ;
            num2 = sum ;
        }
    }
}
