package org.example;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Basamak sayılarının toplamını öğrenmek istediğiniz sayı giriniz :");
        int sum =  getDigitsSum(Integer.parseInt(scanner.nextLine()));
        System.out.println("Sum of digits : " + sum);
    }

    public  static int getDigitsSum(int number){

        if(number == 0) return number;
        int sum = 0 ;

        while (number != 0){
            sum = sum + number % 10;
            number /= 10;
        }

        return sum;
    }
}
