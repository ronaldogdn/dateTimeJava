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
		Instant date03 = Instant.now(); System.out.println("Instant: "+date03 );

	}

}
