package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        String cleaned = new String();
        s = s.toLowerCase();
        for( int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&& c <= 'z'){
                cleaned += c;
            }
        }
        return cleaned.equals(reverse(cleaned));


    }
    public String reverse(String s) {
        String n = new String();
        s = s.toLowerCase();
        for( int i = s.length()-1; i>=0; i--){
        n+= s.charAt(i);
        }
        return n;
    }
}
