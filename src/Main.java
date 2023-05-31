import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil,mod4,mod100,mod400;
        System.out.println("Artık yıl bulma programına hoşgeldiniz");
        System.out.println("Lütfen yılı giriniz : ");
        yil=input.nextInt();
        mod4=yil%4;
        mod100=yil%100;
        mod400=yil%400;
        if (mod4==0 && mod100==0 || mod400==0){
            System.out.println(yil+" Artık bir yıldır.");
        }else if (yil<0){
            System.out.println(" Hatalı tuşlama yaptınız.");
        }else {
            System.out.println(yil+" Artık bir yıl degildir.");
        }



    }
}