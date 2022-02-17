package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1 {

public static void main(String[] args) {
// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\selenium ide\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
String baseUrl = "http://www.google.com/search?q=imsec&rlz=1C1CHBD_enIN990IN990&ei=dvwNYqqjIqPsz7sPkNSTiA0&ved=0ahUKEwiqtqDMnob2AhUj9nMBHRDqBNEQ4dUDCA8&uact=5&oq=imsec&gs_lcp=Cgdnd3Mtd2l6EAMyBQguEJECMgQIABAKMgcILhCxAxAKMgcIABCxAxAKMgcILhCxAxAKMgoIABCxAxCxAxAKMgcIABCxAxAKMgcIABCxAxAKMgQIABAKMgcIABCxAxAKOgcIABBHELADOgcIABCwAxBDOgwILhDIAxCwAxBDGAA6DwguENQCEMgDELADEEMYADoRCC4QsQMQgwEQxwEQowIQkQI6CwgAELEDEIMBEJECOgsIABCABBCxAxCDAToFCAAQgAQ6CAgAELEDEIMBOgsILhCABBDHARCvAToICC4QgAQQ1AI6CggAEOoCELQCEEM6CgguEOoCELQCEEM6DQguENQCEOoCELQCEEM6EQguEIAEELEDEIMBEMcBENEDOgcIABCxAxBDOgQIABBDOgoILhDHARDRAxBDOggIABCABBCxAzoLCC4QgAQQsQMQgwE6DQguELEDEMcBEKMCEEM6CwguEIAEELEDENQCOg4ILhCABBCxAxDHARCvAToQCC4QsQMQxwEQ0QMQ1AIQQzoLCC4QsQMQgwEQkQI6BwgAEIAEEApKBAhBGABKBAhGGAFQqQxYii9gzDJoAnABeACAAfcDiAHPD5IBCTAuOC4xLjUtMZgBAKABAbABCsgBEsABAdoBBggAEAEYCA&sclient=gws-wiz/";
String expectedTitle = "imsec - Google Search";
String actualTitle = "";

// launch Fire fox and direct it to the Base URL
driver.get(baseUrl);

// get the actual value of the title
actualTitle = driver.getTitle();
/*
 * compare the actual title of the page with the expected one and print
 * the result as "Passed" or "Failed"
 */
if (actualTitle.contentEquals(expectedTitle)){
    System.out.println("Test Passed!");
} else {
    System.out.println("Test Failed");
}

//close Fire fox
driver.close();

}

}