package model.vo;

import model.data_structures.IQueue;

/**  
 * Agrupa las infracciones por (Xcoord, Ycoord) 
 */

public class InfraccionesLocalizacion extends EstadisticaInfracciones {	

	@Override
	public String toString() {
		return "InfraccionesLocalizacion [xcoord=" + xcoord + ", ycoord=" + ycoord + ",\n location=" + location
				+ ",\n addressID=" + addressID + ",\n streetID=" + streetID + ",\n totalInfracciones=" + totalInfracciones
				+ ",\n porcentajeAccidentes=" + porcentajeAccidentes + ",\n porcentajeNoAccidentes="
				+ porcentajeNoAccidentes + ",\n valorTotal=" + valorTotal + "]\n\n";
	}

	private double xcoord;
	
	private double ycoord;
	
	private String location;
	
	private int addressID;
	
	private int streetID;
	
	
	/**
	 * Instantiates a new infracciones localizacion.
	 * @param lista the lista
	 */
	
	public InfraccionesLocalizacion(double xcoor, double ycoor, String locat, int address, int street, IQueue<VOMovingViolations> lista) {
		super(lista);
		xcoord = xcoor;
		ycoord = ycoor;
		location = locat;
		addressID = address;
		streetID = street;

	}


	/**
	 * Gets the xcoord.
	 *
	 * @return the xcoord
	 */
	public double getXcoord() {
		return xcoord;
	}


	/**
	 * Sets the xcoord.
	 *
	 * @param xcoord the xcoord to set
	 */
	public void setXcoord(double xcoord) {
		this.xcoord = xcoord;
	}


	/**
	 * Gets the ycoord.
	 *
	 * @return the ycoord
	 */
	public double getYcoord() {
		return ycoord;
	}


	/**
	 * Sets the ycoord.
	 *
	 * @param ycoord the ycoord to set
	 */
	public void setYcoord(double ycoord) {
		this.ycoord = ycoord;
	}


	/**
	 * Gets the adress ID.
	 *
	 * @return the adressID
	 */
	public int getAdressID() {
		return addressID;
	}


	/**
	 * Sets the adress ID.
	 *
	 * @param adressID the adressID to set
	 */
	public void setAdressID(int adressID) {
		this.addressID = adressID;
	}


	/**
	 * Gets the street ID.
	 *
	 * @return the streetID
	 */
	public int getStreetID() {
		return streetID;
	}


	/**
	 * Sets the street ID.
	 *
	 * @param streetID the streetID to set
	 */
	public void setStreetID(int pStreetID) {
		this.streetID = pStreetID;
	}
	
	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

}
