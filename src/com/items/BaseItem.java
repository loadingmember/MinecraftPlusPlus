package com.items;

public class BaseItem {
	
	private int itemID;
	private int itemTime;

	public BaseItem(String itemName, boolean isStackable, int maxStack) {
	}
	
	public void getItemID(int itemID) {
		this.itemID = itemID;
		
		if(itemID > 100) {
			System.out.print("ERROR: Item ID to high!!!");
		} else {
			System.out.print("Item ID is perfect");
		}	
	}
	
	public void getTimeToUse(int itemTime) {
		this.itemTime = itemTime;
		
		if(itemTime == 200) {
			System.out.println("Wow! Bro get a better mining tool");
		} else {
			System.out.print("Block Mined. Dropping Block...");
		}
	}
	
	public void addItemToInventory() { //Items Enum soon
		
	}
	
	public void aquireSouce() {
		
	}
	
	public void setCraftingRecipie(ItemsEnum item1, ItemsEnum item2, ItemsEnum item3) {
		
	}
	
	public void destroyItem() {
		
	}

}
