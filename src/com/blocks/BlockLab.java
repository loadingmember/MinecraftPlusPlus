package com.blocks;

import com.crafting.CraftingInventory;

public class BlockLab extends BaseBlock {
	
	BlocksEnum block;
	
	private int x;
	private int y;
	private int z;
	
	@Material(type = "MATERIAL_LAB")
	@Block(blockID = 3)
	public BlockLab(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

		getColor("LAB_MATERIAL");
		generateBlock(x, y, z);
		getTimeToMine(5);
//		setCraftingRecipie(item1, item2, item3);		
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_LAB);
		
		addBlockToInventory(block.BLOCK_LAB);
	}
	
	public void useLab() {
		CraftingInventory labCrafting = new CraftingInventory();
		
		labCrafting.setSlots(9);
		
		System.out.println("Crafting Inventroy Open");
	}

}
