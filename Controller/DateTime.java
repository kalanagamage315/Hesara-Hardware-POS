/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kalan
 */
public class DateTime {

    public static LocalDate getDate() {
        LocalDate currentDate = LocalDate.now();
        return currentDate;
    }
    public static LocalTime getTime() {
        LocalTime currentTime = LocalTime.now();
        return currentTime;
    }
    
}
