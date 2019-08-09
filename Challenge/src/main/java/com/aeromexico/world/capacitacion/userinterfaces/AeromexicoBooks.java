package com.aeromexico.world.capacitacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class AeromexicoBooks extends PageObject{

	public static final Target ROUTE = Target.the("Route flight").located(By.xpath("//li[@id = 'EtNavFlights']//a[contains(text(), '')]"));
	
}
