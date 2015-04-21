package com.blocks;

import com.crafting.OvenInventory;

public class BlockOven extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_OVEN")
	@BlockAnnotation(blockID = 4)
	public BlockOven(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

		getTimeToMine(3);
		getColor("OVEN_MATERIAL");
		generateBlock(10, 10, 10);
		isMineable(true);
//		setCraftingRecipie(item1, item2, item3);
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_OVEN);
		
		addBlockToInventory(block.BLOCK_OVEN);
	}

	public void useBlock() {
		OvenInventory oven = new OvenInventory();
		
		oven.setItemOvenSlot();
		oven.setBurnOvenSlot();
		oven.setFinishSlot();
	}

	@Override
	protected void isSteppedOn() {
		super.isSteppedOn();
		playSound("dirt_stepped.wav");
	}

}
