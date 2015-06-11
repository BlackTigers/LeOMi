package com.dorkrepublicgaming.leomi.arena;

import org.bukkit.Location;

public class ArenaHandler {
	
	public static Arena createArena(String name, Location topXY, Location bottomXY) {
		return new Arena(name, topXY, bottomXY);
	}
	
}
