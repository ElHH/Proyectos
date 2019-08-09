package com.aeromexico.world.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://world.aeromexico.com")
public class AeromexicoHome extends PageObject{

	public static final Target COIN_USE = Target.the("Coin to use").located(By.xpath("/html//form[@id='flight']//div[@class='buy-location']//span/em[@class='co']"));
	public static final Target SOURCE_CITY = Target.the("Source city").located(By.id("from"));
	public static final Target TARGET_CITY = Target.the("Target city").located(By.id("to"));
	public static final Target BUTTON_NEXT_MONTH = Target.the("Button next month").located(By.xpath("//div[@id='content']//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	public static final Target DEPARTURE_DATE = Target.the("Flight departure date ").located(By.id("date-init"));
	public static final Target ARRIVE_DATE = Target.the("Flight arrive date ").located(By.id("date-end"));
	public static final Target DEPARTURE_DAY = Target.the("Flight departure day").located(By.xpath("\r\n//div[@id='content']//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class=\"ui-state-default\" and contains(text(),'1')]"));
	public static final Target ARRIVE_DAY = Target.the("Flight departure day").located(By.xpath("\r\n" + 
			"//div[@id='content']//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class=\"ui-state-default\" and contains(text(),'20')]"));
	public static final Target ADULT_BUTTON = Target.the("Adult button").located(By.id("adultsF"));
	public static final Target ADULT_QUANTITY = Target.the("Adult quantity").located(By.xpath("//*[@id='adultsF']//li[@name='ad1' and contains(text(), '2 Adultos')]"));
	public static final Target CHILDREN_BUTTON = Target.the("Children button").located(By.id("childrenF"));
	public static final Target CHILDREN_QUANTITY = Target.the("Children quantity").located(By.xpath("//*[@id='childrenF']//li[@class='show' and contains(text(), '1 Niño')]"));
	public static final Target AGE_CHILDREN_BUTTON = Target.the("Age children button").located(By.xpath("//*[@class='childrenCont']//div[@class='select']"));
	public static final Target AGE_CHILDREN = Target.the("Age children").located(By.xpath("//*[@class='popover-content']//option[@value='3']"));
	public static final Target CONFIRMAR_BUTTON = Target.the("Confirmar button").located(By.xpath("//*[@class='popover-content']//input[@value = 'Confirmar edades']"));
	public static final Target SEARCH_FLIGHT_BUTTON = Target.the("Search flight button").located(By.xpath("//input[@type = 'submit' and contains(@value,'Buscar vuelos')]"));
	

}
