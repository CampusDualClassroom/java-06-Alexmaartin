package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise06 {

    public static void main(String[] args) {
        // Creamos una instancia del calendario
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH) + 1;
        int hour = now.get(Calendar.HOUR_OF_DAY);
        checkHour(hour);
        checkSeason(month);
    }

    //TODO ↓
    // Si la hora es desde las 0:00 a las 6:59, imprimir por pantalla → It's night
    // Si la hora es desde las 7:00 a las 13:59, imprimir por pantalla → It's morning
    // Si la hora es desde las 14:00 a las 20:59, imprimir por pantalla → It's afternoon
    // Si la hora es desde las 21:00 a las 23:59, imprimir por pantalla → It's night
    public static void checkHour(int hour) {
        String timeSlot = "";
        {
            switch (hour) {
                case 21: timeSlot = "It's night"; break;
                case 22:timeSlot = "It's night"; break;
                case 23:timeSlot = "It's night"; break;
                case 0:timeSlot = "It's night"; break;
                case 1:timeSlot = "It's night"; break;
                case 2:timeSlot = "It's night"; break;
                case 3:timeSlot = "It's night"; break;
                case 4:timeSlot = "It's night"; break;
                case 5:timeSlot = "It's night"; break;
                case 6: timeSlot = "It's night"; break;
                case 7:timeSlot = "It's morning"; break;
                case 8:timeSlot = "It's morning"; break;
                case 9:timeSlot = "It's morning"; break;
                case 10:timeSlot = "It's morning"; break;
                case 11:timeSlot = "It's morning"; break;
                case 12:timeSlot = "It's morning"; break;
                case 13: timeSlot = "It's morning"; break;
                case 14:timeSlot = "It's afternoon"; break;
                case 15:timeSlot = "It's afternoon"; break;
                case 16:timeSlot = "It's afternoon"; break;
                case 17:timeSlot = "It's afternoon"; break;
                case 18:timeSlot = "It's afternoon"; break;
                case 19:timeSlot = "It's afternoon"; break;
                case 20: timeSlot = "It's afternoon"; break;
            }
            System.out.println(timeSlot);
        }
    }

    //TODO ↓
    // Si es Enero, Febrero o Marzo, imprimir por pantalla → Winter
    // Si es Abril, Mayo o Junio, imprimir por pantalla → Spring
    // Si es Julio, Agosto o Septiembre, imprimir por pantalla → Summer
    // Si es Octubre, Noviembre o Diciembre, imprimir por pantalla → Autumn
    public static void checkSeason(int month) {
        String season = "";
        switch (month) {
            case 1:season = "Winter";break;
            case 2:season = "Winter";break;
            case 3:season = "Winter";break;
            case 4:season = "Spring";break;
            case 5:season = "Spring";break;
            case 6: season = "Spring";break;
            case 7:season = "Summer";break;
            case 8:season = "Summer";break;
            case 9: season = "Summer";break;
            case 10:season = "Autumn";break;
            case 11:season = "Autumn";break;
            case 12: season = "Autumn";break;
        }
        System.out.println(season);
    }


}
