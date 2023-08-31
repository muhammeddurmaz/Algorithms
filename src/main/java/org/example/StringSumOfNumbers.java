package org.example;

public class StringSumOfNumbers {
    public static void main(String[] args) {

        sum("23234234534534534","234234234234234234234234234234234234534534523423");
    }
    public static void sum(String value1, String value2){
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = value1.length() - 1;
        int j = value2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? Character.getNumericValue(value1.charAt(i)) : 0;
            int digit2 = j >= 0 ? Character.getNumericValue(value2.charAt(j)) : 0;

            int currentSum = digit1 + digit2 + carry;
            carry = currentSum / 10;

            sum.insert(0, currentSum % 10);
            i--;
            j--;
        }
        System.out.println(sum);
    }
}
