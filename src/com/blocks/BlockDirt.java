package com.blocks;

public class BlockDirt extends BaseBlock {
	
	BlocksEnum block;

	@Material(type = "MATERIAL_DIRT")
	@BlockAnnotation(blockID = 1, customBlock = false)
	public BlockDirt(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getTimeToMine(3);
		getColor("Brown/Green");
		generateBlock(10, 10, 10);
		isMineable(true);
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

	public void farmDirt() {
	}
}