import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        n=input.nextInt();

        for(int i=1;i<=n;i*=4){
            System.out.println("4 ün katlarrı : "+i);
        }
        for(int i=1;i<=n;i*=5){
            System.out.println("5 in katları : "+i);
        }



    }
}