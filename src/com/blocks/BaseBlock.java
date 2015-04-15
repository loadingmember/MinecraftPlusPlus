package com.blocks;

import com.items.BaseItem;

public class BaseBlock {
	
	private int blockID;
	private float time;
	private String color;
	
	public BaseBlock(String blockName, boolean isStackable, int maxStack) {
	}
	
	public void getBlockID(int blockID) {
		this.blockID = blockID;
		
		if(blockID > 100) {
			System.out.print("ERROR: Block ID to high!!!");
		} else {
			System.out.print("Block ID is Perfect");
		}
		
	}
	
	public void getTimeToMine(int time) {
		this.time = time;
		
		if(time == 200) {
			System.out.println("Wow! Bro get a better mining tool");
		} else {
			System.out.print("Block Mined. Dropping Block...");
		}
	}
	
	public void getColor(String color) {
		this.color = color;
	}

	
	public void generateBlock(int levelX, int levelY, int levelZ) {
		
		levelX = levelX * 100;
		levelY = levelY * 100;
		levelZ = levelZ * 100;		
		
	}
	
	public void addBlock(String blockName, boolean isStackable, int maxStack) {
		
		if(isStackable = true) {
			maxStack = 64;
		} else {
			maxStack = 1;
		}
		
	}
	
	public void addBlockToInventory(BlocksEnum block) {
		
	}
	
	public void dropItem(BlocksEnum blocks) {
	}
	
	public void setCraftingRecipie(BaseItem item1, BaseItem item2, BaseItem item3) {
		
	}

}
