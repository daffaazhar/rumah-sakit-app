package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatterService {
    public static String formatDate(Date dateInput) {
        String outputDateStr = null;
        try {
            // Create a SimpleDateFormat object to parse the input date format
            SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", 
                    Locale.ENGLISH);
            // Parse the input date string
            Date date = inputFormat.parse(dateInput.toString());
            // Create a SimpleDateFormat object for the desired output format (Indonesian)
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy", 
                    new Locale("id", "ID"));
            // Format the date to the desired output format
            outputDateStr = outputFormat.format(date);
        } catch (ParseException ex) {
            // Handle the ParseException here (e.g., display an error message)
            System.err.println("Error parsing the date: " + ex.getMessage());
        }
        return outputDateStr;
    }
}
