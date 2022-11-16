import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        matematik= inp.nextInt();

        System.out.print("Fizik Notu: ");
        fizik= inp.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce= inp.nextInt();

        System.out.print("Kimya Notu: ");
        kimya= inp.nextInt();

        System.out.print("Müzik Notu: ");
        muzik= inp.nextInt();

        double avarage = (matematik+fizik+turkce+kimya+muzik) / 5;
        if (avarage >= 55)
        {
            if(100>=matematik && matematik>=0 && 100>=fizik && fizik>=0 && 100>=turkce && turkce>=0 && 100>=kimya && kimya>=0 && 100>=muzik && muzik>=0)
        {
            System.out.println("Tebrikler, geçtiniz! Ortalamanız: " + avarage);
        }
            else {
                System.out.println("Geçerli not giriniz!");
            }
        }
        else {
            System.out.println("Malesef, kaldınız. Ortalamanız: " + avarage);
        }

    }
}