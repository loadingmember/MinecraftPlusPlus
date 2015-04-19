package com.blocks;

import com.blocks.BaseBlock;

public class BlockDirt extends BaseBlock {
	
	BlocksEnum block;

	@Material(type = "MATERIAL_DIRT")
	@Block(blockID = 1)
	public BlockDirt(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getTimeToMine(3);
		getColor("Brown/Green");
		generateBlock(10, 10, 10);
//		setCraftingRecipie(item1, item2, item3);		
	}
	
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_DIRT);
		
		addBlockToInventory(block.BLOCK_DIRT);
	}

	@Override
	protected void isSteppedOn() {
		super.isSteppedOn();
		playSound("dirt_stepped.wav");
	}

	public void removeGrass() {

	}
}