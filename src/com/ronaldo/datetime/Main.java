/**
 * 
 */
package com.ronaldo.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Ronaldo Gomes do Nascimento
 * Esse é um treinamento do professor Nélio Alves sobre data e hora no Java
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter format4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter format5 = DateTimeFormatter.ISO_INSTANT;
		
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
		//transformar para texto
		System.out.print("Formatter direto: date04.format(format1): ");
		System.out.println(date04.format(format1));
		System.out.print("format1.format(date04) : ");
		System.out.println(format1.format(date04));
		System.out.println("date 04 Chamando direto no param");
		System.out.println("date04 "+date04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("date05 "+date05.format(format1));
		System.out.println("date05 "+date05.format(format2));
		System.err.println("Instant date06: "+format3.format(date06));
		System.out.println("date05: "+date05.format(format4));
		System.out.println("date06: "+format5.format(date06));	
		//Global para local
		LocalDate result1 =  LocalDate.ofInstant(date06, ZoneId.systemDefault());
		LocalDate result2 =  LocalDate.ofInstant(date06,ZoneId.of("Portugal"));
		LocalDateTime result3 =  LocalDateTime.ofInstant(date06, ZoneId.systemDefault());
		LocalDateTime result4 =  LocalDateTime.ofInstant(date06,ZoneId.of("Portugal"));
		
		System.out.println("Global para local");
		System.out.println("Local: "+result1);
		System.out.println("Portugal: "+result2);
		System.out.println("LocalDateTime: "+result3);
		System.out.println("LocalDateTime Portugal: "+result4);
		System.out.println("pegar o dia da data");
		System.out.println(date04.getDayOfMonth());
		System.out.println("pegar o mês da data");
		System.out.println(date04.getMonthValue());
		System.out.println("pegar o ano da data");
		System.out.println(date04.getYear());
		System.out.println("pegar a hora da data");
		System.out.println(date05.getHour());
		System.out.println("pegar o minuto da data");
		System.out.println(date05.getMinute());
		System.out.println("pegar o segundo da data");
		System.out.println(date05.getSecond());
		
	}

}
