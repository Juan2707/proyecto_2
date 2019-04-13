package model.logic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ManejoFechaHora {

	/**
	 * Convertir fecha - hora a un objeto LocalDate
	 * @param fechaHora fecha - hora en formato yyyy-MM-dd'T'HH:mm:ss'.000Z' con yyyy-MM-dd para la fecha y  HH:mm:ss para la hora
	 * @return objeto LDT con fecha - hora
	 */
	public static LocalDateTime convertirFecha_Hora_LDT(String fechaHora)
	{
		return LocalDateTime.parse(fechaHora, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'.000Z'"));
	}

	/**
	 * Convertir hora a un objeto LocalTime
	 * @param hora hora en formato HH:mm:ss con HH para hora, mm para minutos y ss para segundos
	 * @return objeto LD con fecha
	 */
	public static LocalTime convertirHora_LT(String hora)
	{
		return LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	/**
	 * Convertir fecha a un objeto LocalDate
	 * @param fecha fecha en formato yyyy-MM-dd con yyyy para agno, MM para mes y dd para dia
	 * @return objeto LD con fecha
	 */
	public static LocalDate convertirFecha_LD(String fecha)
	{
		return LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}


}
