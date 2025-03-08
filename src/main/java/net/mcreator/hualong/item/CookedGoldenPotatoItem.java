
package net.mcreator.hualong.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedGoldenPotatoItem extends Item {
	public CookedGoldenPotatoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(6f).build()));
	}
}
