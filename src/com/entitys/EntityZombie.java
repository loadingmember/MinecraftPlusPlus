package com.entitys;

import com.items.ItemsEnum;

public class EntityZombie extends BaseEntity {

	public EntityZombie() {

		entityHealth = 20;
		entityWalkTime = 10;
		entityDamage = 10;

		if (entityHealth == 0) {
			death();
			zombieDead();
		} else {
			isAlive();
		}
	}

	public void zombieDead() {
		dropItems(ItemsEnum.ITEM_STICK, 2);
	}
}
