package com.wolffsmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class EntityMaus extends EntityCreature {
	public EntityMaus(World w) {
		super(w);
		this.setSize(3.5F, 2.5F);
	}
}
