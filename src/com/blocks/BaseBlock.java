package com.blocks;

import com.items.BaseItem;

public class BaseBlock {
	
	private int blockID;
	private float time;
	private String color;
	
	public BaseBlock(String blockName, boolean isStackable, int maxStack) {
	}
	
	protected void getBlockID(int blockID) {
		this.blockID = blockID;
		
		if(blockID > 100) {
			System.out.print("ERROR: Block ID to high!!!");
		} else {
			System.out.print("Block ID is Perfect");
		}
		
	}
	
	protected void getTimeToMine(int time) {
		this.time = time;
		
		if(time == 200) {
			System.out.println("Wow! Bro get a better mining tool");
		} else {
			System.out.print("Block Mined. Dropping Block...");
		}
	}
	
	protected void getColor(String color) {
		this.color = color;
	}

	
	protected void generateBlock(int levelX, int levelY, int levelZ) {
		
		levelX = levelX * 100;
		levelY = levelY * 100;
		levelZ = levelZ * 100;		
		
	}
	
	protected void addBlock(String blockName, boolean isStackable, int maxStack) {
		
		if(isStackable = true) {
			maxStack = 64;
		} else {
			maxStack = 1;
		}
		
	}
	
	protected void addBlockToInventory(BlocksEnum block) {
		
	}
	
	protected void placeBlock(int levelX, int levelY, int levelZ) {
		
		if(levelX == 1000000 && levelY < 100000000) {
			System.out.print("Place Block Invalid");
		} else {
			System.out.print("Place Block Valid");
		}
		
	}
	
	protected void dropItem(BlocksEnum blocks) {
	}
	
	protected void setCraftingRecipie(BaseItem item1, BaseItem item2, BaseItem item3) {
		
	}
	
	protected void useBlock(BlocksEnum block) {
		
	}

}
