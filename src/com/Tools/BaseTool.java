package com.Tools;

import com.blocks.BlocksEnum;
import com.crafting.Inventory;
import com.items.ItemsEnum;

public class BaseTool {

    ToolsEnum tool;

    int durability;


    public BaseTool() {

    }

    protected void addToolToInventory(ToolsEnum tool) {
        Inventory toolInv = new Inventory();
        toolInv.setSlots(1);

        if(tool == ToolsEnum.IRON_PICK) {
            toolInv.addTool(ToolsEnum.IRON_PICK);
        } else if(tool == ToolsEnum.IRON_SHVL) {
            toolInv.addTool(ToolsEnum.IRON_SHVL);
        } else if(tool == ToolsEnum.IRON_HOE) {
            toolInv.addTool(ToolsEnum.IRON_HOE);
        } else if(tool == ToolsEnum.RUBY_PICK) {
            toolInv.addTool(ToolsEnum.RUBY_PICK);
        } else if(tool == ToolsEnum.RUBY_SHVL) {
            toolInv.addTool(ToolsEnum.RUBY_SHVL);
        } else if(tool == ToolsEnum.RUBY_HOE) {
            toolInv.addTool(ToolsEnum.RUBY_HOE);
        } else if(tool == ToolsEnum.DIAMOND_PICK) {
            toolInv.addTool(ToolsEnum.DIAMOND_PICK);
        } else if(tool == ToolsEnum.DIAMOND_SHVL) {
            toolInv.addTool(ToolsEnum.DIAMOND_SHVL);
        } else if(tool == ToolsEnum.DIAMOND_HOE) {
            toolInv.addTool(ToolsEnum.DIAMOND_HOE);
        } else if(tool == ToolsEnum.WOOD_PICK) {
            toolInv.addTool(ToolsEnum.WOOD_PICK);
        } else if(tool == ToolsEnum.WOOD_SHVL) {
            toolInv.addTool(ToolsEnum.WOOD_SHVL);
        } else if(tool == ToolsEnum.WOOD_HOE) {
            toolInv.addTool(ToolsEnum.WOOD_HOE);
        }
    }

    protected void addRecipie(ItemsEnum item, ItemsEnum item2, ItemsEnum item3) {
    }

    protected void blocksAllowed(BlocksEnum block) {

    }

    protected void getToolID(int id) {
    }

    public void destroyTool(ToolsEnum tool) {
    }

    protected void getSpeed(float speed) {

    }
}
