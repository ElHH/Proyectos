package com.bancolombia.www.capacitacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").located(By.xpath("//html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").located(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]"));
	public static final Target SOURCE_LANGUAGE = Target.the("Source language").located(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'sl_list_en\\'\\)'] .language_list_item_language_name"));
	public static final Target TARGET_LANGUAGE = Target.the("Target language").located(By.cssSelector("[onclick='_e\\(event\\, \\'changeLanguage\\+0\\'\\, \\'tl_list_es\\'\\)'] [aria-label]"));
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source language text area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("Target language text area").located(By.cssSelector(".tlid-results-container"));


}
