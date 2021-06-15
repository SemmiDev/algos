package com.sammidev.pencarian_dan_pengurutan_5;

import java.util.Random;
import java.util.Scanner;

public class StudiKasus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Masukkan n : ");
        int user = input.nextInt();

        for (int i = 0; i < user; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\n\n");

        System.out.print("Masukkan n : ");
        user = input.nextInt();

        int random = new Random().nextInt(user);

        while (true) {
            System.out.print("Apakah bilangan yg anda pilih > " + random);
            String userChoise =  input2.next();
            if (userChoise.equalsIgnoreCase("y")) {
                random /= 2;
            }else {
                System.out.print("Apakah bilangan yg anda pilih < " + random);
                userChoise =  input2.next();
                if (userChoise.equalsIgnoreCase("y")) {
                    random /= 2;
                }else {
                    System.out.println("bingo");
                    System.exit(0);
                }
            }
        }
    }
}
