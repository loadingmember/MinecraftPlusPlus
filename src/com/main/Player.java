package com.main;

import com.crafting.*;

public class Player {
	
	private String user = "Guest";
	private int health = 100;
	private int epoints;
	private int stamina = 10;
	public int hitDamage;
	public boolean hit;
	
	private Player() {
		
		Inventory playerInventory = new Inventory();
		playerInventory.setSlots(10);
		playerInventory.addBlockToSlot("Lab");
		
		if(hit == true && hitDamage == hitDamage) {
			health = health - hitDamage;
		} else {
			health = health;
		}
		
		
		
	}
	
}
