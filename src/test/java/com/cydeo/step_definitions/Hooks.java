package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import static com.cydeo.utilities.BrowserUtils.sleep;
public class Hooks {

    @After
    public void tearDown() {
        sleep(3);
        Driver.closeDriver();
    }
}
