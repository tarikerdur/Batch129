package mini_project_login_page_app.login;

import java.util.*;

public class UserService {

    ArrayList<String> userNameList = new ArrayList<>();
    ArrayList<String> emailList = new ArrayList<>();
    ArrayList<String> passwordList = new ArrayList<>();

    void showMenu() {
        System.out.println("\t==TECH PRO EDUCATION==");
        System.out.println("1- Uye Ol");
        System.out.println("2- Giris Yap");
        System.out.println("3- Cikis");
        System.out.println("\tSeciminizi giriniz");
    }


    void register() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad-Soyad Giriniz");
        String nameSurname = scan.nextLine();

        String userName;
        boolean existUserName;

        do { // control of is username exist
            System.out.println("Kullanici adini giriniz");
            userName = scan.nextLine();
            existUserName = userNameList.contains(userName); // varsa true donecek. true oldugu surece loop basa saricak. while loop false olunca sonlanacak.
            if (existUserName) {
                System.out.println("\"" + userName + "\" kullanici adi daha once kullanilmistir.\nYeniden deneyiniz");
            }
        } while (existUserName);

        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("Email giriniz");
            email = scan.nextLine();
            isValid = validateEmail(email);

            existEmail = emailList.contains(email);
            if (existEmail) {
                System.out.println("Bu email daha once kullanilmistir. Yeniden deneyiniz");
                isValid = false;
            }
        } while (!isValid);


        String password;
        boolean isValidPsw;


        do {
            System.out.println("Sifre giriniz");
            password = scan.nextLine();
            isValidPsw = validatePassword(password);
        } while (!isValidPsw);


        User user = new User(nameSurname, userName, email, password);
        System.out.println(user);

        userNameList.add(userName);
        emailList.add(email);
        passwordList.add(password);

        System.out.println("Tebrikler kayit islemi gerceklesti");
        System.out.println("Kullanici adi veya sifre ile giris yapabilirsiniz");
    }

    void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Email ya da kullanici adi giriniz.");
        String userNameOrEmail = scan.nextLine();

        boolean isEmailExist = emailList.contains(userNameOrEmail);
        boolean isUserNameExist = userNameList.contains(userNameOrEmail);

        if (isEmailExist || isUserNameExist) {

            while (true){
                System.out.println("Sifre giriniz");
                String password = scan.nextLine();
                int idx;
                if (isUserNameExist){
                    idx = userNameList.indexOf(userNameOrEmail);
                } else {
                    idx = emailList.indexOf(userNameOrEmail);
                }


                if (passwordList.get(idx).equals(password)){
                    System.out.println("Sisteme giris yaptiniz.");
                    break;
                } else {
                    System.out.println("Sifre yanlis. Tekrar deneyiniz.");
                }

            }

        } else {
            System.out.println("Sisteme kayitli kullanici bulunamadi.");
            System.out.println("Bilgilerinizi kontrol ediniz ya da uye olunuz");
        }


    }

    static boolean validateEmail(String email) {

        boolean isValid;

        boolean space = email.contains(" "); // true ise bosluk var
        boolean isContainAt = email.contains("@"); // true ise @ var

        if (space) {
            System.out.println("Bosluk icermemelidir.");
            isValid = false;
        } else if (!isContainAt) {
            System.out.println("Email @ icermelidir.");
            isValid = false;
        } else {
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

            boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]", "").length() == 0; // length 0 donerse istedigimiz gibi olucak demek
            boolean checkSecond = secondPart.equals("gmail.com")
                    || secondPart.equals("yahoo.com")
                    || secondPart.equals("hotmail.com");


            if (!checkFirst) {
                System.out.println("Email @'den once [buyuk harf, kucuk harf, rakam, -._] karakterleri disinda karakter iceremez.");
            } else if (!checkSecond) {
                System.out.println("Email [gmail.com , hotmail.com , yahoo.com] ile bitmeli.");
            }

            isValid = checkFirst && checkSecond;
        }

        return isValid;

    }

    static boolean validatePassword(String password) {
        boolean isValid;

        boolean space = password.contains(" ");
        boolean lengthGt6 = password.length() > 5; // Gt ==> Greater than
        boolean existUpper = password.replaceAll("[^A-Z]", "").length() > 0;
        boolean existLower = password.replaceAll("[^a-z]", "").length() > 0;
        boolean existDigit = password.replaceAll("[^0-9]", "").length() > 0;
        boolean existSymbol = password.replaceAll("[^\\p{Punct}]", "").length() > 0;

        if (space) {
            System.out.println("Sifre bosluk iceremez");
        } else if (!lengthGt6) {
            System.out.println("Sifre en az 6 karakter icermelidir.");
        } else if (!existUpper) {
            System.out.println("Sifre en az 1 buyuk harf icermelidir.");
        } else if (!existLower) {
            System.out.println("Sifre en az 1 kucuk harf icermelidir.");
        } else if (!existDigit) {
            System.out.println("Sifre en az 1 sayi icermelidir.");
        } else if (!existSymbol) {
            System.out.println("Sifre en az 1 sembol icermelidir.");
        } else {
            System.out.println();
        }

        isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

        return isValid;
    }
}
