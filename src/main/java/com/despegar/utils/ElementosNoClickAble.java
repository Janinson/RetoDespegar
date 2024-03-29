package com.despegar.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementosNoClickAble {

    public void hacerClicEnElementoNoClickAble (WebDriver driver, By elemento){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(elemento);
        jse.executeScript("arguments[0].scrollIntoView()", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

	public void clicEnElementoNoClickAble (WebDriver driver, By elemento){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(elemento);
		jse.executeScript("arguments[0].scrollIntoView()", element);
        jse.executeScript("arguments[0].click();", element);
    }

}