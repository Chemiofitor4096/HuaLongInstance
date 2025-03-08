
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hualong.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hualong.HualongMod;

public class HualongModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HualongMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HUA_LONG_INSTANCE = REGISTRY.register("hua_long_instance",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hualong.hua_long_instance")).icon(() -> new ItemStack(Items.NETHER_STAR)).displayItems((parameters, tabData) -> {
				tabData.accept(HualongModItems.GOLDEN_POTATO.get());
				tabData.accept(HualongModItems.COOKED_GOLDEN_POTATO.get());
			}).build());
}
