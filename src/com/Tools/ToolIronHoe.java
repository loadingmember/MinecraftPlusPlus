package com.Tools;

import com.blocks.*;
import com.crafting.ElabCrafting;

public class ToolIronHoe extends BaseTool {

    BlocksEnum block;

    BlockDirt dirt = new BlockDirt("Dirt", true, 64);

    public ToolIronHoe() {
        getSpeed(3.0F);
        getToolID(3);
        blocksAllowed(BlocksEnum.BLOCK_DIRT);

        if(block == BlocksEnum.BLOCK_DIRT) {
            dirt.farmDirt();
            dirt.removeGrass();
        } else if(block == BlocksEnum.BLOCK_LOG) {
            System.out.print("ERROR: Tool cannot be used here");
        } else if(block == BlocksEnum.BLOCK_ELAB) {
            System.out.print("ERROR: Tool cannot be used here");
        } else if(block == BlocksEnum.BLOCK_LAB) {
            System.out.print("ERROR: Tool cannot be used here");
        } else if(block == BlocksEnum.BLOCK_OVEN) {
            System.out.print("ERROR: Tool cannot be used here");
        } else if(block == BlocksEnum.BLOCK_STONE) {
            System.out.print("ERROR: Tool cannot be used here");
        }
    }

    private void toolDead() {
        destroyTool(ToolsEnum.IRON_HOE);
    }

    private void upgradeTool() {

        if(tool == ToolsEnum.IRON_HOE) {
            ElabCrafting elab = new ElabCrafting();
            elab.setAllottedTools(ToolsEnum.IRON_HOE);
        }
    }

}
