package Strings;

import java.util.Arrays;
import java.util.Locale;

public class methods {
    public static void main(String[] args) {
//        String name = "Ved";
//        System.out.println(Arrays.toString(name.toCharArray()));
            String str = "abcyba";
        System.out.println(isPalindromString(str));


    }

    static boolean isPalindromString(String str){

        if( str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase();

        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);;


            if(start != end){
                return false;
            }

        }
        return true;
    }

}
