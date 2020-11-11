package ie.filippolak.registrationform;

import java.util.Arrays;
import java.util.List;

public class ListOfProfessions {
    private List<String> professionList = Arrays.asList("Developer", "Tester","Architect","Mechanic");

    public List showProfession(){
        professionList.toString();
        return professionList;
    }
}
