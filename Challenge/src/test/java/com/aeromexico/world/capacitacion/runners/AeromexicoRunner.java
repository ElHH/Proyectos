package com.aeromexico.world.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Aeromexico.feature",
				 glue= "com.aeromexico.world.capacitacion.stepsdefinitions",
				 snippets=SnippetType.CAMELCASE
				 )
public class AeromexicoRunner {

}
