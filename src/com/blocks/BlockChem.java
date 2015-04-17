package com.blocks;

import com.crafting.ChemInventory;
import com.items.ItemsEnum;

public class BlockChem extends BaseBlock {
	
	ItemsEnum item;
	BlocksEnum block;
	
	@Material(type = "MATERIAL_CHEM")
	public BlockChem(String blockName, boolean isStackable, int maxStack) {
		super(blockName, isStackable, maxStack);
		
		getBlockID(10);
		getTimeToMine(5);
		getColor("MATERIAL_CHEM");
		generateBlock(0, 0, 0);
	}
	
	public void blockDestroyed() {
		dropItem(block.BLOCK_CHEM);
		
		addBlockToInventory(block.BLOCK_CHEM);
		
		setCraftingRecipie(item.ITEM_IRON, item.ITEM_TECHNOLOGY, item.ITEM_WIRE);
	}
	
	public void useChemLab() {
		
		ChemInventory chem = new ChemInventory();
		
		System.out.print("You opened the ChemLab");
		
	}
}
