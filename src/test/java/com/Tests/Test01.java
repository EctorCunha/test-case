package com.Tests;

import static org.junit.jupiter.api.Assertions.*;

import com.Pages.Page01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test01 {

	private static Page01 page;

	@BeforeEach
	public void setUp(){
		page = new Page01();
		page.openApp();
	}

	@Test
	public void registerFlowTest() throws InterruptedException{
		page.clickMyAccount();
		Thread.sleep(2000);
		page.clickRegister();
		Thread.sleep(2000);
		// OBS PARA O PROFESSOR THIAGO: O email deverá ser alterado para cada vez que for rodar o teste.
		// A aplicação salva o email como registrado. (Não salva em cache nem em local/session storage. Por isso tem que ficar mudando o email)
		page.sessaoRegistro("Neymar", "Junior", "neymarjr3@gmail.com", "80028922", "123456789", "123456789");
		Thread.sleep(2000);
		page.getNoNewsLetter();
		Thread.sleep(2000);
		page.getFillFlag();
		Thread.sleep(2000);
		page.getClickContinue();
		Thread.sleep(2000);
        String registrado = page.getVerifyText();
        assertTrue(registrado.contains("Congratulations! Your new account has been successfully created!"));
        System.out.println("Usuario logado: " + registrado);
		page.getClickInsertText("Iphone");
		Thread.sleep(2000);
		page.getClickSearch();
		Thread.sleep(2000);
		page.getClickProduct();
		Thread.sleep(2000);
		page.getClickAddToCart();
		Thread.sleep(2000);
		String adicionado = page.getVerifyTextSuccess();
		assertTrue(adicionado.contains("Success: You have added iPhone to your shopping cart!"));
		System.out.println("Adicionado ao carrinho: " + adicionado);
	}

}
