package com.entitys;

import com.blocks.BlocksEnum;
import com.crafting.*;

public class Player extends BaseEntity {
	
	BlocksEnum block;
	ActionsEnum action;
	
	private String user = "Guest";
	private int health = 100;
	private int epoints;
	private int stamina = 10;
	public int hitDamage;
	public boolean hit;
	public boolean jump;

	private int payStaminaJump;
	private int payStaminaSprint;
	private int payStaminaWalk;
	
	private Player() {
		
		spawn(1, 1, 1);
		
		Inventory playerInventory = new Inventory();
		playerInventory.setSlots(10);
		playerInventory.addBlock(block.BLOCK_LAB);
		
		if(hit == true && hitDamage == hitDamage) {
			health = health - hitDamage;
		} else {
			health = health;
		}
	}
	
	private void payStamina(int stamina) {

		if(action == ActionsEnum.JUMP) {
			stamina = stamina - payStaminaJump;
		} else if(action == ActionsEnum.SPRINT) {
			stamina = stamina - payStaminaSprint;
		} else if(action == ActionsEnum.WALK) {
			stamina = stamina - payStaminaJump;
		}
	}


	
}
