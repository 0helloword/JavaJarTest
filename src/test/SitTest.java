//�����ɿ�ִ�е�JAR�ļ��������ȿ���arguements�����ã�Ҳ���������������룬����д��bat�ļ�
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SitTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get(args[0]);
		driver.manage().window().maximize();// �������
		driver.findElement(By.id("username")).sendKeys(args[1]);// �����¼�û���
		driver.findElement(By.id("password")).sendKeys(args[2]);// �����¼����
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click(); // �����¼
		Thread.sleep(5000);// �ȴ�ʱ�䵥λΪ����
		String verify = driver.findElement(By.className("username")).getText();
		assert verify.contains("���");// ������ assertion
		driver.findElement(By.linkText("��������")).click();
	    new Select(driver.findElement(By.id("storeId"))).selectByVisibleText(args[3]);//ѡ�����
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("careerType"))).selectByVisibleText("��ְ��Ա");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("productSeriesId"))).selectByVisibleText(args[4]);//ѡ��ϵ��
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.name("goodsReqs[0].cargoType"))).selectByVisibleText("�ֻ�");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("commodityClass_0"))).selectByVisibleText("�ֻ����");
	    Thread.sleep(1000);
	    driver.findElement(By.id("commodityName_0")).clear();
	    driver.findElement(By.id("commodityName_0")).sendKeys("�����");
	    Thread.sleep(1000);
	    driver.findElement(By.id("commodityType_0")).clear();
	    driver.findElement(By.id("commodityType_0")).sendKeys("001");
	    driver.findElement(By.name("goodsReqs[0].commodityPrice")).clear();
	    driver.findElement(By.name("goodsReqs[0].commodityPrice")).sendKeys("5000");
	    Thread.sleep(1000);
	    driver.findElement(By.id("amount")).click();
	    driver.findElement(By.id("downPaymentAmount")).clear();
	    driver.findElement(By.id("downPaymentAmount")).sendKeys("2000");
	    Thread.sleep(1000);
	    driver.findElement(By.id("loanMoney")).click();
	    driver.findElement(By.cssSelector("button.btn.blue-madison")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("productId")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("submitBtn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("ensure_sn")).click();
	    //������Ϣ
	    Thread.sleep(2000);
	    driver.findElement(By.id("customerName")).clear();
	    driver.findElement(By.id("customerName")).sendKeys(args[5]);//�޸�����--�û���
	    driver.findElement(By.id("cardId")).clear();
	    driver.findElement(By.id("cardId")).sendKeys(args[6]);//�޸�����--���֤��
	    driver.findElement(By.id("mobile")).clear();
	    driver.findElement(By.id("mobile")).sendKeys(args[7]);//�޸�����--�绰����
	    new Select(driver.findElement(By.id("repaymentType"))).selectByVisibleText("���д���");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.id("repaymentBank"))).selectByVisibleText("��������");
	    driver.findElement(By.id("repaymentAcc")).clear();
	    driver.findElement(By.id("repaymentAcc")).sendKeys(args[8]);//�޸�����--�����˺�
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.id("province"))).selectByVisibleText("�㶫ʡ");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("city"))).selectByVisibleText("������");
	    driver.findElement(By.id("bankTel")).clear();
	    driver.findElement(By.id("bankTel")).sendKeys(args[7]);//�޸������ֻ�����
	    driver.findElement(By.cssSelector("button.btn.blue-madison")).click();
	    Thread.sleep(2000);
		 //�ϴ�����
		Thread.sleep(3000);
	  	String order=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div[2]/div/div/div/div/p/strong")).getText();//��ȡ�������
	  	System.out.print("\n\n\n�ö������Ϊ:"+order+"\n\n");
	    Thread.sleep(2000);
	    String s1=driver.findElement(By.xpath("//input[9]")).getAttribute("id");
	    //System.out.print(s1+"\n");//��ȡ��һ���ϴ�������id  file_0_35440869_1000001_72
	    String ss1=s1.substring(0,16);//��ȡfile_0_35440869_
	    //System.out.print(ss1+"\n");
	    int ss2=Integer.parseInt(s1.substring(16, 23));//��ȡ1000001
	    //System.out.print(ss2+"\n");
	    int ss4=Integer.parseInt(s1.substring(24,s1.length()));//��ȡ72
	    //System.out.print(ss4+"\n");
	    String s2=ss1+Integer.toString(ss2+1)+"_"+Integer.toString(ss4+1);//�ڶ����ϴ�����id file_0_35440869_1000002_73
	    //System.out.print(s2+"\n");
	    String s3=ss1+Integer.toString(ss2+2)+"_"+Integer.toString(ss4+2);//�������ϴ�����id file_0_35440869_1000003_74
	    String s4=ss1+Integer.toString(ss2+3)+"_"+Integer.toString(ss4+3);//���ĸ��ϴ�����id file_0_35440869_1000004_75
	    driver.findElement(By.id(s1)).sendKeys(args[9]); //�޸�ͼƬ·��
	    Thread.sleep(3000);
	    driver.findElement(By.id(s2)).sendKeys(args[9]); 
	    Thread.sleep(3000);
	    driver.findElement(By.id(s3)).sendKeys(args[9]); 
	    Thread.sleep(3000);
	    driver.findElement(By.id(s4)).sendKeys(args[9]); 
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button.btn.blue-madison")).click();
		//������Ϣ
	    //��������
		Thread.sleep(3000);
	    driver.findElement(By.name("issuingOrgan")).clear();
	    driver.findElement(By.name("issuingOrgan")).sendKeys("���ڹ�����");
	    Thread.sleep(2000);
	    driver.findElement(By.id("idCardValidity")).click();
	    driver.findElement(By.className("today")).click();
	    new Select(driver.findElement(By.id("degree"))).selectByVisibleText("��");
	    driver.findElement(By.id("emaill")).clear();
	    driver.findElement(By.id("emaill")).sendKeys(args[10]);//�޸��]��
	    driver.findElement(By.name("qqCode")).clear();
	    driver.findElement(By.name("qqCode")).sendKeys(args[11]);//�޸�QQ����
	    new Select(driver.findElement(By.name("marry"))).selectByVisibleText("δ��");
	    new Select(driver.findElement(By.name("liveCondition"))).selectByVisibleText("�Խ�/���򷿲�");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("householdProv"))).selectByVisibleText("�㶫ʡ");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("householdCity"))).selectByVisibleText("������");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("householdTown"))).selectByVisibleText("�޺���");
	    driver.findElement(By.id("householdZhen")).clear();
	    driver.findElement(By.id("householdZhen")).sendKeys("�����´�");
	    driver.findElement(By.id("householdStr")).clear();
	    driver.findElement(By.id("householdStr")).sendKeys("�Ľ�·");
	    driver.findElement(By.id("householdRidge")).clear();
	    driver.findElement(By.id("householdRidge")).sendKeys("10��");
	    driver.findElement(By.id("householdHome")).clear();
	    driver.findElement(By.id("householdHome")).sendKeys("101");
	    new Select(driver.findElement(By.id("addreRegist"))).selectByVisibleText("��ͬ");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("liveProv"))).selectByVisibleText("�㶫ʡ");
	  Thread.sleep(1000);
	    new Select(driver.findElement(By.id("liveCity"))).selectByVisibleText("������");
	  Thread.sleep(1000);
	    new Select(driver.findElement(By.id("liveTown"))).selectByVisibleText("������");
	    driver.findElement(By.id("liveZhen")).clear();
	    driver.findElement(By.id("liveZhen")).sendKeys("�����´�");
	    driver.findElement(By.id("liveStr")).clear();
	    driver.findElement(By.id("liveStr")).sendKeys("�Ľ�·");
	    driver.findElement(By.id("liveRidge")).clear();
	    driver.findElement(By.id("liveRidge")).sendKeys("10��");
	    driver.findElement(By.id("liveHome")).clear();
	    driver.findElement(By.id("liveHome")).sendKeys("101");
	 	    Thread.sleep(1000);
	    new Select(driver.findElement(By.name("postState"))).selectByVisibleText("����סַ��ͬ");
	    Thread.sleep(2000);
	    //������Ϣ
	    driver.findElement(By.id("monthlyIncome")).clear();
	    driver.findElement(By.id("monthlyIncome")).sendKeys("5000");
	    driver.findElement(By.id("familyIncome")).clear();
	    driver.findElement(By.id("familyIncome")).sendKeys("6000");
	    driver.findElement(By.id("monthlySpending")).clear();
	    driver.findElement(By.id("monthlySpending")).sendKeys("1000");
	    Thread.sleep(2000);
	    //ְҵ��Ϣ
	    driver.findElement(By.id("firstWorktime")).click();//��λ�����б��е����,Ϊ��ҳ�治����ݵ�����ס������д����
	    driver.findElement(By.xpath("/html/body/div[6]/div[3]/table/tbody/tr/td/span[5]")).click();
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.id("industry"))).selectByVisibleText("��ҵ��λ��������ʩ��ҽ����������ᱣ�Ϻ���ḣ��ҵ");
	    driver.findElement(By.name("unitname")).clear();
	    driver.findElement(By.name("unitname")).sendKeys("���Թ�˾");
	    driver.findElement(By.name("department")).clear();
	    driver.findElement(By.name("department")).sendKeys("���Բ�");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.id("industryType"))).selectByVisibleText("������ʩ����ҵ");
	    new Select(driver.findElement(By.id("careerType"))).selectByVisibleText("һ��ҽ��������Ա��һ��ҽʦ����ʿ��������Ա");
	    driver.findElement(By.name("unitPhone")).clear();
	    driver.findElement(By.name("unitPhone")).sendKeys("07557895656");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.name("duty"))).selectByVisibleText("�߲������Ա/�ܼ�����/�ּ����ϸɲ�");
	    Thread.sleep(2000);
	    driver.findElement(By.id("unitWorktime")).clear();
	    driver.findElement(By.id("unitWorktime")).sendKeys("10");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.id("unitAddre"))).selectByVisibleText("�㶫ʡ");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("unitCity"))).selectByVisibleText("������");
	    Thread.sleep(1000);
	    new Select(driver.findElement(By.id("unitTown"))).selectByVisibleText("��ɽ��");
	    driver.findElement(By.id("unitZhen")).clear();
	    driver.findElement(By.id("unitZhen")).sendKeys("��ݴ�");
	    driver.findElement(By.name("unitRidge")).clear();
	    driver.findElement(By.name("unitRidge")).sendKeys("���·");
	    driver.findElement(By.name("unitStr")).clear();
	    driver.findElement(By.name("unitStr")).sendKeys("1��");
	    driver.findElement(By.name("unitHome")).clear();
	    driver.findElement(By.name("unitHome")).sendKeys("101");
	    Thread.sleep(2000);
	    //��ϵ����Ϣ
	    new Select(driver.findElement(By.id("contractType_0"))).selectByVisibleText("����");
	    driver.findElement(By.name("contractInfos[0].contractName")).clear();
	    driver.findElement(By.name("contractInfos[0].contractName")).sendKeys("�º���");
	    driver.findElement(By.name("contractInfos[0].contractPhone")).clear();
	    driver.findElement(By.name("contractInfos[0].contractPhone")).sendKeys(args[12]);//�޸ļ�ͥ��ϵ�˺���
	    driver.findElement(By.name("contractInfos[0].contactWeixin")).clear();
	    driver.findElement(By.name("contractInfos[0].contactWeixin")).sendKeys("526878956");
	    Thread.sleep(2000);
	    new Select(driver.findElement(By.id("contractType_1"))).selectByVisibleText("����");
	    driver.findElement(By.name("contractInfos[1].contractName")).clear();
	    driver.findElement(By.name("contractInfos[1].contractName")).sendKeys("�޴���");
	    driver.findElement(By.name("contractInfos[1].contractPhone")).clear();
	    driver.findElement(By.name("contractInfos[1].contractPhone")).sendKeys(args[13]);//�޸ķǼ�ͥ��ϵ�˺���
	    driver.findElement(By.name("contractInfos[1].contactWeixin")).clear();
	    driver.findElement(By.name("contractInfos[1].contactWeixin")).sendKeys("854697455");
	    Thread.sleep(2000);
	    //Э����Ϣ
	    driver.findElement(By.name("checkApplyInfo")).click();
	    driver.findElement(By.name("mattersNeed")).click();
	    driver.findElement(By.name("checkMobile")).click();
	    driver.findElement(By.name("checkTel")).click();
	    Thread.sleep(2000);
	    //������Ϣ
	    new Select(driver.findElement(By.name("accompany"))).selectByVisibleText("0");
	    driver.findElement(By.name("accApply")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("accName")).clear();
	    driver.findElement(By.name("accName")).sendKeys("��ͬ��");
	    driver.findElement(By.name("accMobile")).clear();
	    driver.findElement(By.name("accMobile")).sendKeys("17895645527");
	    Thread.sleep(1000);
	    driver.findElement(By.name("mobileBrand")).clear();
	    driver.findElement(By.name("mobileBrand")).sendKeys("��Ϊ");
	    driver.findElement(By.name("stortFamKm")).clear();
	    driver.findElement(By.name("stortFamKm")).sendKeys("1");
	    driver.findElement(By.name("famComKm")).clear();
	    driver.findElement(By.name("famComKm")).sendKeys("1");
	    driver.findElement(By.name("stortComKm")).clear();
	    driver.findElement(By.name("stortComKm")).sendKeys("1");
	    //��֤��Ϣ
	    new Select(driver.findElement(By.name("userEvaluate"))).selectByVisibleText("1");
	    driver.findElement(By.id("userEvaluateCode")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.id("userEvaluateCode")).sendKeys(args[2]);//���ݸ��˵�¼������д
	    driver.findElement(By.id("save_but")).click();
	}


	}
	


