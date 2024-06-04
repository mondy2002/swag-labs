package com.Innocrm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class base {
	public static WebDriver driver;
	public static Properties props =new Properties();
	
	
	
	public base ()
	{
		try {
			File file = new File("C:\\Users\\Mass\\eclipse-workspace\\FlairsTech\\src\\main\\java\\propereties\\config.properties");
			FileInputStream fis = new FileInputStream(file);
		    props.load(fis);
		}catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public void launchbrowser()
	{
	if (props.getProperty("browser").equalsIgnoreCase("chrome")) 
	{
		//this is the new way of defining the driver to avoid the version problems 
        WebDriverManager.chromedriver().setup();
         // i added the options lines cause there was a problem while opening the browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); 
        driver = new ChromeDriver(options);
			driver.manage().window().maximize();

	}
	else if (props.getProperty("browser").equalsIgnoreCase("edge"))
	{
	     // System.setProperty("webdriver.edge.driver", "C:\\browsers\\msedgedriver.exe");
        
        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*"); 
        driver = new EdgeDriver(options);
			driver.manage().window().maximize();

	}
	else
	{
		System.out.println("browser is not defined");
	}
	
//		  System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
//			 driver =new ChromeDriver();
		//	driver.get(props.getProperty("URL"));
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

	}

}
