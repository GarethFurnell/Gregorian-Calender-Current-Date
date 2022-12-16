/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gregoriancalender;

/**
 *
 * @author Gareth
 */
import java.util.*;
public class GregorianCalender {
    public static void main(String[] args) {
        String months[] = {
            "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
        };
        int year;
        //Create gregorian calender initialized
        //with the current date and time in the default locale and timezone
        GregorianCalendar gcalender = new GregorianCalendar();
        //Display current time and date info
        System.out.print("Date: ");
        System.out.print(months[gcalender.get(Calendar.MONTH)]);
        System.out.print(" " + gcalender.get(Calendar.DATE) + " ");
        System.out.println(year = gcalender.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalender.get(Calendar.HOUR));
        System.out.print(":");
        System.out.print(gcalender.get(Calendar.MINUTE));
        //test if the current year is a leap year
        if(gcalender.isLeapYear(year)){
            System.out.println(" The current year is a leap year");
        }else{
            System.out.println(" The current year is not a leap year");
        }
    }
    
}
