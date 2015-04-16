package com.entitys;

public class BaseEntity {
	
	EntityEnum entity;
	
	int health = 100;
	int stamina = 10;
	int damage;
	
	public int levelX;
	
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
	
	protected void playSound(String sound) {
		
	}
	
	protected void spawn() {
		
	}

}
