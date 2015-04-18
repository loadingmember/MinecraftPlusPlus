package com.entitys;

public class EntityZombie extends BaseEntity {
	
	public EntityZombie() {

		entityHealth = 20;
		entityWalkTime = 10;
		entityDamage = 10;

		if(entityHealth == 0) {
			death();
		} else {
			isAlive();
		}
	}

}
