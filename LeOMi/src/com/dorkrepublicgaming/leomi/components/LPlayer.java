package com.dorkrepublicgaming.leomi.components;

import org.bukkit.entity.Player;

import com.dorkrepublicgaming.leomi.arena.Arena;
import com.dorkrepublicgaming.leomi.champion.Champion;

public class LPlayer {
	
	Player player;
	Arena arena;
	Champion champion;
	
	public LPlayer(Player player, Arena arena, Champion champion) {
		this.player = player;
		this.arena = arena;
		this.champion = champion;
	}
	
}
