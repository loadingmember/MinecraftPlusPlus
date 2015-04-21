package com.Tools;

import com.blocks.*;
import com.crafting.ElabCrafting;

public class ToolIronShvl extends BaseTool {

    BlocksEnum block;

    BlockDirt dirt = new BlockDirt("Dirt", true, 64);
    BlockLog log = new BlockLog("Log", true, 64);
    BlockELab elab = new BlockELab("ELab", true, 64);
    BlockLab lab = new BlockLab("Lab", true, 64);
    BlockOven oven = new BlockOven("Oven", true, 64);
    BlockStone stone = new BlockStone("Stone", true, 64);

    public ToolIronShvl() {
        getToolID(2);
        getSpeed(3.0F);
        blocksAllowed(BlocksEnum.BLOCK_ALL);

        if(block == BlocksEnum.BLOCK_DIRT && tool == ToolsEnum.IRON_SHVL) {
            dirt.getTimeToMine(2.0F);
        } else if(block == BlocksEnum.BLOCK_LOG && tool == ToolsEnum.IRON_SHVL) {
            log.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_ELAB && tool == ToolsEnum.IRON_SHVL) {
            elab.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_LAB && tool == ToolsEnum.IRON_SHVL) {
            lab.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_OVEN && tool == ToolsEnum.IRON_SHVL) {
            oven.getTimeToMine(9.0F);
        } else if(block == BlocksEnum.BLOCK_STONE && tool == ToolsEnum.IRON_SHVL) {
            stone.getTimeToMine(9.0F);
        }
    }

    private void toolDead() {
        destroyTool(ToolsEnum.IRON_SHVL);
    }

    private void upgradeTool() {

        if(tool == ToolsEnum.IRON_SHVL) {
            ElabCrafting elab = new ElabCrafting();
            elab.setAllottedTools(ToolsEnum.IRON_SHVL);
        }

    }

}
