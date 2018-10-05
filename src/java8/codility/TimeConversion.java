package java8.codility;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public static void main(String [] args){
        String time = "12:00:00AM";
        timeConverson(time);

    }
    private static void timeConverson(String time){

        String result = DateTimeFormatter.ISO_TIME.format(LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm:ssa"))).toString();
        System.out.println("result = " + result);
    }
}
