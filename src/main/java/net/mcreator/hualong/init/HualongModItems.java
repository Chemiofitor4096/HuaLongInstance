
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hualong.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hualong.item.GoldenPotatoItem;
import net.mcreator.hualong.item.CookedGoldenPotatoItem;
import net.mcreator.hualong.HualongMod;

public class HualongModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HualongMod.MODID);
	public static final DeferredItem<Item> GOLDEN_POTATO = REGISTRY.register("golden_potato", GoldenPotatoItem::new);
	public static final DeferredItem<Item> COOKED_GOLDEN_POTATO = REGISTRY.register("cooked_golden_potato", CookedGoldenPotatoItem::new);
	public static final DeferredItem<Item> GOLDEN_POTATO_BLOCK_0 = block(HualongModBlocks.GOLDEN_POTATO_BLOCK_0);
	public static final DeferredItem<Item> GOLDEN_POTATO_BLOCK_1 = block(HualongModBlocks.GOLDEN_POTATO_BLOCK_1);
	public static final DeferredItem<Item> GOLDEN_POTATO_BLOCK_2 = block(HualongModBlocks.GOLDEN_POTATO_BLOCK_2);
	public static final DeferredItem<Item> GOLDEN_POTATO_BLOCK_3 = block(HualongModBlocks.GOLDEN_POTATO_BLOCK_3);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
