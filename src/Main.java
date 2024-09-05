import java.util.Scanner;
//KULLANICI ADI VE SİFRE İLE SİSTEME GİRİYO-İSLEM SECİYO
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int select;
        int balance = 2000;
        int right =1;
        while (right > 0) {
            System.out.print("kullanıcı adınız:  ");
            username = input.nextLine();
            System.out.print("sifrenizi yazınız:  ");
            password = input.nextLine();
            if (username.equals("ezgisu") && password.equals("123")) {
                System.out.println("BASarılı giris- HOSGELDİNİZ");

                do {
                    System.out.println("LÜTFEN İSLEM SECİNİZ: ");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    select = input.nextInt();
                    System.out.println("seciminiz: " + select);
                    if (select == 1) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("SORRY BAKİYE YETERSİZ GELDİ PARA YUKLE ");
                        } else {
                            balance -= price;
                        }

                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;


            }else{
                if (!username.equals("ezgisu")&&!password.equals(("123"))) {
                    System.out.println("404");
                }
            }
        }

    }
}
