package JavaSE.Chapter_9_MathDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        // LocalDate
        // LocalTime
        // LocalDateTime
        // DateTimeFormatter
        
        LocalDate currentDate = LocalDate.now(); // Current Date
        LocalTime currentTime = LocalTime.now(); // Current Time
        LocalDateTime currentDateTime = LocalDateTime.now(); // Current Time
        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateTime);
        
        // Extract Date
        System.out.println(currentDate.getYear());
        System.out.println(currentDate.getMonth());
        System.out.println(currentDate.getDayOfMonth());
        System.out.println(currentDate.getDayOfWeek());
        System.out.println(currentDate.getDayOfYear());
        // Extract Time
        System.out.println(currentTime.getHour() - 12);
        System.out.println(currentTime.getMinute());
        System.out.println(currentTime.getSecond());
        System.out.println(currentTime.getNano());
        
        // Extract DateTime
        System.out.println(currentDateTime.getYear());
        System.out.println(currentDateTime.getMonth());
        System.out.println(currentDateTime.getDayOfMonth());
        System.out.println(currentDateTime.getDayOfWeek());
        System.out.println(currentDateTime.getDayOfYear());
        System.out.println(currentDateTime.getHour() - 12);
        System.out.println(currentDateTime.getMinute());
        System.out.println(currentDateTime.getSecond());
        System.out.println(currentDateTime.getNano());
        
        
        // Specific Date
        LocalDate localDate = LocalDate.of(2002, 9, 8);
        System.out.println(localDate);
        
        LocalTime localTime = LocalTime.of(23, 59, 59);
        System.out.println(localTime);
        
        System.out.println("-".repeat(10));
        // Manipulate Date & Time
        LocalDate localDateManipulated = localDate.plusDays(1);
        LocalDate localDateManipulated2 = localDate.plusMonths(1);
        LocalDate localDateManipulated3 = localDate.plusYears(1);
        LocalDate localDateManipulated4 = localDate.plusWeeks(1);

//        localTime.plusHours(1);
//        localTime.plusMinutes(1);
//        localTime.plusSeconds(1);
//        localTime.plusNanos(1);
        
        LocalDate localDateManipulated5 = localDate.minusDays(1);
        LocalDate localDateManipulated6 = localDate.minusMonths(1);
        LocalDate localDateManipulated7 = localDate.minusYears(1);
        LocalDate localDateManipulated8 = localDate.minusWeeks(1);

//        localTime.minusHours(1);
//        localTime.minusMinutes(1);
//        localTime.minusSeconds(1);
//        localTime.minusNanos(1);
        
        System.out.println(localDate);
        System.out.println(localDateManipulated);
        System.out.println(localDateManipulated2);
        
        // DateTimeFormater
        System.out.println("-".repeat(10));
        // dd-mm-yyyy --> dd/MM/YYYY -> dd-YYYY-MM hh:mm
        System.out.println(currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = currentDateTime.format(formatter);
        System.out.println(formattedDate);
        
        // 25/10/2012 --> How I can pase this string into date
        String dateStr = "25/10/2012";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter2);
        System.out.println(parsedDate);
    }
}
