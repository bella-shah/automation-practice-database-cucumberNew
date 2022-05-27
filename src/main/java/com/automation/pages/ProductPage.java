package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")
    List<WebElement> topMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='clearfix']")
    List<WebElement> subCategory;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='product_list grid row']")
    List<WebElement> itemName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted'] ")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addToCart;

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenu) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickOnsubCategory(String tab) {
        for (WebElement menu : subCategory) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickOnItemName(String tab) {
        for (WebElement menu : itemName) {
            if (menu.getText().contains(tab)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public String verifyReference(String text) {

        List<WebElement> modelReference = driver.findElements(By.xpath("//p[@id='product_reference']"));
        for (WebElement names : modelReference) {
            if (names.getText().equalsIgnoreCase(text)) {
                log.info("verify Error Message " + text);
                break;
            }
        }
        return text;
    }

    public void enterQtyAdd(String qty) {
        quantity.clear();
        sendTextToElement(quantity, qty);
        log.info("Sending quantity to Quantity Field : " + quantity.toString());
    }

    public void clickOnaddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on add to cart " + addToCart.toString());
    }
}


