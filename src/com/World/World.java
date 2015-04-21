package com.World;

import com.blocks.BlocksEnum;
import com.sun.crypto.provider.BlowfishKeyGenerator;

public class World{

    BlocksEnum block;

    public World() {

    }

    public void generateWorld(World world) {
        generateBlocks(block.BLOCK_CHEM);
    }

    public void generateBlocks(BlocksEnum block) {
    }
}
