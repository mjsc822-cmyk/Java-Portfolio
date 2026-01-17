package com.store.main;
import com.store.order.*;


import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Order> order = new ArrayList<>();
		
		OnlineOrder bag = new OnlineOrder(1,1.0);
		OnlineOrder food = new OnlineOrder(2,2.0);
		OnlineOrder toy = new OnlineOrder(3,3.0);
				
		order.add(bag);
		order.add(food);
		order.add(toy);
		
	for( Order o : order) {
			o.processOrder();
		}	
	
		/*bag.pay();
		toy.setOS(OrderStatus.CANCELLED);
		food.setamount(100);*/
	
		Iterator<Order> or = order.iterator();
		while(or.hasNext()) {
			Order ordeer = or.next();
			
			if(ordeer.getoS()==OrderStatus.CANCELLED) {
				or.remove();
				System.out.println("|Order ID: "+ordeer.getoI()+" | Was Cancelled");
			}
			else { 
				System.out.println(ordeer.getOrderSummary());;
			}
		}
	}
}