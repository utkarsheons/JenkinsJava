package JavaProgams;

import java.util.*;

public class OccurancesOfEachCharacter {

    public static void main(String[] args){

        String strMain= "panama canal";
        System.out.println("String is: " + strMain);
        String str = strMain.replace(" ", "");

        Set<Character> charSet = new HashSet<>();
        for(char a:str.toCharArray()){
            charSet.add(a);
        }
        System.out.println("CharSet is: " + charSet);

        Map<Character,Integer> charMap = new HashMap<>();
        int counter=0;
        Iterator<Character> it = charSet.iterator();
        while(it.hasNext()){
            char a = it.next();
            for(int i=0;i<str.length();i++){
                if(a==str.charAt(i)){
                    counter++;
                }
            }
            charMap.put(a,counter);
            counter=0;
        }

        System.out.println("Occurances are: " + charMap);

    }

}
