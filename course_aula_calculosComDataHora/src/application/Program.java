package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate semAntLocalDate = d04.minusWeeks(1);//1 semana a menos
		LocalDate proxSemLocalDate = d04.plusDays(7);//7 dias a mais
		LocalDate proxAnoLocalDate = d04.plusYears(7);//7 anos a mais
		LocalDate proxMesLocalDate = d04.plusMonths(7);//7 meses a mais
		
		LocalDateTime semAntLocalDateTime = d05.minusWeeks(1);
		LocalDateTime diasPostLocalDateTime = d05.minusDays(5);//5 dias a mais
		LocalDateTime mesAntLocalDateTime = d05.minusMonths(7);
		LocalDateTime AnoAntLocalDateTime = d05.minusYears(7);
		LocalDateTime horAntLocalDateTime = d05.minusHours(7);
		LocalDateTime minAntLocalDateTime = d05.minusMinutes(7);
		LocalDateTime segAntLocalDateTime = d05.minusSeconds(7);
		LocalDateTime proxSemLocalDateTime = d05.plusWeeks(1);//1 semana a mais
		
		Instant semAntInstant = d06.minus(7, ChronoUnit.DAYS);//7 dias a menos
		Instant semProxInstant = d06.plus(7, ChronoUnit.DAYS);//7 dias a mais
		
		Duration t1 = Duration.between(semAntLocalDate.atStartOfDay(), d04.atStartOfDay());//Necessário a conversão
		Duration t2 = Duration.between(semAntLocalDateTime, d05);//Duração entre duas datas
		Duration t3 = Duration.between(semAntInstant, d06);
		
		
		System.out.println("Hora base = " + d04);
		System.out.println();
		
		System.out.println("semAntLocalDate = " + semAntLocalDate);
		System.out.println("proxSemLocalDate = " + proxSemLocalDate);
		System.out.println("proxAnoLocalDate = " + proxAnoLocalDate);
		System.out.println("proxMesLocalDate = " + proxMesLocalDate);
		System.out.println();
		
		System.out.println("Hora base = " + d05);
		System.out.println();
				
		System.out.println("semAntLocalDateTime = " + semAntLocalDateTime);
		System.out.println("mesAntLocalDateTime = " + mesAntLocalDateTime);
		System.out.println("AnoAntLocalDateTime = " + AnoAntLocalDateTime);
		System.out.println("horAntLocalDateTime = " + horAntLocalDateTime);
		System.out.println("minAntLocalDateTime = " + minAntLocalDateTime);
		System.out.println("segAntLocalDateTime = " + segAntLocalDateTime);
		System.out.println("proxSemLocalDateTime = " + proxSemLocalDateTime);
		System.out.println();
		
		System.out.println("Hora base = " + d06);
		System.out.println();
		
		System.out.println("semAntInstant = " + semAntInstant);
		System.out.println("semProxInstant = " + semProxInstant);
		System.out.println();
		
		System.out.println("Duração entre duas datas LocalDate = " + t1.toDays());
		System.out.println("Duração entre duas datas LocalDateTime = " + t2.toDays());
		System.out.println("Duração entre duas datas Instant = " + t3.toDays());
		System.out.println();		
			
	}

}
