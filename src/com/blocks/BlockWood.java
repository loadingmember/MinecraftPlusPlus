package com.blocks;

public class BlockWood extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_WOOD")
	public BlockWood(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getBlockID(5);
		getColor("Brown");
		getTimeToMine(6);
		generateBlock(0, 0, 0);
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_WOOD);
		
		addBlockToInventory(block.BLOCK_WOOD);
	}
	
	public void useBlock() {
		placeBlock(1, 1, 1);
	}
}
