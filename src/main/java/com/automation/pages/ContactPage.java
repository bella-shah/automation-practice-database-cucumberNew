package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

}