package model.vo;

import model.data_structures.IQueue;

/**
 * Agrupa las infracciones mostrando estadísticas sobre los datos 
 * como el total de infracciones que se presentan en ese conjunto,
 * el porcentaje de infracciones con y sin accidentes con respecto al total,
 * el valor total de las infracciones que se deben pagar y una lista con 
 * las infracciones. 
 */

public class EstadisticaInfracciones {
	
	@Override
	public String toString() {
		return "EstadisticaInfracciones [totalInfracciones=" + totalInfracciones + ",\n porcentajeAccidentes="
				+ porcentajeAccidentes + ",\n porcentajeNoAccidentes=" + porcentajeNoAccidentes + ",\n valorTotal="
				+ valorTotal + "]\n\n";
	}

	/**	
	 * Numero total de infraciones del conjunto
	 */
	
	protected int totalInfracciones;
	
	/**
	 * Porcentaje de las infracciones con accidentes con respecto al total
	 */
	
	protected double porcentajeAccidentes;
	
	/**
	 * Porcentaje de las infracciones sin accidentes con respecto al total
	 */
	
	protected double porcentajeNoAccidentes; 
	
	/**
	 * Valor total de las infracciones que se debe pagar.
	 */
	
	protected double valorTotal;	
	
	/**
	 * Lista con las infracciones que agrupa el conjunto
	 */
	
	protected IQueue<VOMovingViolations> listaInfracciones;
	
	
	/**
	 * Crea un nuevo conjunto con las infracciones
	 * @param listaInfracciones - Lista con las infracciones que cumplen el criterio de agrupamiento
	 */
	
	public EstadisticaInfracciones(IQueue<VOMovingViolations> lista) {
		this.listaInfracciones = lista;
		totalInfracciones = listaInfracciones.size();
		
		//TODO Hacer el calculo de porcentajeAccidentes, porcentajeNoAccidentes y valorTotal
		porcentajeAccidentes = -50.0;   //TODO Calcular con base en la lista
		porcentajeNoAccidentes = -50.0; //TODO Calcular con base en la lista
		valorTotal = -100000.0;         //TODO Calcular con base en la lista
	}
	
	//=========================================================
	//Metodos Getters and Setters
	//=========================================================
	
	/**
	 * Gets the total infracciones.
	 * @return the total infracciones
	 */
	
	public int getTotalInfracciones() {
		return totalInfracciones;
	}	
	
	
	/**
	 * Gets the porcentaje accidentes.	 *
	 * @return the porcentaje accidentes
	 */
	
	public double getPorcentajeAccidentes() {
		//TODO Completar para que calcule el porcentaje de las infracciones del conjunto que sufrieron accidentes
		//con respecto al total.
		return porcentajeAccidentes;
	}	


	/**
	 * Gets the porcentaje no accidentes.
	 *
	 * @return the porcentaje no accidentes
	 */
	public double getPorcentajeNoAccidentes() {
		//TODO Completar para que calcule el porcentaje de las infracciones del conjunto que NO sufrieron accidentes
		//con respecto al total.
		return porcentajeNoAccidentes;
	}

	/**
	 * Gets the valor total.
	 *
	 * @return the valor total
	 */
	public double getValorTotal() {
		//TODO Completar para calcular el valor total de dinero que representan las infracciones
		return valorTotal;
	}	

	/**
	 * Gets the lista infracciones.
	 *
	 * @return the lista infracciones
	 */
	public IQueue<VOMovingViolations> getListaInfracciones() {
		return listaInfracciones;
	}

	/**
	 * Sets the lista infracciones.
	 *
	 * @param listaInfracciones the new lista infracciones
	 */
	
	public void setListaInfracciones(IQueue<VOMovingViolations> listaInfracciones) {
		this.listaInfracciones = listaInfracciones;
	}
}
