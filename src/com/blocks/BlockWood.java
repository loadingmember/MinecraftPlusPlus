package com.blocks;

public class BlockWood extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_WOOD")
	@Block(blockID = 5)
	public BlockWood(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

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

	@Override
	protected void isSteppedOn() {
		super.isSteppedOn();
		playSound("dirt_stepped.wav");
	}
}
