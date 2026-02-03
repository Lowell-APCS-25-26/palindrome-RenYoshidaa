package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        return false;
    }
    public String reverse(String s) {
        String n = new String();
        s = s.toLowerCase();
        for( int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
        if(c>= 'a' && c <= 'z'){
            n+=c;
        }
        }
        return n;
    }
}
