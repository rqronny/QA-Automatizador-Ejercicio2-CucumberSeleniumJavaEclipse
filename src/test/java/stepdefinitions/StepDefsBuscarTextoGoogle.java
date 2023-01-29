package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsBuscarTextoGoogle {
	
	WebDriver driver;
	
	@Given("me encuentro en la pagina de google")
	public void me_encuentro_en_la_pagina_de_google() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

	@When("busco un texto {string}")
	public void busco_un_texto(String string) {
		WebElement buscador = driver.findElement(By.name("q"));
		buscador.sendKeys(string);
		buscador.submit();
	}

	@Then("deberia ver que el titulo contiene el texto buscado {string}")
	public void deberia_ver_que_el_titulo_contiene_el_texto_buscado(String string) {
	    Assert.assertTrue(driver.getTitle().contains(string));
	}

}
