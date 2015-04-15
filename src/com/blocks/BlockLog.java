package com.blocks;

import com.blocks.*;

public class BlockLog extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_LOG")
	public BlockLog(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getBlockID(6);
		getColor("Brown");
		generateBlock(0, 0, 0);
		getTimeToMine(3);
//		setCraftingRecipie(item1, item2, item3);
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_LOG);
		addBlockToInventory(block.BLOCK_LOG);
	}
	
	

}
