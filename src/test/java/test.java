import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Testing");
		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/eu/form/signup/freetrial-sales-pe.jsp");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("UserFirstName")).sendKeys("Samuel");
		driver.findElement(By.id("UserLastName")).sendKeys("Jackson");
		driver.findElement(By.id("UserTitle")).sendKeys("Hacker");
		driver.findElement(By.id("UserEmail")).sendKeys("Jackson@heloo.com");
		driver.findElement(By.id("UserPhone")).sendKeys("9485671234");
		driver.findElement(By.id("CompanyName")).sendKeys("Nam");
		Thread.sleep(2000); // //ul[@class='selectBox-dropdown-menu selectBox-options']//li
		driver.findElement(By.xpath(".//*[@id='form-container']/ul/li[7]/div/div[2]/a/span[1]")).click();
		Thread.sleep(2000);
		int count = driver.findElements(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options']//li"))
				.size();
//int count = driver.findElements(By.xpath("//td[@class='day']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options']//li"))
					.get(i).getText();
			if (text.equalsIgnoreCase("6 - 18 employees")) {
				// driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();
				driver.findElements(By.xpath("//ul[@class='selectBox-dropdown-menu selectBox-options']//li")).get(i)
						.click();
				System.out.println(text);
				break;
			}
		}
	}

}
