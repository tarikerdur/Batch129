package my_practices.öylesineçalışmalar;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
                    /* TASK:
                 tas   > makas
                 makas > kagit
                 kagit > tas
            Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.

            Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.

            While dongumuzun icerisinde kullanicidan aldigimiz secimi "secim" isimli degiskene atiyoruz.

            Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.

            Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.

            Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.

            En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
            dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
                    */

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Welcome to our magnificent game..." +
                "\nWhoever reaches the first 10 points wins the game");
        String playerChoice = "";
        String pcChoice = "";

        int playerPoint = 0;
        int pcPoint = 0;


        do {
            System.out.println("Rock ? Paper ? Scissors ?");
            playerChoice = input.next();
            pcChoice = String.valueOf(rnd.nextInt(3));

            switch (pcChoice) {
                case "0":
                    pcChoice = "ROCK";
                    break;
                case "1":
                    pcChoice = "PAPER";
                    break;
                case "2":
                    pcChoice = "SCISSORS";
                    break;
            }

            if (playerChoice.equalsIgnoreCase("rock") && pcChoice.equalsIgnoreCase("rock")) {
                System.out.println("Withdraw");
            } else if (playerChoice.equalsIgnoreCase("rock") && pcChoice.equalsIgnoreCase("paper")) {
                pcPoint++;
            } else if (playerChoice.equalsIgnoreCase("rock") && pcChoice.equalsIgnoreCase("scissors")) {
                playerPoint++;
            } else if (playerChoice.equalsIgnoreCase("paper") && pcChoice.equalsIgnoreCase("paper")) {
                System.out.println("Withdraw");
            } else if (playerChoice.equalsIgnoreCase("paper") && pcChoice.equalsIgnoreCase("rock")) {
                playerPoint++;
            } else if (playerChoice.equalsIgnoreCase("paper") && pcChoice.equalsIgnoreCase("scissors")) {
                pcPoint++;
            } else if (playerChoice.equalsIgnoreCase("scissors") && pcChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Withdraw");
            } else if (playerChoice.equalsIgnoreCase("scissors") && pcChoice.equalsIgnoreCase("rock")) {
                pcPoint++;
            } else if (playerChoice.equalsIgnoreCase("scissors") && pcChoice.equalsIgnoreCase("paper")) {
                playerPoint++;
            }

            if (playerPoint > pcPoint) {
                System.out.println("Your point is : " + playerPoint
                        + "\nPC point is : " + pcPoint
                        + "\nPC's choice was : " + pcChoice);
            } else if (playerPoint == pcPoint) {
                System.out.println("Your point is : " + playerPoint
                        + "\nPC point is : " + pcPoint
                        + "\nPC's choice was : " + pcChoice);
            } else {
                System.out.println("Your point is : " + playerPoint
                        + "\nPC point is : " + pcPoint
                        + "\nPC's choice was : " + pcChoice);
            }


            if (playerPoint == 10) {
                System.out.println("Player has reached the 10 point. The game is over. You're WIN");
                System.out.println("PC point was : " + pcPoint);
                break;
            } else if (pcPoint == 10) {
                System.out.println("PC has reached the 10 point. The game is over. You've LOST");
                System.out.println("Player point was : " + playerPoint);
                break;
            }


        } while (true);

    }
}
