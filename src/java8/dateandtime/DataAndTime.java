package dateandtime;

import java.time.LocalDate;
import java.util.Date;

public class DataAndTime {

    public static void main(String[] args){

        localDate();

    }

    static LocalDate localDate(){
        LocalDate localDate = LocalDate.of(2018, 5, 22);
        return localDate;
    }
}
