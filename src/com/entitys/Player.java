package com.entitys;

import com.crafting.*;

public class Player {
	
	private String user = "Guest";
	private int health = 100;
	private int epoints;
	private int stamina = 10;
	public int hitDamage;
	public boolean hit;
	public boolean jump;
	
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
	
	private void payStamina(int stamina) {
		if(stamina == 10 && jump) {
			payStamina(1);
		} else {
			stamina = stamina;
		}
	}
	
}
