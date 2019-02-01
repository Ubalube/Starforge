package com.ubalube.starforge.common.entity;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;

public class EntitySporedVillager extends EntityZombie
{

	public EntitySporedVillager(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean shouldBurnInDay() {
		return false;
	}

}
