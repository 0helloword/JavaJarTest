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
		driver.manage().window().maximize();// �������	

		driver.findElement(By.name("username")).sendKeys("999111");// �����¼�û���
		driver.findElement(By.name("password")).sendKeys("123456");// �����¼����
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click(); // �����¼

		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[4]/a/span")).click();// �˹����
		Thread.sleep(1000);
		driver.findElement(By.linkText("������ˣ�POS��")).click();
		driver.findElement(By.linkText("�������")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.linkText("��һ��")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("��һ��")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("��һ��")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/form/div/div[2]")).sendKeys(Keys.UP);
		
		
		Thread.sleep(2000);
	

		setScroll(driver,500);
		  new Select(driver.findElement(By.name("MCRE02"))).selectByVisibleText("��Ϣ��֤ʧ��");//�����˰칫�绰��ʵ:
			Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRE03"))).selectByVisibleText("��Ϣ����֤");//�������ֻ��绰��ʵ:
		Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRG05"))).selectByVisibleText("��˾���͵�ַ��һ��");//ID5�칫�绰�˲�
		Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH06"))).selectByVisibleText("��Ϣ��֤ʧ��");//������������ϵ�˵��ֻ��绰��ʵ:
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH060301"))).selectByVisibleText("���벻����������ϵ��");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRM05"))).selectByVisibleText("��Ϣȷ��ʧ��");//�����˼�ͥ�����绰��ʵ:
	    setScroll(driver,500);
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH07"))).selectByVisibleText("��Ϣ��֤ʧ��");//�����˼�ͥ��Ա�绰��ʵ:
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("MCRH070301"))).selectByVisibleText("����");
	    Thread.sleep(2000);
	
	    new Select(driver.findElement(By.name("MCRG07"))).selectByVisibleText("RES01");//�����жϽ��:
	    Thread.sleep(2000);
		
		new Select(driver.findElement(By.name("MCRE020401"))).selectByVisibleText("�����˲��ڴ˹���");
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