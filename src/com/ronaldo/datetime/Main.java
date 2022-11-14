/**
 * 
 */
package com.ronaldo.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Ronaldo Gomes do Nascimento
 * Esse é um treinamento do professor Nélio Alves sobre data e hora no Java
 */
public class Main {
	public static void main(String[] args) {
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate date01 = LocalDate.now(); System.out.println("local Date: "+date01 );
		LocalDateTime date02 = LocalDateTime.now(); System.out.println("local Date Time: "+date02 );
		Instant date03 = Instant.now(); System.out.println("Gera em GMT - Instant: "+date03 );
		LocalDate date04 = LocalDate.parse("2022-11-14");System.out.println("Data a partir de texto - ISO8601 "+date04);
		LocalDateTime date05 = LocalDateTime.parse("2022-11-14T01:30:26");System.out.println("Local Date Time a partir de texto "+date05);
		Instant date06 = Instant.parse("2022-11-14T01:30:26Z");System.out.println("Instant a partir de texto "+date06);
		Instant date07 = Instant.parse("2022-11-14T01:30:26-03:00");System.out.println("Instant a partir de texto GMT "+date07);
		LocalDate date08 = LocalDate.parse("14/11/2022", format1);System.out.println("Formatter: "+date08);
		LocalDateTime date09 = LocalDateTime.parse("14/11/2022 20:28", format2);System.out.println("Formatter hora: "+date09);
		LocalDate date10 = LocalDate.of(2022, 7, 20);System.out.println("Data Inteira: "+date10);
		LocalDateTime date11 = LocalDateTime.of(2022, 7, 20, 1, 30);System.out.println("Data e Hora Inteira: "+date11);
		
	}

}
