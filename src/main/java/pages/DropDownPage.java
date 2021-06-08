package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Method to return the Select object
     * @return Select object
     */
    private Select findDropDownElement(){
        return  new Select(driver.findElement(dropDown));
    }

    /**
     * Select The Option From The Dropdown
     * @param option The visible option
     */
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    //method to get the selected option, so that we pass it to above method

    /**
     * method to get the selected option, so that we pass it to above method
     * @return a list of string represent the options
     */
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        /*
        * instead of the line under-there we could loop throw the list and pick one by one WebElement,
        * convert them to string and then add them to a new list.
        * but this is a new short approach.
        */
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }


    public void selectAllOptions(){
        String script = "document.querySelector(\"#dropdown\").setAttribute('multiple','');";
        var jsExecutor = ((JavascriptExecutor)driver);
        jsExecutor.executeScript(script,findDropDownElement());
    }






}
