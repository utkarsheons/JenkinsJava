package JavaCollectionsProgams.ArrayListPrograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P3 {
    @Test
    public void minMax(){
        System.out.println(" ");
        System.out.println("###################### START ######################");

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(15);
        numbersList.add(29);
        numbersList.add(4);
        numbersList.add(77);
        numbersList.add(93);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(48);
        numbersList.add(39);

        int min=numbersList.get(0);
        int max=numbersList.get(numbersList.size()-1);

        for(int number:numbersList){
            if(number<min){
                min=number;
            } else if(number>max){
                max=number;
            }
        }

        System.out.println("Numbers list is: " + numbersList);
        System.out.println("Min. number is: " + min);
        System.out.println("Max. number is: " + max);

    }

}
