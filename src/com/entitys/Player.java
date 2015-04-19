package com.entitys;

import com.World.World;
import com.blocks.BlocksEnum;
import com.crafting.*;
import com.blocks.*;

public class Player extends BaseEntity {
	
	BlocksEnum block;
	ActionsEnum action;
	EntityEnum entity;
	BlockDirt dirt = new BlockDirt("Block_Dirt", true, 64);
	
	private String user = "Guest";
	private int health = 100;
	private int epoints;
	private int stamina = 10;
	public int hitDamage;
	public boolean hit;
	public boolean jump;

	private int payStaminaJump = 3;
	private int payStaminaSprint = 2;
	private int payStaminaWalk = 2;

	private int staminaPayDealy;
	
	public Player() {

		Inventory playerInventory = new Inventory();
		playerInventory.setSlots(10);
		playerInventory.addBlock(block.BLOCK_LAB);
		
		if(hit == true && hitDamage == hitDamage) {
			health = health - hitDamage;
		} else {
			health = health;
		}

		if(entity == EntityEnum.PLAYER && isOnBlock() == true && block == BlocksEnum.BLOCK_DIRT) {
			dirt.removeGrass();
		} else  {
			dirt.generateBlock(10, 01, 1);
		}
	}
	
	private void payStamina(int stamina) {

		if(action == ActionsEnum.JUMP) {
			stamina = stamina - payStaminaJump;
			staminaPayDealy = 2;
		} else if(action == ActionsEnum.SPRINT) {
			stamina = stamina - payStaminaSprint;
			staminaPayDealy = 3;
		} else if(action == ActionsEnum.WALK) {
			stamina = stamina - payStaminaWalk;
			staminaPayDealy = 0;
		}
	}

	public void generateInWorld(World world) {
		spawn(1, 1, 1);
	}
}
