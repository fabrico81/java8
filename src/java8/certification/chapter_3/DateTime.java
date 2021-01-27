package java8.certification.chapter_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author faber
 */

public class DateTime {


    public static void main(String [] args) {

        LocalDateTime now = LocalDateTime.now();
     //   System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String dateTimeFormatted = now.format(formatter);

        DateTimeFormatter custom_formatter = DateTimeFormatter.ofPattern("DD M yyyy");
      //  System.out.println(now.format(custom_formatter));
//
        System.out.println(dateTimeFormatted);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMM yyyy");

        LocalDate parse = LocalDate.parse("26 Jan 2021", f);
        System.out.println(parse);

    }
}
