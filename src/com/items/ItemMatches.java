package com.items;

public class ItemMatches extends BaseItem {
	
	ItemsEnum item;

	public ItemMatches(String itemName, boolean isStackable, int maxStack) {
		super(itemName, isStackable, maxStack);
		
		getItemID(7);
		getTimeToUse(4);
		setCraftingRecipie(item.ITEM_STICK, item.ITEM_FIRE, item.ITEM_MATCHMATERIAL);
	}
	
	public void itemDead() {
		destroyItem();
	}
	
	public void useMatches() {

		if(item.ITEM_MATCHES != null) {
			startFire(item.ITEM_FIRE); 
		}
	}

	private void startFire(ItemsEnum itemFire) {
		
		
		
	}

}
