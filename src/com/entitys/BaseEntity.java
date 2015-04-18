package com.entitys;

import com.blocks.BlocksEnum;
import com.crafting.Inventory;
import com.items.ItemsEnum;

public class BaseEntity {
	
	EntityEnum entity;
	BlocksEnum block;
	ItemsEnum item;
	
	public BaseEntity() {
		
	}
	
	
	protected int entityHealth = 50;
	public int playerHealth = 100;
	protected int stamina = 10;
	protected int entityDamage;
	protected int playerHitDamage;
	
	protected int entityWalkTime;
	
	protected int levelX;
	protected int levelY;
	protected int levelZ;
	
	protected boolean gotHit() {
		
		if(playerHitDamage == 1 && gotHit() == true) {
			entityHealth = entityHealth - playerHitDamage;
			death();
		} else if(playerHitDamage == 2 && gotHit() == true) {
			entityHealth = entityHealth - playerHitDamage;
			death();
		} else if(playerHitDamage == 3 && gotHit() == true) {
			entityHealth = entityHealth - playerHitDamage;
			death();
		} else {
			this.entityHealth = entityHealth;
		}
		
		return false;
	}
	
	protected void isHiting(int damage) {
		
		if(entityDamage == 3) {
			playerHealth = playerHealth - entityDamage;
		} else if(entityDamage == 2) {
			playerHealth = playerHealth - entityDamage;
		}  else if(entityDamage == 1) {
			playerHealth = playerHealth - entityDamage;
		} else if(entityDamage == 0) {
			this.playerHealth = playerHealth;
		}
	}
	
	protected void death() {
		
		if(entity == EntityEnum.ZOMBIE) {
			playSound("sound_zombie_death");
		} else if(entity == EntityEnum.PLAYER) {
			playSound("sound_player_death");
		} else if(entity == EntityEnum.HUNTER) {
			playSound("sound_hunter_death");
		} else if(entity == EntityEnum.SPIDER) {
			playSound("sound_spider_death");
		} else if(entity == EntityEnum.BOSS_MASSIVESPIDER) {
			playSound("sound_boss_spider_death");
		} else if(entity == EntityEnum.BOSS_MASSIVESPIDER) {
			playSound("sound_boss_zombie_death");
		}
	}
	
	protected boolean hasWeapon() {
		
		// Weapon for the entity zombie
		if(hasWeapon() == true && entity == EntityEnum.ZOMBIE) {
//			addWeaponToEntity(item.ITEM_COAL); Going to add Weapons and tools soon
			
			System.out.print("Be Careful! A Zombie has a weapon");
		} else if(hasWeapon() == false && entity == EntityEnum.ZOMBIE) {
			spawn(1, 1, 1);
		}
		
		// Weapons for the entity spider
		if(hasWeapon() == true && entity == EntityEnum.SPIDER) {
			spawn(1, 1, 1);
		} else if(hasWeapon() == false && entity == EntityEnum.SPIDER) {
			spawn(1, 1, 1);
		}
		
		// Weapons for the entity hunter
		if(hasWeapon() == true && entity == EntityEnum.HUNTER) {
//			addWeaponToEntity(weapon.BOW); Going to add Weapons and tools soon
//			addWeaponToEntity(weapon.AMMO_BOW); Going to add Weapons and tools soon
		} else if(hasWeapon() == false && entity == EntityEnum.HUNTER) {
			spawn(1, 1, 1);
		}
		
		//Weapon for the entity player
		if(hasWeapon() == true && entity == EntityEnum.PLAYER) {
			Inventory inv = new Inventory();
			inv.setSlots(20);
		} else if(hasWeapon() == false && entity == EntityEnum.PLAYER) {
		}
		
		//Weapons for the bosses
		if(hasWeapon() == true && entity == EntityEnum.BOSS_MASSIVEZOMBIE) {
//			addWeaponToEntity(weapon.MACHINE_GUN); Going to add Weapons and tools soon
		} else if(hasWeapon() == false && entity == EntityEnum.BOSS_MASSIVEZOMBIE) {
			
		}
		
		return true;
	}
	
	protected void move() {
		// Zombie Walk and Swim
		if(entity == EntityEnum.ZOMBIE && block == BlocksEnum.BLOCK_WATER) {
			swim();
		} else if(entity == EntityEnum.ZOMBIE && block == BlocksEnum.BLOCK_DIRT) {
			walk();
			entityWalkTime = 5;
		}
		
		// Entity Spider Walk and Swim
		if(entity == EntityEnum.SPIDER && block == BlocksEnum.BLOCK_WATER) {
			swim();
		} else if(entity == EntityEnum.SPIDER && block == BlocksEnum.BLOCK_DIRT || block == BlocksEnum.BLOCK_STONE) {
			walk();
			entityWalkTime = 10;
		}
		
		if(entity == EntityEnum.HUNTER && block == BlocksEnum.BLOCK_DIRT || block == BlocksEnum.BLOCK_STONE) {
			swim();
		} else if(entity == EntityEnum.HUNTER && block == BlocksEnum.BLOCK_WATER) {
			walk();
			entityWalkTime = 20;
		}
		
		if(entity == EntityEnum.PLAYER && block == BlocksEnum.BLOCK_DIRT || block == BlocksEnum.BLOCK_STONE) {
			walk();
			entityWalkTime = 15;
		} else if(entity == EntityEnum.SPIDER && block == BlocksEnum.BLOCK_WATER) {
			swim();
		}
		
		if(entity == EntityEnum.BOSS_MASSIVEZOMBIE && block == BlocksEnum.BLOCK_DIRT || block == BlocksEnum.BLOCK_STONE) {
			walk();
			entityWalkTime = 40;
		} else if(entity == EntityEnum.BOSS_MASSIVEZOMBIE && block == BlocksEnum.BLOCK_WATER) {
			swim();
		}
		
		
		if(entity == EntityEnum.BOSS_MASSIVESPIDER && block == BlocksEnum.BLOCK_DIRT || block == BlocksEnum.BLOCK_STONE) {
			walk();
			entityWalkTime = 50;
		} else if(entity == EntityEnum.BOSS_MASSIVESPIDER && block == BlocksEnum.BLOCK_WATER) {
			swim();
		}
		
	} 
	
	protected void swim() {
		
	}
	
	protected void walk() {
		
	}

	protected boolean isAlive() {
		return true;
	}
	
	protected void addWeaponToEntity(ItemsEnum itemCoal) {
		
	}

	protected void playSound(String sound) {
		
	}
	
	protected void spawn(int levelX, int levelY, int levelZ) {
		this.levelX = levelX;
		this.levelY = levelY;
		this.levelZ = levelZ;
	}

}