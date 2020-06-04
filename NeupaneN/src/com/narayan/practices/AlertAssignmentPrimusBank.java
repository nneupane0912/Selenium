        package com.narayan.practices;

        import org.openqa.selenium.Alert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.chrome.ChromeDriver;

        public class AlertAssignmentPrimusBank 
        {

	    public static void main(String[] args) 
	    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\neupa\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://primusbank.qedgetech.com/home.aspx");		
	
		driver.manage().window().maximize();
	   
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		//Create Branch
		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		
		// Click on New Branch 
		
		driver.findElement(By.id("BtnNewBR")).click();
		
		//Create New Branch 
		
		driver.findElement(By.id("txtbName")).sendKeys("narayan123");
		driver.findElement(By.id("txtAdd1")).sendKeys("17009 Preston Braid Ln");
		driver.findElement(By.id("txtZip")).sendKeys("78664");
		driver.findElement(By.id("lst_counrtyU")).sendKeys("USA");
		driver.findElement(By.id("lst_stateI")).sendKeys("NewYork");
		driver.findElement(By.id("lst_cityI")).sendKeys("Watertown");
		driver.findElement(By.id("btn_insert")).click();
		
		//handling Alert
		
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		
		//System.out.println(al.getText(""));
		
		// click on oK Button
		
		 al.accept();
		
		//validation
		
		if (msg.contains("created sucessfully")) 
		{
		System.out.println("Pass");	
		
		}else if(msg.contains("already Exist"))
		{
		System.out.println("Fail");
		
		}else if(msg.contains("Please Fill"))
		{
			System.out.println("warning");
		}
		
		
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		
		
		
		driver.close();
	}
	

}
