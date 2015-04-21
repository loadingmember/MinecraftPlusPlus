package com.blocks;

public class BlockStone extends BaseBlock {
	
	BlocksEnum block;
	
	@Material(type = "MATERIAL_STONE")
	@BlockAnnotation(blockID = 2)
	public BlockStone(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

		getColor("Grey");
		getTimeToMine(5);
		generateBlock(10, 10, 10);
		isMineable(true);
//		setCraftingRecipie(item1, item2, item3);

	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_STONE);
		
		addBlockToInventory(block.BLOCK_STONE);
	}

	@Override
	protected void isSteppedOn() {
		super.isSteppedOn();
		playSound("dirt_stepped.wav");
	}
}
