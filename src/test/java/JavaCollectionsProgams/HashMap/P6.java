package JavaCollectionsProgams.HashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class P6 {

    @Test
    public void studentMarks(){
        System.out.println(" ");
        System.out.println("###################### START P6 ######################");

        Map<String,Double> studentsMarks= new HashMap<>();

        studentsMarks.put("Naresh",89.0);
        studentsMarks.put("Mahesh",54.0);
        studentsMarks.put("Mateen",23.6);
        studentsMarks.put("Sohrab",98.4);
        studentsMarks.put("Thomas",36.0);
        studentsMarks.put("Parminder",95.0);

        for(Map.Entry<String,Double> record:studentsMarks.entrySet()){
            if(record.getValue()>70.0){
                System.out.println(record.getKey() + " scored " + record.getValue() + " marks");
            }
        }

    }

}
