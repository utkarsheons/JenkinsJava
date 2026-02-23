package JavaProgams;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class Palindrome {

    @Test
    public void testPalindrome(){
        // ...existing code...
        String str = "madam";

        char[] charArr = new char[str.length()];
        int i=0;
        for(int j=str.length()-1;j>=0;j--){
            charArr[i]=str.charAt(j);
            i++;
        }

        // Print string
        System.out.println("::: Printing string: " + str);

        // Print character array
        System.out.print("::: Printing character array: ");
        for(char a : charArr){
            System.out.print(a);
        }

        int counter=0;
        for(char a:charArr){
            for(int j=str.length()-1;j>=0;j--){
                if(a==str.charAt(j)){
                    counter=1;
                    break;
                }
                else{
                    counter=2;
                    break;
                }
            }
        }

        if(counter==1){
//            assertTrue("madam should be a palindrome", counter == 1);
            System.out.println("\n" + str + " is a palindrome");
        } else if(counter==2){
            System.out.println("\n" + str + " is not a palindrome");
        }

    }

}
