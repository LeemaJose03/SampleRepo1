package javaproblems;

import java.util.Scanner;

public class ChangeKthCharacter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int K = sc.nextInt();
        
        String result = changeKthCharacter(inputString, K);
        System.out.println(result);
    }
    
    public static String changeKthCharacter(String str, int K) {
        if (K <= 0 || str == null || str.isEmpty()) {
            return str;
        }
        
        char[] charArray = str.toCharArray();
        for (int i = K - 1; i < charArray.length; i += K) {
            char ch = charArray[i];
            if (Character.isLetter(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
        }
        
        return new String(charArray);
    }
}
