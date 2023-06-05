package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainFour {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");


        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        try {
            driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/div/div/input")).sendKeys("TestGeekBrains");
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }


    }
}
