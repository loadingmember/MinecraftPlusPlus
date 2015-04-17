package com.entitys;

import com.blocks.BlocksEnum;
import com.items.ItemsEnum;

public class BaseEntity {
	
	EntityEnum entity;
	BlocksEnum block;
	ItemsEnum item;
	
	
	int health = 100;
	int stamina = 10;
	int damage;
	
	private int levelX;
	private int levelY;
	private int levelZ;
	
	protected void hit(int damage) {
		
		if(damage == 1) {
			health = health - damage;
		} else if(damage == 2) {
			health = health - damage;
		} else if(damage == 3) {
			health = health - damage;
		}
	}
	
	protected void death(EntityEnum entity) {
		
		if(entity.ZOMBIE != null) {
			playSound("sound_zombie_death");
		} else if(entity.PLAYER != null) {
			playSound("sound_player_death");
		} else if(entity.HUNTER != null) {
			playSound("sound_hunter_death");
		} else if(entity.SPIDER != null) {
			playSound("sound_spider_death");
		} else if(entity.BOSS_MASSIVESPIDER != null) {
			playSound("sound_boss_spider_death");
		} else if(entity.BOSS_MASSIVEZOMBIE != null) {
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
		if(hasWeapon() && entity == EntityEnum.PLAYER) {
			
		}
		
		return true;
	}
	
	private void addWeaponToEntity(ItemsEnum itemCoal) {
		// TODO Auto-generated method stub
		
	}

	protected void playSound(String sound) {
		
	}
	
	protected void spawn(int levelX, int levelY, int levelZ) {
		this.levelX = levelX;
		this.levelY = levelY;
		this.levelZ = levelZ;
		
	}

}
