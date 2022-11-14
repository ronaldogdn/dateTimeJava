/**
 * 
 */
package com.ronaldo.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Ronaldo Gomes do Nascimento
 * Esse é um treinamento do professor Nélio Alves sobre data e hora no Java
 */
public class Main {
	public static void main(String[] args) {
		LocalDate date01 = LocalDate.now(); System.out.println("local Date: "+date01 );
		LocalDateTime date02 = LocalDateTime.now(); System.out.println("local Date Time: "+date02 );
		Instant date03 = Instant.now(); System.out.println("Gera em GMT - Instant: "+date03 );
		LocalDate date04 = LocalDate.parse("2022-11-14");System.out.println("Data a partir de texto - ISO8601 "+date04);
		LocalDateTime date05 = LocalDateTime.parse("2022-11-14T01:30:26");System.out.println("Local Date Time a partir de texto "+date05);
		Instant date06 = Instant.parse("2022-11-14T01:30:26Z");System.out.println("Instant a partir de texto "+date06);
		Instant date07 = Instant.parse("2022-11-14T01:30:26-03:00");System.out.println("Instant a partir de texto GMT "+date07);

	}

}
