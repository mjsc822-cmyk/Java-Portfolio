package com.store.order;

public abstract class Order {

	private int orderId;
	private double amount;
	private OrderStatus status;
	
	Order(int oI, double a){
		this.orderId=oI;
		this.amount=a;
		this.status=OrderStatus.PENDING;
		
	}
	
	 public abstract void processOrder();
	 
	 public String getOrderSummary() {
		 return "|Order Id: "+orderId +
		  " |Amount: "+amount +
		  " |Order Status: "+status;	 
	 }
	 
	 public int getoI() {
		 	return orderId;
	 }
	 
	 public double getA() {
		 	return amount;
	 }
	 public OrderStatus getoS() {
		 return status;
	 }
	 
	 public double setamount(double a) {

		 if(a>=0) {
			 return this.amount=a; 
		
		 }
		 else {
			 System.out.println("|Order ID: "+orderId+" = "+a+"|"+" Invalid Value. Amount can't be negative!"+"\n");
			 return this.amount;
		 }
	 }
	 public OrderStatus setOS(OrderStatus os) {
		return this.status=os;
		 
	 }
}
