package com.joelallison;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string for encoding: ");
        String uString = input.next();

        int count = 1;

        String eString = "";


        for (int i = 0; i < uString.length(); i++){
            if ((i != 0) && (uString.charAt(i) == uString.charAt(i-1))){
                count++;
            }else{
                eString = eString + uString.charAt(i) + String.valueOf(count);
                count = 1;
            }
            System.out.println(String.valueOf(uString.charAt(i)) + String.valueOf(i) + String.valueOf(count));
        }System.out.println("Unencoded string's length: " + uString.length() + "\nEncoded string:" + eString + ", encoded string's length: " + eString.length());
    }
}
// for each character, check if it's the same as the last
// if it is, then increment count by 1
// if not, concatenate to string
// can't check same as last for first char


// THE ERROR IS FROM THE PLACEMENT OF THE COUNT RESET ?? THE COUNT OF PREVIOUS CHAR IS BEING PUT ON CURRENT CHAR