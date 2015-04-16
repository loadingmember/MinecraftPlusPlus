package com.blocks;

import com.crafting.*;

public class BlockChem extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_CHEM")
	public BlockChem(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getBlockID(10);
		getTimeToMine(5);
		getColor("MATERIAL_CHEM");
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_CHEM);
		
		addBlockToInventory(block.BLOCK_CHEM);
	}

	protected void useBlock(BlocksEnum block) {
		ChemCrafting chem = new ChemCrafting();
		
		chem.open();
	}

}
