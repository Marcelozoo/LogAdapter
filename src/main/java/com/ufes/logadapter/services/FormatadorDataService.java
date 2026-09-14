package com.ufes.logadapter.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatadorDataService {
    final static private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("hh:mm:ss");
    final static private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static  String formatarHora(LocalTime  hora){
        return hora.format(formatoHora);
    }


    public static String formatarData(LocalDate data){
        return data.format(formatoData);
    }

}
