package fr.wildcodeschool.java;

public class Palindrome {

/*
    if(!casse){
        return isPalindrome(s.toLowerCase(), true); //kayak, true
    }
*/


    public boolean isPalindrome(String s, boolean casse) {

        char[] chars;
        if(casse){
            chars = s.toCharArray();
        }else{
           chars = s.toLowerCase().toCharArray();
        }

        for(int i = 0; i < chars.length / 2; i++){
            if ( chars[i] != chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }

    /**
     * variante de isPalindrome qui vérifie la casse par défault
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {

        return isPalindrome(s, true);
    }
}
