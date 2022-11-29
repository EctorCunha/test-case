package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Page01 extends BasePage {

    // Parte de cadastro
    protected static final String clickMyAccount = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"; //Xpath
    protected static final String clickRegister = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"; //Xpath
    protected static final String fillFormFistName = "//*[@id=\"input-firstname\"]"; //Xpath
    protected static final String fillFormLastName = "//*[@id=\"input-lastname\"]"; //Xpath
    protected static final String fillFormEmail = "//*[@id=\"input-email\"]"; //Xpath
    protected static final String fillFormTelephone = "//*[@id=\"input-telephone\"]"; //Xpath
    protected static final String fillFormPassword = "//*[@id=\"input-password\"]"; //Xpath
    protected static final String fillFormPasswordConfirm = "//*[@id=\"input-confirm\"]"; //Xpath
    protected static final String NoNewsLetter = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"; //Xpath
    protected static final String fillFlag = "//*[@id=\"content\"]/form/div/div/input[1]"; // Xpath
    protected static final String clickContinue = "//*[@id=\"content\"]/form/div/div/input[2]"; // Xpath
    protected static final String verifyText = "//*[@id=\"content\"]/p[1]"; // Xpath

    // Parte de compra
    protected static final String insertText = "//*[@id=\"search\"]/input"; // Xpath
    protected static final String clickSearch = "//*[@id=\"search\"]/span/button"; // Xpath
    protected static final String clickProduct = "//*[@id=\"content\"]/div[3]/div"; // Xpath
    protected static final String clickAddToCart = "//*[@id=\"button-cart\"]"; // Xpath
    protected static final String verifyTextSuccess = "//*[@id=\"product-product\"]/div[1]"; // Xpath



    public void clickMyAccount (){
        WebElement account = getWebElement(By.xpath(clickMyAccount));
        account.click();
    }

    public void clickRegister (){
        WebElement register = getWebElement(By.xpath(clickRegister));
        register.click();
    }

    public void sessaoRegistro (String primeiroNome, String ultimoNome, String email, String telefone, String senha, String confirmarSenha){
        WebElement firstName = getWebElement(By.xpath(fillFormFistName));
        firstName.clear();
        firstName.sendKeys(primeiroNome);

        WebElement lastName = getWebElement(By.xpath(fillFormLastName));
        lastName.clear();
        lastName.sendKeys(ultimoNome);

        WebElement myEmail = getWebElement(By.xpath(fillFormEmail));
        myEmail.clear();
        myEmail.sendKeys(email);

        WebElement telephone = getWebElement(By.xpath(fillFormTelephone));
        telephone.clear();
        telephone.sendKeys(telefone);

        WebElement password = getWebElement(By.xpath(fillFormPassword));
        password.clear();
        password.sendKeys(senha);

        WebElement passwordConfirm = getWebElement(By.xpath(fillFormPasswordConfirm));
        passwordConfirm.clear();
        passwordConfirm.sendKeys(confirmarSenha);
    }

    public void getNoNewsLetter (){
        WebElement newsLetter = getWebElement(By.xpath(NoNewsLetter));
        newsLetter.click();
    }

    public void getFillFlag (){
        WebElement flag = getWebElement(By.xpath(fillFlag));
        flag.click();
    }

    public void getClickContinue (){
        WebElement continueClick = getWebElement(By.xpath(clickContinue));
        continueClick.click();
    }
    public String getVerifyText(){
        WebElement identificarTexto = getWebElement(By.xpath(verifyText));
        return identificarTexto.getText();
    }

    public void getClickInsertText (String busca){
        WebElement firstName = getWebElement(By.xpath(insertText));
        firstName.clear();
        firstName.sendKeys(busca);
    }

    public void getClickSearch (){
        WebElement clickToSearch = getWebElement(By.xpath(clickSearch));
        clickToSearch.click();
    }

    public void getClickProduct (){
        WebElement clickToProduct = getWebElement(By.xpath(clickProduct));
        clickToProduct.click();
    }

    public void getClickAddToCart (){
        WebElement clickToAddToCart = getWebElement(By.xpath(clickAddToCart));
        clickToAddToCart.click();
    }

    public String getVerifyTextSuccess(){
        WebElement identificarTextoDeSucesso = getWebElement(By.xpath(verifyTextSuccess));
        return identificarTextoDeSucesso.getText();
    }


}
