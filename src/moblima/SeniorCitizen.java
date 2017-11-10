package moblima;

public class SeniorCitizen extends Ticket {
	public SeniorCitizen (int seatID, int movieID) {
	super(seatID, movieID); 
	this.ticketType = "Senior Citizen Ticket";
	this.priceModifier = -5;
	}
	
	public void setPriceModifier(float priceModifier) {
		this.priceModifier = priceModifier;
	};
	
	public String getTicketType() {
		return this.ticketType;
	};
	public float getPriceModifier() {
		return this.priceModifier;
	};
}
