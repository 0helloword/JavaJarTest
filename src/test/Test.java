package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	

	
		driver = new FirefoxDriver();
		driver.get("http://123.57.56.45:7778/OC/index");
		driver.manage().window().maximize();// 窗口最大化	

		driver.findElement(By.name("username")).sendKeys("999111");// 输入登录用户名
		driver.findElement(By.name("password")).sendKeys("123456");// 输入登录密码
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click(); // 点击登录

		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[4]/a/span")).click();// 人工审核
		Thread.sleep(1000);
		driver.findElement(By.linkText("初步审核（POS）")).click();
		driver.findElement(By.linkText("继续审核")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.linkText("下一步")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("下一步")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("下一步")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/form/div/div[2]")).sendKeys(Keys.UP);
		
		
		Thread.sleep(2000);
	

		setScroll(driver,500);
		  new Select(driver.findElement(By.name("MCRE02"))).selectByVisibleText("信息验证失败");//申请人办公电话核实:
			Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRE03"))).selectByVisibleText("信息已验证");//申请人手机电话核实:
		Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRG05"))).selectByVisibleText("公司名和地址均一致");//ID5办公电话核查
		Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH06"))).selectByVisibleText("信息验证失败");//申请人其他联系人的手机电话核实:
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH060301"))).selectByVisibleText("号码不属于其他联系人");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRM05"))).selectByVisibleText("信息确认失败");//申请人家庭座机电话核实:
	    setScroll(driver,500);
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH07"))).selectByVisibleText("信息验证失败");//申请人家庭成员电话核实:
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH070301"))).selectByVisibleText("其它");
	    Thread.sleep(2000);
	
	    new Select(driver.findElement(By.name("MCRG07"))).selectByVisibleText("RES01");//主观判断结果:
	    Thread.sleep(2000);
		
		new Select(driver.findElement(By.name("MCRE020401"))).selectByVisibleText("申请人不在此工作");
	}


public static void setScroll(WebDriver driver,int height){
	  try {
	   String setscroll = "document.documentElement.scrollTop=" + height;
	   
	   JavascriptExecutor jse=(JavascriptExecutor) driver;
	   jse.executeScript(setscroll);
	  } catch (Exception e) {
	   System.out.println("Fail to set the scroll.");
	  }   
	 } 
}