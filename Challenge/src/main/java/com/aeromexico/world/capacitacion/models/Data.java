package com.aeromexico.world.capacitacion.models;

public class Data {
	
	public String source_city;
	public String target_city;
	public String month_ini;
	public String day_ini;
	public String month_fin;
	public String day_fin;

	public String getSource() {
		return source_city;
	}
	
	public void setSource(String source_city) {
		this.source_city=source_city;
	}
	public String getTarget() {
		return target_city;
	}
	public void setTarget(String target_city) {
		this.target_city=target_city;
	}
	public String getMonth_ini() {
		return month_ini;
	}
	public void setMonth_ini(String month_ini) {
		this.month_ini=month_ini;
	}
	public String getDay_ini() {
		return day_ini;
	}
	public void setDay_ini(String day_ini) {
		this.day_ini=day_ini;
	}
	public String getMonth_fin() {
		return month_fin;
	}
	public void setMonth_fin(String month_fin) {
		this.month_fin=month_fin;
	}
	public String getDay_fin() {
		return day_fin;
	}
	public void setDay_fin(String day_fin) {
		this.day_fin=day_fin;
	}
}
