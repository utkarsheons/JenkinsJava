package JavaCollectionsProgams.ArrayListPrograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P1 {

    @Test
    public void usageOfArrayList(){
        System.out.println("###################### START ######################");

        List<String> namesList = new ArrayList<>();
        namesList.add("Sudheer");
        namesList.add("Sampat");
        namesList.add("Randhir");
        namesList.add("Jehangir");
        namesList.add("Abdul");

//        for(String name:namesList){
//            System.out.println(name);
//        }
//
//        System.out.println(" ");

        for(int i=namesList.size()-1;i>=0;i--){
            System.out.println(namesList.get(i));
        }

    }

}
