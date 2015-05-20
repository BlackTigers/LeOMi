package com.dorkrepublicgaming.leomi.champion;

import com.dorkrepublicgaming.leomi.champion.abilities.Ability;

public class Champion {
	
	String name;
	Ability[] abilities;
	Ability ult;
	
	public Champion(String name, Ability[] abilities, Ability ultimate) {
		this.name = name;
		this.abilities = abilities;
		this.ult = ultimate;
	}
	
	public String getName() {
		return name;
	}
	
	public Ability[] getAbilities() {
		return abilities;
	}
	
	public Ability getUltimate() {
		return ult;
	}
	
}
