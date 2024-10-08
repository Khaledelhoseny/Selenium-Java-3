package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class FramesPage extends MethodHandles {

   public FramesPage(WebDriver driver){
       super(driver);
   }

    private final String frameId = "singleframe" ;
    private final By frameInput = By.xpath("(//input[@type = 'text'])") ;
    private final By iframeWithinAnIframe = By.linkText("Iframe with in an Iframe") ;

    public void insertTextInSingelIframe( String text ){
        switchToFrameByString(frameId);
        sendKeys(frameInput,4,text);
        switchToParent();
    }

    public void clickOnIframeWithinAnIframe(){
        click(iframeWithinAnIframe,5);
    }

    public void insertTextInNestedIframe( String text ){
        switchToFrameByIndex(1);
        switchToFrameByIndex(0);
        sendKeys(frameInput,4,text);
    }

}
