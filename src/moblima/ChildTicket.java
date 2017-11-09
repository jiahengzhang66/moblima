package moblima;

public class ChildTicket extends Ticket {
	
	public ChildTicket (int seatID) {
	super(seatID); 
	this.ticketType = "ChildTicket";
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
