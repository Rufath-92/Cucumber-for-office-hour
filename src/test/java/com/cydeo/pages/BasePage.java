package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public abstract class BasePage {


    public BasePage() {
         PageFactory.initElements(Driver.getDriver(),this);


    }
}
