package UtlilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Demo1 extends BaseClass{
	
	

	public static void main(String[] args) throws InterruptedException {
		BaseClass b= new BaseClass();
		b.initialization();
		
	driver.findElement(By.xpath("//span[text()='Date']")).click();
	Thread.sleep(5000);
	WebElement monthyear=driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));
	WebElement Next=driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]"));
	Calender.dynamicCalender(monthyear, "Apr 2024", "span", "6", Next);
	}

}
