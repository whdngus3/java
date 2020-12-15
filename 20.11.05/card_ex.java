package chap5;

public class card_ex {
	public static void main(String[] args) {
		card car1 = new card();
		card car2 = new card();
		
		car1.kind="clober";
		car1.number=10;		
		car1.kind="heart";
		car2.number=7;
		
		card.height=200;
		card.width=100;
		
		
		car1.disp();
		car2.disp();
		card.prn();
		card.prn();
		
	}
}
