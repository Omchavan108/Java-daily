import java.util.*;
public class Palindrome{

    public static boolean isPalindrome(String s){
        int i = 0;
        int j= s.length()-1;

        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                
                i++;
                j--;
            }
            else{
              
                return false ;
            }
            
        }

       return true;

    }
    public static void main(String args[]){
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean b =  isPalindrome(s);
        System.out.println(b);

        
    }
}