package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.example.utils.HarParse;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HarTest {

    @Test
    public void HarCheck() throws InterruptedException {

        // Запуск BrowserMob Proxy
        BrowserMobProxy proxy = new BrowserMobProxyServer();
        proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
        proxy.setTrustAllServers(true); // Позволяет обойти сертификатные ошибки на стороне клиента
        proxy.start(0);

        // Получаем Selenium Proxy
        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

        ChromeOptions options = new ChromeOptions();
        options.setProxy(seleniumProxy);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
//        options.addArguments("--headless=old");
//            Configuration.holdBrowserOpen = true;
        options.addArguments("--disable-notifications"); //для head
        options.addArguments("--disable-extensions");      //для headless
        options.addArguments("--window-size=1920,1080");
//            options.addArguments("--incognito");
        options.addArguments("--disable-gpu"); //попытка вырубить фрейм браузера
        proxy.newHar("example");

        driver.get("https://login.sendpulse.com/pop-ups/main");
        Thread.sleep(2000);

        driver.findElement(By.id("login")).sendKeys("d.valko+prod_auto2@sendpulse.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.name("login_submit")).click();
        Thread.sleep(2000);

        Har har = proxy.getHar();

        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7");
        Thread.sleep(6000);
        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/analytics");
        Thread.sleep(2000);
        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/settings/messenger-widget");
        Thread.sleep(2000);
        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/chains");
        Thread.sleep(2000);
        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/settings/integrations");
        Thread.sleep(2000);
        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/settings/code");
        Thread.sleep(2000);
        driver.get("https://login.sendpulse.com/pop-ups/project/1bf3a977-a1eb-47da-b20d-6681ffa30db7/settings/variables");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Добавить попап")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/app-popup-type/div[2]/div/a[1]/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div[2]/app-content/div/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/app-root/app-constructor/app-layout/div/nav/app-header/div/div/div[2]/app-navbar/div/ul/li[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/app-root/app-constructor/app-layout/div/nav/app-header/div/div/div[2]/app-navbar/div/ul/li[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/app-root/app-constructor/app-layout/div/nav/app-header/div/div/div[3]/app-btn-controls/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/app-confirm/div[3]/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"button-animated\"]/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"dropdown-animated\"]/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/modal-container/div[2]/div/app-confirm/div[3]/button[2]")).click();


        new HarParse(har);

        driver.quit();
        proxy.stop();
    }


}


