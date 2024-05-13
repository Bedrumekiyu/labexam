package dsa;
//Q1

import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a sequence of numbers (separated by spaces): ");
        String numSequence = scanner.nextLine();
        String[] numArray = numSequence.split(" ");

        
        System.out.print("Enter a number to search: ");
        int DSA = scanner.nextInt();

       
        int count = 0;
        for (String num : numArray) {
            int numValue = Integer.parseInt(num);
            if (numValue == DSA) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + DSA + " appears " + count + " time(s) in the array.");
        } else {
            System.out.println("The number " + DSA + " is not present in the array.");
        }
    }
}
