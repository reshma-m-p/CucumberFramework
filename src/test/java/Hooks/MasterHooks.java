package Hooks;

import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MasterHooks {
  /*@After
  public void tearDown(){
      DriverFactory.getDriver().close();
  }
  @Before
  public void setUp(){

  }*/

    @After
    public void takeScreenshotOnFailure(Scenario sc) throws InterruptedException {
        if(sc.isFailed()){
            Thread.sleep(2000);
            String screenShotName=sc.getName().replaceAll(" ","_");
            final byte[] screenShot=((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            sc.attach(screenShot,"image/png",screenShotName);
        }
        DriverFactory.getDriver().quit();
    }
}
