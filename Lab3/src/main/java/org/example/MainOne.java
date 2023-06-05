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

public class MainOne {

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
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[1]/a")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[2]/a")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[3]/a")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[4]/div[1]/div[1]/div/div/ul/li[4]/a")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }


    }
}

