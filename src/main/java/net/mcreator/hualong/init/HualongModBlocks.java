
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hualong.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.hualong.block.GoldenPotatoBlock3Block;
import net.mcreator.hualong.block.GoldenPotatoBlock2Block;
import net.mcreator.hualong.block.GoldenPotatoBlock1Block;
import net.mcreator.hualong.block.GoldenPotatoBlock0Block;
import net.mcreator.hualong.HualongMod;

public class HualongModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(HualongMod.MODID);
	public static final DeferredBlock<Block> GOLDEN_POTATO_BLOCK_0 = REGISTRY.register("golden_potato_block_0", GoldenPotatoBlock0Block::new);
	public static final DeferredBlock<Block> GOLDEN_POTATO_BLOCK_1 = REGISTRY.register("golden_potato_block_1", GoldenPotatoBlock1Block::new);
	public static final DeferredBlock<Block> GOLDEN_POTATO_BLOCK_2 = REGISTRY.register("golden_potato_block_2", GoldenPotatoBlock2Block::new);
	public static final DeferredBlock<Block> GOLDEN_POTATO_BLOCK_3 = REGISTRY.register("golden_potato_block_3", GoldenPotatoBlock3Block::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
