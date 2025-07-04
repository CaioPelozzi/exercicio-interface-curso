package model.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilsDate {
	
	public static LocalDateTime stringToDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dateFormat = LocalDateTime.parse(date, formatter);
		return dateFormat;
	}
	
	public static String dateToString(LocalDateTime data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String dateFormat = data.format(formatter);
		return dateFormat;
	}
}
