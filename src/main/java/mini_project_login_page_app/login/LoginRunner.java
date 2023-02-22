package mini_project_login_page_app.login;

import java.util.Scanner;

public class LoginRunner {

    public static void main(String[] args) {


        /*
        Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

        menü: kullanıcıya işlem seçimi için menü gösterilir.

        üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
                            kullanıcı adı, email ve şifre birer listede tutulur.
                            aynı kullanıcı adı veya email kabul edilmez.

        giriş(login):  kullanıcı adı/email ve şifre girilir.
                       kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

        email validation : boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

        password validation : boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
        */

        start();

    }

    private static void start() {
        UserService userService = new UserService();
        Scanner scan = new Scanner(System.in);
        int select;

        do {
            userService.showMenu();
            select = scan.nextInt();

            switch (select) {
                case 1:
                    userService.register();
                    break;
                case 2:
                    userService.login();
                    break;
                case 3:
                    System.out.println("== Gule Gule ==");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");
            }

        } while (select != 3);

    }
}
