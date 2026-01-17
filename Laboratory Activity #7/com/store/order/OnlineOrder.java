package com.store.order;
import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable {
	
	public OnlineOrder(int oI, double a) {
		super(oI, a);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void processOrder() {
		System.out.println("Processing Order... | OrderID:"+getoI()+" |");
	}
	
	public void pay() {
			if(getoS()==OrderStatus.PENDING) {
				setOS(OrderStatus.PAID);
			}
		
	}
}
