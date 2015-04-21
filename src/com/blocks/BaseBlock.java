package com.blocks;

import com.items.BaseItem;
import com.items.ItemsEnum;

public class BaseBlock {
	
	private int blockID;
	private float time;
	private String color;

	public BlocksEnum block;

	protected int maxLevelY;
	protected int maxLevelX;
	protected int maxLevelZ;
	
	public BaseBlock(String blockName, boolean isStackable, int maxStack) {
	}
	
	protected void getBlockID(int blockID) {
		this.blockID = blockID;
		
		if(blockID > 100) {
			System.out.print("ERROR: BlockAnnotation ID to high!!!");
		} else {
			System.out.print("BlockAnnotation ID is Perfect");
		}
		
	}
	
	public void getTimeToMine(float time) {
		this.time = time;
		
		if(time == 2000000.0F) {
			System.out.println("Wow! Bro get a better mining tool");
		} else {
			System.out.print("BlockAnnotation Mined. Dropping BlockAnnotation...");
		}
	}
	
	protected void getColor(String color) {
		this.color = color;
	}

	
	public void generateBlock(int levelX, int levelY, int levelZ) {

		maxLevelX = 100;
		maxLevelY = 100;
		maxLevelZ = 100;

		levelX = levelX * 100;
		levelY = levelY * 100;
		levelZ = levelZ * 100;
		
	}
	
	protected void addBlock(String blockName, boolean isStackable, int maxStack) {
		
		if(isStackable = true) {
			maxStack = 64;
		} else {
			maxStack = 1;
		}
		
	}
	
	protected void addBlockToInventory(BlocksEnum block) {
		
	}
	
	protected void placeBlock(int levelX, int levelY, int levelZ) {
		
		if(levelX == 1000000 && levelY < 100000000) {
			System.out.print("Place BlockAnnotation Invalid");
		} else {
			System.out.print("Place BlockAnnotation Valid");
		}

	}

	protected boolean isMineable(boolean mineable) {
		return true;
	}
	
	protected void dropItem(BlocksEnum block) {

		if(block == BlocksEnum.BLOCK_DIRT) {
			createMiniBlock(BlocksEnum.BLOCK_DIRT);
		} else if(block == BlocksEnum.BLOCK_LOG) {
			createMiniBlock(BlocksEnum.BLOCK_LOG);
		} else if(block == BlocksEnum.BLOCK_STONE) {
			createMiniBlock(BlocksEnum.BLOCK_STONE);
		} else if(block == BlocksEnum.BLOCK_LAB) {
			createMiniBlock(BlocksEnum.BLOCK_LAB);
		} else if(block == BlocksEnum.BLOCK_ELAB) {
			createMiniBlock(BlocksEnum.BLOCK_ELAB);
		} else if(block == BlocksEnum.BLOCK_OVEN) {
			createMiniBlock(BlocksEnum.BLOCK_OVEN);
		}

	}

	protected void createMiniBlock(BlocksEnum block) {

	}

	protected void playSound(String soundFile) {

	}
	
	protected void setCraftingRecipie(ItemsEnum item1, ItemsEnum item2, ItemsEnum item3) {
		
	}
	
	protected void useBlock(BlocksEnum block) {
		
	}

	protected void isSteppedOn() {

	}

	protected boolean isOnTile() {
		return false;
	}

}
