package com.items;

public class BaseiPhone {
	
	public BaseiPhone(String carrier, int battery, int iphoneModel) {
	}
	
	int battery = 100;
	
	public void getCarrier(String carrier) {
		
		if(carrier == "Sprint") {
			System.out.print("Your Carrier is Spirnt");
		} else if(carrier == "AT&T") {
			System.out.print("Your Carrier is AT&T");
		} else if(carrier == "TMobile") {
			System.out.print("Your Carrier is TMoblie");
		}
	}
	
	public void getBattery(int batteryPercent) {
		
		if(batteryPercent < 100) {
			System.out.print("Your phone is at full battery");
		} if(batteryPercent < 1) {
			System.out.print("Your Phone is almost Dead");
		}
	}
	
	public void getModel(String iphoneModel) {
		
		if(iphoneModel == "iPhone 6+") {
			System.out.print("You Have the top of the line iphone");
		} else if(iphoneModel == "iPhone 3G") {
			System.out.print("Wow You have a terrible phone");
		}
		
	}

}
