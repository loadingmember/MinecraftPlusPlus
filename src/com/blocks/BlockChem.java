package com.blocks;

public class BlockChem extends BaseBlock {
	
	BlocksEnum item;
	
	@Material(type = "MATERIAL_CHEM")
	public BlockChem(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getBlockID(10);
		getTimeToMine(5);
		getColor("MATERIAL_CHEM");
	}
	
	public void blockDestroyed() {
		dropItem(item.BLOCK_CHEM);
	}

}
