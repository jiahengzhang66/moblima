package moblima;

public class AdultTicket extends Ticket {
	public AdultTicket (int seatID, int movieID) {
	super(seatID, movieID); 
	
	this.ticketType = "AdultTicket";
	this.priceModifier = 0;
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
