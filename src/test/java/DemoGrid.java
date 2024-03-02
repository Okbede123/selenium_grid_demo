import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoGrid {


    public static void main(String[] args) {
        test2();
    }


    public static void test1(){
        WebDriver driver;

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.ANY);
        desiredCapabilities.setBrowserName("chrome");
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.addArguments("--start-maximized");
        cOptions.merge(desiredCapabilities);
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), cOptions);
            driver.get("https://www.quangcaogiatot.com");
            System.out.println(driver.getTitle());
            Thread.sleep(10000);
            driver.quit();
        } catch (MalformedURLException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test2(){
        //ben may hub can chay lenh java -jar selenium-server-4.18.1.jar hub --port 4444
        // ko them port thi mac dinh 4444
        // ben may node can chay lenh nay java -jar selenium-server-4.18.1.jar node --port 6666  --hub http://192.168.1.4:4444

        // sau khi chay 2 cau lenh kia xong, khi chay code o duoi may hub no se lang nghe o cai port 6666 ben may node
        // va thuc thi code ben may node
        // dai loai tao 1 cong lang nghe ben may node, roi tu may hub tro cai url node, roi run code la no thuc thi code ben may node
        // ma khong can phai dong vao may node
        WebDriver driver;

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.ANY);
        desiredCapabilities.setBrowserName("chrome");
        ChromeOptions cOptions = new ChromeOptions();
        cOptions.addArguments("--start-maximized");
        cOptions.merge(desiredCapabilities);
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"), cOptions);
            driver.get("https://www.quangcaogiatot.com");
            System.out.println(driver.getTitle());
            Thread.sleep(10000);
            driver.quit();
        } catch (MalformedURLException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
