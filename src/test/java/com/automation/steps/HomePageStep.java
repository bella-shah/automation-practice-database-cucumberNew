package com.automation.steps;

import com.automation.pages.AuthPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.ProductPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class HomePageStep {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSigninLinkAndChecknavigatepage();
    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new MyAccountPage().createAnAccountWithRandomUserName("ram");
        new MyAccountPage().clickOnCreateAnAccountButton();
        new AuthPage().enterFirstName("Bella");
        new AuthPage().enterLastName("Shah");
        new AuthPage().enterPassWord("12345678");
        new AuthPage().enterAddress1("55-whithron Ave");
        new AuthPage().enterCityName("Miami");
        new AuthPage().selectState("Florida");
        new AuthPage().enterZipCode("33101");
        new AuthPage().selectCountry("United States");
        new AuthPage().enterHomePhone("9966440022");
        new AuthPage().enterMobilePhone("9966440022");
        new AuthPage().enterAssignAddress("W10 drf");
        new AuthPage().clickOnRegisterButton();
    }

    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSigninLinkAndChecknavigatepage();
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
     new MyAccountPage().enterLoginDetail();
    }


    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new AuthPage().clickOnMyAddress();
        String expectedMessage = "55-whithron Ave";
        String actualmessage = new AuthPage().verifyMyAddress();
        Assert.assertEquals("Address is not display", expectedMessage, actualmessage);
    }

    @And("^I add below product to cart$")
    public void iAddBelowProductToCart() {
    }
    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> e : userList) {
            System.out.println(e);
            System.out.println(e.get(0));
        }
    }

    @Then("^I shall validate shopping cart as below$")
    public void iShallValidateShoppingCartAsBelow(DataTable  dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
            for (List<String> data : userList) {
                new ProductPage().clickOnMenuTab(data.get(0));
                new ProductPage().clickOnsubCategory(data.get(1));
                new ProductPage().clickOnItemName(data.get(2));
                new ProductPage().verifyReference(data.get(3));
                new ProductPage().enterQtyAdd(data.get(4));
                new ProductPage().clickOnaddToCart();

            }

        }


    @Then("^I shall be able to Buy the product$")
    public void iShallBeAbleToBuyTheProduct() {
    }

    @And("^I shall be able to Buy using cheque payment$")
    public void iShallBeAbleToBuyUsingChequePayment() {
    }

    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
    }

    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
    }
}

