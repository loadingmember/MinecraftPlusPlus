package com.items;

import com.blocks.BlocksEnum;

public class BaseItem {
	
	private int itemID;
	private int itemTime;

	public BaseItem(String itemName, boolean isStackable, int maxStack) {
	}
	
	protected void getItemID(int itemID) {
		this.itemID = itemID;
		
		if(itemID > 100) {
			System.out.print("ERROR: Item ID to high!!!");
		} else {
			System.out.print("Item ID is perfect");
		}	
	}
	
	protected void getTimeToUse(int itemTime) {
		this.itemTime = itemTime;
		
		if(itemTime == 200) {
			System.out.println("Wow! Bro get a better mining tool");
		} else {
			System.out.print("Block Mined. Dropping Block...");
		}
	}
	
	protected void addItemToInventory() { //Items Enum soon
		
	}
	
	protected void addBlockToInventory(BlocksEnum block) {
		
	}
	
	protected void aquireSouce() {
		
	}
	
	protected void setCraftingRecipie(ItemsEnum item1, ItemsEnum item2, ItemsEnum item3) {
		
	}
	
	protected void destroyItem() {
		
	}

}
