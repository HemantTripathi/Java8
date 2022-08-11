package com.java8.datatimeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class BasicDateTime {
    public static void main(String[] args) {

        //1. print current date
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate:"+localDate); // current date
        System.out.println("getDayOfMonth:"+localDate.getDayOfMonth());
        System.out.println("getDayOfWeek:"+localDate.getDayOfWeek());
        System.out.println("getDayOfYear:"+localDate.getDayOfYear());
        System.out.println("getMonth:"+localDate.getMonth());
        System.out.println("getMonthValue:"+localDate.getMonthValue());
        System.out.println("getYear:"+localDate.getYear());
        System.out.println("getChronology:"+localDate.getChronology());
        System.out.println("getEra:"+localDate.getEra());


        //2. print current time
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime:"+localTime);
        System.out.println("getHour:"+localTime.getHour());
        System.out.println("getMinute:"+localTime.getMinute());
        System.out.println("getSecond:"+localTime.getSecond());
        System.out.println("getNano:"+localTime.getNano());

        // 3. Print Both Date and Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime:"+localDateTime);
        //similarly for all the parameter like month, year etc. can be fetched here
        System.out.println(LocalDateTime.of(1995, Month.FEBRUARY,20,13,12).format(DateTimeFormatter.ofPattern("yy-mm-dd,hh:mm")));
        System.out.println(LocalDateTime.of(1995, Month.FEBRUARY,20,13,12).plusMonths(6));

        // 4. Calculate number of days from your birthdate
        LocalDate birthdate = LocalDate.of(1990,Month.NOVEMBER, 10);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthdate,today);
        System.out.println("My Age is: "+period);
        System.out.printf("I'm %d years %d months & %d days older",period.getYears(),period.getMonths(),period.getDays());

        // 5. Work with zones -  default zone
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("\nMy default zone is: "+ zone);

        // 6. Find time zone of America/Los_Angeles
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(la);
        System.out.println("Zone date time of  Los Angeles is: "+zonedDateTime);

    }
}
