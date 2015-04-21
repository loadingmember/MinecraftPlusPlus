package com.Tools;

import com.blocks.BlocksEnum;
import com.blocks.*;
import com.crafting.ElabCrafting;

public class ToolIronPick extends BaseTool {

    BlocksEnum block;

    BlockDirt dirt = new BlockDirt("Dirt", true, 64);
    BlockLog log = new BlockLog("Log", true, 64);
    BlockELab elab = new BlockELab("ELab", true, 64);
    BlockLab lab = new BlockLab("Lab", true, 64);
    BlockOven oven = new BlockOven("Oven", true, 64);
    BlockStone stone = new BlockStone("Stone", true, 64);

    public ToolIronPick() {
        getToolID(1);
        getSpeed(3.0F);
        blocksAllowed(BlocksEnum.BLOCK_ALL);

        if(block == BlocksEnum.BLOCK_DIRT && tool == ToolsEnum.IRON_PICK) {
            dirt.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_LOG && tool == ToolsEnum.IRON_PICK) {
            log.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_ELAB && tool == ToolsEnum.IRON_PICK) {
            elab.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_LAB && tool == ToolsEnum.IRON_PICK) {
            lab.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_OVEN && tool == ToolsEnum.IRON_PICK) {
            oven.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_STONE && tool == ToolsEnum.IRON_PICK) {
            stone.getTimeToMine(3.0F);
        }
    }

    private void toolDead() {
        destroyTool(ToolsEnum.IRON_PICK);
    }

    private void upgradeTool() {

        if(tool == ToolsEnum.IRON_PICK) {
            ElabCrafting elab = new ElabCrafting();
            elab.setAllottedTools(ToolsEnum.IRON_PICK);
        }

    }


}
