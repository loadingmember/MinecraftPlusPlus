package com.blocks;

import com.blocks.*;

public class BlockLog extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_LOG")
	@Block(blockID = 6)
	public BlockLog(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

		getColor("Brown");
		generateBlock(0, 0, 0);
		getTimeToMine(3);
//		setCraftingRecipie(item1, item2, item3);
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_LOG);
		addBlockToInventory(block.BLOCK_LOG);
	}

	@Override
	protected void isSteppedOn() {
		super.isSteppedOn();
		playSound("dirt_stepped.wav");
	}

}
