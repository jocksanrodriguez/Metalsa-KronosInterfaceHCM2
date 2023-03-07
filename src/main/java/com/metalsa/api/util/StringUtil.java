package com.metalsa.api.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	private StringUtil() {
	}

	public static String deleteSpecialsChars(String chainData) {
		
		return chainData.replaceAll("[^a-zA-Z]", " ");
	}
	
	public static String convertArrayToString(String[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		try {
	        for (int i = 0; i < array.length; i++) {

	            stringBuilder.append(array[i].concat(","));

	        }
	        
	        return stringBuilder.toString().substring(0, stringBuilder.toString().length()-1);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String[] convertStringToArray(String chainData, String delimiter) {
		
		try {
			String [] data = chainData.split(delimiter, -1);
			return data;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*Receives a date as string and change current format to new format*/
	public static String changePatternDateInString (String dateString, String oldFormat, String newFormat) {
		
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(oldFormat);
			Date d = sdf.parse(dateString);
			sdf.applyPattern(newFormat);
			//String newDateString = sdf.format(d);
			return sdf.format(d);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static String convertDateToString(Date date) {
		if (date != null) {
            SimpleDateFormat formateador = new SimpleDateFormat("dd'/'MM'/'yyyy");
            return formateador.format(date);
        } else {
            return null;
        }
	}
	
	/*Receives a a date as string and return date type*/
	public static Date convertStringToDate(String dateString, SimpleDateFormat format)  {
		
		try{
			Date date = format.parse(dateString);
			return date;
		}catch(ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*By default, in HCM Oracle Application, the date format required for web services report is month, day, year, separate by dash.  
	* @param Date fecha
	* @return String fecha
	*/
	public static String encodeFechaHcm(Date fecha) {
        if (fecha != null) {
            SimpleDateFormat formateador = new SimpleDateFormat("MM'-'dd'-'yyyy");
            return formateador.format(fecha);
        } else {
            return null;
        }
    }
	
	/*Convert date format in specific string. It requires a Date and format. If format string is null or is incorrect spelled, then return null.
	* @param
	* @return User
	*/
	public static String encodeFechaHcm(Date fecha, SimpleDateFormat formato) {
		if (fecha != null ) {
            SimpleDateFormat formateador = formato;
            return formateador.format(fecha);
        } else {
            return null;
        }
	}
}
