package com.blocks;

import com.blocks.*;
import com.crafting.*;

public class BlockStone extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_STONE")
	@Block(blockID = 2)
	public BlockStone(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

		getColor("Grey");
		getTimeToMine(5);
		generateBlock(10, 10, 10);
//		setCraftingRecipie(item1, item2, item3);

	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_STONE);
		
		addBlockToInventory(block.BLOCK_STONE);
	}
}
