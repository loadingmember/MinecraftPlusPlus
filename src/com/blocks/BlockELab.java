package com.blocks;

import com.crafting.CraftingInventory;

public class BlockELab extends BaseBlock {
	
	BlocksEnum block;
	
	private int x;
	private int y;
	private int z;
	
	@Material(type = "MATERIAL_LAB")
	@Block(blockID = 5)
	public BlockELab(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);

		getColor("LAB_MATERIAL");
		generateBlock(x, y, z);
		getTimeToMine(5);
//		setCraftingRecipie(item1, item2, item3);
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_ELAB);
		
		addBlockToInventory(block.BLOCK_ELAB);
	}
	
	public void useELab() {
		CraftingInventory eLabCrafting = new CraftingInventory();
		
		eLabCrafting.setSlots(12);
		
		System.out.println("Emerald Crafting Inventroy Open");
	}

}
