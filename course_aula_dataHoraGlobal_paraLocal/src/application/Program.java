package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		for (String s : ZoneId.getAvailableZoneIds()) {// Retorna os nomes dos fuso horários customizados
			//System.out.println(s);
		}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());//Converte para Local date do sistema onde está sendo rodado o programa
		//System.out.println("r1 = " + r1);
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));//Converte para o LocalDate de Portugal
		//System.out.println("r2 = " + r2);
		
		LocalTime r3 = LocalTime.ofInstant(d06, ZoneId.systemDefault());//Converte para a hora do sistema onde está sendo rodado o programa
		//System.out.println("r3 = " + r3);
		
		LocalTime r4 = LocalTime.ofInstant(d06, ZoneId.of("Portugal"));//Converte para o LocalTime de Portugal
		//System.out.println("r4 = " + r4);
		
		LocalDateTime r5 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());//Converte para o LocalDateTime do sistema onde está sendo rodado o programa
		//System.out.println("r5 = " + r5);
		
		LocalDateTime r6 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));//Converte para o LocalDateTime de Portugal
		//System.out.println("r6 = " + r6);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());
		System.out.println("d05 segundos = " + d05.getSecond());
		




	}

}
