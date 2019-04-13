package model.vo;

import java.time.LocalDate;

import model.data_structures.IQueue;

/**  
 * Agrupa las infracciones por fecha 
 */

public class InfraccionesFecha extends EstadisticaInfracciones {

	@Override
	public String toString() {
		return "InfraccionesFecha [fecha=" + fecha + ",\n totalInfracciones=" + totalInfracciones
				+ ",\n porcentajeAccidentes=" + porcentajeAccidentes + ",\n porcentajeNoAccidentes="
				+ porcentajeNoAccidentes + ",\n valorTotal=" + valorTotal + "]\n\n";
	}
	
	private LocalDate fecha;
	/**
	 * Instantiates a new infracciones fecha.
	 * @param lista the lista
	 */
	
	public InfraccionesFecha( IQueue<VOMovingViolations> lista, LocalDate pFecha )
	{
		super(lista);
		fecha = pFecha;
	}


}
