package com.github.cob.buildings;

public class Building {
	
	private String name = "none";
	private int level = 1;
	private int storage_cap = -1;
	private int storage_type = -1;
	private int hp = 0;
	private int cost = 0;
	private int cost_type = 0;
	private int build_time = 0;
	private int exp_gained = 0;
	private int th_req = 1;
	private int boost_cost = 0;
	private int prod_rate_phr = 0;
	private int time_to_fill = 0;
	private int catch_up_point = 0;
	
	
	 public enum BuildingState { PLACED, BUILDING, FINISHED, LEVEL1, LEVEL2, LEVEL3, LEVEL4, LEVEL5, LEVEL6, LEVEL7, LEVEL8, LEVEL9, LEVEL10, LEVEL11; }
	 
	 protected BuildingState state = BuildingState.PLACED;
	 
	 public BuildingState getState() {
		 return state;
	 }
	
	public Building(String name) {
		this.name = name;
	}
	
	public Building setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getName() {
		return this.name;
	}

	public Building setLevel(int level) {
		this.level = level;
		return this;
	}
	
	public int getLevel() {
		return this.level;
	}

	public Building setStorageCapacity(int storage_cap) {
		this.storage_cap = storage_cap;
		return this;
	}
	
	public int getStorageCapacity() {
		return this.storage_cap;
	}

	public Building setStorageType(int storage_type) {
		this.storage_type = storage_type;
		return this;
	}
	
	public int getStorageType() {
		return this.storage_type;
	}

	public Building setHealth(int hp) {
		this.hp = hp;
		return this;
	}
	
	public int getHealth() {
		return this.hp;
	}

	public Building setBuildCost(int cost) {
		this.cost = cost;
		return this;
	}
	
	public int getBuildCost() {
		return this.cost;
	}
	
	public Building setBuildCostType(int cost_type) {
		this.cost_type = cost_type;
		return this;
	}
	
	public int getBuildCostType() {
		return this.cost_type;
	}

	public Building setBuildTime(int build_time) {
		this.build_time = build_time;
		return this;
	}
	
	public int getBuildTime() {
		return this.build_time;
	}

	public Building setExpGained(int exp_gained) {
		this.exp_gained = exp_gained;
		return this;
	}
	
	public int getExpGained() {
		return this.exp_gained;
	}

	public Building setTownHallRequirement(int th_req) {
		this.th_req = th_req;
		return this;
	}
	
	public int getTownHallRequirement() {
		return this.th_req;
	}
	
	public Building setBoostCost(int boost_cost){
		this.boost_cost = boost_cost;
		return this;
	}
	
	public int getBoostCost() {
		return this.boost_cost;
	}
	
	public Building setProdRate(int prod_rate_phr){
		this.prod_rate_phr =  prod_rate_phr;
		return this;
	}
	
	public int getProdRate() {
		return this.prod_rate_phr;
	}
	
	public Building setTimetoFill(int time_to_fill){
		this.time_to_fill = time_to_fill;
		return this;
	}
	
	public int getTimetoFill() {
		return this.time_to_fill;
	}
	
	public Building setCatchUpPoint(int catch_up_point){
		this.catch_up_point = catch_up_point;
		return this;
	}
	
	public int getCatchUpPoint() {
		return this.catch_up_point;
	}
	
	
	
}
