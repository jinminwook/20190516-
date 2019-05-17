package ex190516;

public class BookingTicket extends Ticket{
	
	
			//필드선언
		private int bookingDays;
		//생성자 선언
		BookingTicket(int ticketNum,int bookingDays) {
			super(ticketNum);
			this.bookingDays=bookingDays;
	}
	//예약 일수에 따른 티켓가격 지정을 위한 메소드
		
		double getPrice() {
			if(bookingDays>=30) {
				ticketPrice = ticketPrice * 0.5;
			}else if (bookingDays>=10) {
				ticketPrice = ticketPrice *0.8;
			}else if (bookingDays>=5) {
				ticketPrice = ticketPrice *0.9;
			}
			return ticketPrice;
		}
		
		//예약 일수 리턴을 위한 메소드
		int getBookingDays() {
			return bookingDays;
			
		}
	
	//a사전예약 티켓 티켓 번호와 사전예약 일수 정보를 가지고있음.
	
	
	
	
	//언제 예매를 했느냐에 따라 가격이 달라짐.
	//1 30일 전 :50%할인
	//2 10일 전 :20%할인
	//3 5일 전 :10%할인
	
}
