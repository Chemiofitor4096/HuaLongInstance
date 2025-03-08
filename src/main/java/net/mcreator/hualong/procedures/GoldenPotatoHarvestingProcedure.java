package net.mcreator.hualong.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.hualong.init.HualongModItems;
import net.mcreator.hualong.init.HualongModBlocks;

public class GoldenPotatoHarvestingProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return InteractionResult.PASS;
		{
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockState _bs = HualongModBlocks.GOLDEN_POTATO_BLOCK_0.get().defaultBlockState();
			BlockState _bso = world.getBlockState(_bp);
			for (Property<?> _propertyOld : _bso.getProperties()) {
				Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
				if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
					try {
						_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
					} catch (Exception e) {
					}
			}
			world.setBlock(_bp, _bs, 3);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(HualongModItems.GOLDEN_POTATO.get()).copy();
			_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		return InteractionResult.SUCCESS;
	}
}
