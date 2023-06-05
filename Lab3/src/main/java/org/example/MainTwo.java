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

public class MainTwo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/header/div[1]/nav[2]/ul/li[2]/a")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("Anton_Paly");
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        try {
            driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]")).sendKeys("Anton734218100299");
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[1]/div[3]/div/div[2]/form[1]/button")).click();
        } catch (ElementNotInteractableException e){
            System.out.println(e.getSupportUrl());
        }

    }
}
