package JavaCollectionsProgams.ArrayListPrograms;

import org.junit.Test;

import java.util.*;

public class P2 {

    @Test
    public void uniqueNamesList(){
        List<String> names = new ArrayList<>();
        names.add("Erin");
        names.add("Andrew");
        names.add("Elizabeth");
        names.add("Edward");
        names.add("Andrew");
        names.add("Edward");
        names.add("Edward");
        names.add("Catherine");
        names.add("Elizabeth");
        names.add("Desmond");
        names.add("David");
        names.add("Desmond");

        Set<String> unique = new HashSet<>();
        for(String name:names){
            unique.add(name);
        }

        int counter=0;
        Map<String, Integer> namesMap = new HashMap<>();
        Iterator<String> it = unique.iterator();
        while(it.hasNext()){
            String n = it.next();
            for(String m:names){
                if(n.equalsIgnoreCase(m)){
                    counter++;
                }
            }
            namesMap.put(n,counter);
            counter=0;
        }

        System.out.println(namesMap);
        List<String> uniqueNamesInArrayList = new ArrayList<>(unique);
        System.out.println(uniqueNamesInArrayList);

    }

}
