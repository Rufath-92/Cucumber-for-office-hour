package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;

public class HomePage {

    public static void click(String label){
        String locator = "//a[.='" + label + "']";
        Driver.getDriver().findElement(By.xpath(locator)).click();
    }
}
