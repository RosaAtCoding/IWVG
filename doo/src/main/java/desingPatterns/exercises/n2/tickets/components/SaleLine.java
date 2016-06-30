package desingPatterns.exercises.n2.tickets.components;

public class SaleLine extends Line {

	private int id;
	
	private int units;
	
	private int price;
	
	public SaleLine(int id, int units, int price) {
		this.id = id;
		this.units = units;
		this.price = price;
	}
	
	@Override
	public void accept(TicketComponentVisitor ticketComponentVisitor) {
		ticketComponentVisitor.visit(this);
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}