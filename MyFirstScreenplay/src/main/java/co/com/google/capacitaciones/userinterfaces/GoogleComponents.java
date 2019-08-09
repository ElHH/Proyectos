package co.com.google.capacitaciones.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleComponents {
	
	
	public static final Target INPUT_SEARCH = Target.the("Input search").located(By.cssSelector("[maxlength]"));
	public static final Target BUTTON_SEARCH = Target.the("Button search").located(By.name("btnK"));
	public static final Target RESULT_SEARCH = Target.the("Results of search").located(By.xpath("/html//div[@id='res']/div[2]/div/div/div/div/div/div/div/a/h3"));

	

}
