package model.vo;

/**
 * Representation of a Trip object
 */
public class VOMovingViolations {

	private String objectId, row, location, addresId, streetSegid,  xCoord, yCoord, ticketType, fineAmt, totalPaid, penalty1, penalty2, accidentIndicator, ticketsIssuedate, violationCode, violationDesc, row_id;

	public VOMovingViolations(String pObjectId, String pRow, String pLocation, String pAddresId, String pStreetSegid, String pXCoord, String pYCoord, String pTicketType, String pFineAmt, String pTotalPaid, String pPenalty1, String pPenalty2, String pAccidentIndicator, String pTicketsIssuedate, String pViolationCode, String pViolationDesc, String pRow_id){
		objectId= pObjectId;
		row=pRow;
		location=pLocation;
		addresId=pAddresId;
		streetSegid= pStreetSegid;
		xCoord=pXCoord;
		yCoord=pYCoord;
		ticketType=pTicketType;
		fineAmt=pFineAmt;
		totalPaid=pTotalPaid;
		penalty1=pPenalty1;
		penalty2=pPenalty2;
		accidentIndicator=pAccidentIndicator;
		ticketsIssuedate=pTicketsIssuedate;
		violationCode=pViolationCode;
		violationDesc=pViolationDesc;
		row_id = pRow_id;
	}
	@Override
	public String toString() {
		return "VOMovingViolations [objectId()=" + objectId() + ",\n getLocation()=" + getLocation()
				+ ",\n getTicketIssueDate()=" + getTicketIssueDate() + ",\n getTotalPaid()=" + getTotalPaid()
				+ ",\n getAccidentIndicator()=" + getAccidentIndicator() + ",\n getViolationDescription()="
				+ getViolationDescription() + ",\n getStreetSegId()=" + getStreetSegId() + ",\n getAddressId()="
				+ getAddressId() + "]\n\n";
	}


	/**
	 * @return id - Identificador único de la infracción
	 */
	public int objectId() {
		// TODO Auto-generated method stub
		return Integer.parseInt(objectId);
	}	
	
	
	/**
	 * @return location - Dirección en formato de texto.
	 */
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	/**
	 * @return date - Fecha cuando se puso la infracción .
	 */
	public String getTicketIssueDate() {
		// TODO Auto-generated method stub
		return ticketsIssuedate;
	}
	
	/**
	 * @return totalPaid - Cuanto dinero efectivamente pagó el que recibió la infracción en USD.
	 */
	public int getTotalPaid() {
		// TODO Auto-generated method stub
		return Integer.parseInt(totalPaid);
	}
	
	/**
	 * @return accidentIndicator - Si hubo un accidente o no.
	 */
	public String  getAccidentIndicator() {
		// TODO Auto-generated method stub
		return accidentIndicator;
	}
		
	/**
	 * @return description - Descripción textual de la infracción.
	 */
	public String  getViolationDescription() {
		// TODO Auto-generated method stub
		return violationDesc;
	}
	
	public String getStreetSegId() {
		return streetSegid;
	}
	
	public String getAddressId() {
		return addresId;
	}
}
