import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik,turkce,fizik,kimya,muzik,tarih;
                System.out.println("Matematik Notunu Giriniz :");
                Scanner scan= new Scanner(System.in);
                matematik=scan.nextInt();
                System.out.println("Turkce Notunu Giriniz :");
                turkce=scan.nextInt();
                System.out.println("Fizik Notunu Giriniz :");
                fizik=scan.nextInt();
                System.out.println("Kimya Notunu Giriniz :");
                kimya=scan.nextInt();
                System.out.println("Muzik Notunu Giriniz :");
                muzik=scan.nextInt();
                System.out.println("Tarih Notunu Giriniz :");
                tarih=scan.nextInt();
                int toplam=matematik+turkce+fizik+kimya+muzik+tarih;
                double ortalama=toplam/6.0;
                System.out.print(ortalama>60 ? "Ortalamaniz :"+ortalama+"\nTebrikler Sinifi Gectiniz :)" :"Ortalamaniz :"+ortalama+ "\nUzgunuz Sinifi Gecemediniz :(");
    }
}

