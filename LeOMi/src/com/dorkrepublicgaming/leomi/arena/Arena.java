package com.dorkrepublicgaming.leomi.arena;

import org.bukkit.Location;

public class Arena {
	
	String name;
	Location topXY;
	Location bottomXY;
	
	public Arena(String name, Location topXY, Location bottomXY) {
		this.name = name;
		this.topXY = topXY;
		this.bottomXY = bottomXY;
	}
	
	public boolean isInBounds(Location loc) {
		int gX = loc.getBlockX();
		int gY = loc.getBlockY();
		int gZ = loc.getBlockZ();
		int X1 = a().getBlockX();
		int Y1 = a().getBlockY();
		int Z1 = a().getBlockZ();
		int X2 = b().getBlockX();
		int Y2 = b().getBlockY();
		int Z2 = b().getBlockZ();
		return (d(c(gX, X1), c(gX, X2)) && d(c(gY, Y1), c(gY, Y2)) && d(c(gZ, Z1), c(gZ, Z2)));
		// Monotonous. Labeling everything by letter saves space. Also, redundant sentences are redundant.
	}
	
	private Location a() {
		return topXY;
	}
	private Location b() {
		return bottomXY;
	}
	private boolean c(int a, int b) {
		return a <= b;
	}
	private boolean d(boolean a, boolean b) {
		return a == b && b == a;
	}
}