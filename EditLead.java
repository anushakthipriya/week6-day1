package week6_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class EditLead extends BaseClass {

	@Test
	public void main() {
		
		driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to Selenium Aotomation Testing");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aspanu@gmail.com");
				WebElement eleDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dd = new Select(eleDropdown);
				dd.selectByVisibleText("New York");
				driver.findElement(By.name("submitButton")).click();                   
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Manual Testing vs Automation Testing");
				driver.findElement(By.name("submitButton")).click();
				String title = driver.getTitle();
				System.out.println(title); 
		
		
	}

}
