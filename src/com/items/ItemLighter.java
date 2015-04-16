package com.items;

public class ItemLighter extends BaseItem {
	
	ItemsEnum item;

	public ItemLighter(String itemName, boolean isStackable, int maxStack) {
		super(itemName, isStackable, maxStack);
		
		getItemID(6);
		getTimeToUse(1);
		setCraftingRecipie(item.ITEM_FIRE, item.ITEM_IRON, null);
	}
	
	public void itemDead() {
		destroyItem();
	}
	
	public void startFire(ItemsEnum item) {
	}
	
	public void useLighter() {

		if(item.ITEM_LIGHTER != null) {
			startFire(item.ITEM_FIRE); 
		}
	}

}
