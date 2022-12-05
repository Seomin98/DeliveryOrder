package com.kh.smw;

public class OrderRun {
	public static void main(String [] args) {
		OrderFunction oFunc = new OrderFunction();
		EXIT :
		while(true) {
			int choice = oFunc.OrderMenu();
			switch(choice) {
			case 1 : 
				oFunc.choiceMenu();
				break;
			case 2 : 
				oFunc.checkMenu();
				break;
			case 3 : oFunc.deliveryTime();
				break EXIT;
			default : break;
			
			}
		}
	}

}
