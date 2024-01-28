package com.myfirstproject;

public class testngcodestestforprojects {

    /*
public class Mertcan_HomePage {
    public Mertcan_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Register']")
    public WebElement RegisterButton;
    @FindBy(xpath = "//a[.='Signup as a vendor?']")
    public  WebElement SignupAsaVendorButton;


    public class Mertcan_RegistrationPage {
    public Mertcan_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user_email")
    public WebElement email;
    @FindBy(id = "passoword")
    public WebElement password;
    @FindBy(id = "confirm_pwd")
    public WebElement confrmpwd;
    @FindBy(xpath = "//input[@name='save-data']")
    public WebElement registerButton;
    @FindBy(xpath = "//input[@name='wcfm_email_verified_button']")
    public WebElement resendcodeButton;
    @FindBy(xpath = "//input[@name='wcfm_email_verified_input']")
    public WebElement verificationcode;


    public class Mertcan_VendorStoreManagerPage {
    public Mertcan_VendorStoreManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='text'][1]")
    public WebElement productsButton;
    @FindBy(xpath = "//span[.='Add New']")
    public WebElement addnewButton;
    @FindBy(id = "is_virtual")
    public WebElement virtualButton;
    @FindBy(id = "is_downloadable")
    public WebElement downloadableButton;
    @FindBy(id = "pro_title")
    public WebElement title;
    @FindBy(id = "regular_price")
    public WebElement price;
    @FindBy(id = "sale_price")
    public WebElement salePrice;
    @FindBy(name = "wcfm_email_verified_input")
    public WebElement verificationcode;

    //TC01 tests
    public class TC01 {

    @Test
    public void testcase1(){
        Mertcan_HomePage mertcanHomePage = new Mertcan_HomePage();
        Mertcan_RegistrationPage mertcanRegistrationPage = new Mertcan_RegistrationPage();
        Faker faker = new Faker();

        //navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        WaitUtils.waitFor(2);
        //click on register button
        mertcanHomePage.RegisterButton.click();
        WaitUtils.waitFor(2);
        //click sign up as a vendor
        mertcanHomePage.SignupAsaVendorButton.click();
        WaitUtils.waitFor(2);
        //enter email
        mertcanRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(2);
        //navigate to fake mail site
        Driver.getDriver().get("https://www.fakemail.net/");




        mertcanRegistrationPage.verificationcode.sendKeys("");
        //enter password
        mertcanRegistrationPage.password.sendKeys("deneme1234");
        WaitUtils.waitFor(2);
        //re enter password
        mertcanRegistrationPage.confrmpwd.sendKeys("deneme1234");
        WaitUtils.waitFor(2);
        mertcanRegistrationPage.registerButton.click();
        WaitUtils.waitFor(2);

        //TC02
        public class TC02 {
    @Test
    public void testcase2(){
        Mertcan_VendorStoreManagerPage mertcanVendorStoreManagerPage = new Mertcan_VendorStoreManagerPage();
        Mertcan_HomePage mertcanHomePage = new Mertcan_HomePage();
        Mertcan_RegistrationPage mertcanRegistrationPage = new Mertcan_RegistrationPage();
        Faker faker = new Faker();
        //navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        WaitUtils.waitFor(1);
        //click on register button
        mertcanHomePage.RegisterButton.click();
        WaitUtils.waitFor(1);
        //click sign up as a vendor
        mertcanHomePage.SignupAsaVendorButton.click();
        WaitUtils.waitFor(1);
        //enter email
        mertcanRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(1);
        Driver.getDriver().navigate().refresh();
        WaitUtils.waitFor(1);
        //enter password
        mertcanRegistrationPage.password.sendKeys(faker.internet().password());
        WaitUtils.waitFor(1);
        //re enter password
        mertcanRegistrationPage.password.sendKeys(faker.internet().password());
        WaitUtils.waitFor(1);
        mertcanRegistrationPage.registerButton.click();
        WaitUtils.waitFor(1);
        //assert that vendor at home page
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://allovercommerce.com/store-manager/"));
        WaitUtils.waitFor(1);
        //click products button
        mertcanVendorStoreManagerPage.productsButton.click();
        WaitUtils.waitFor(1);
        //click add new button
        mertcanVendorStoreManagerPage.addnewButton.click();
        WaitUtils.waitFor(1);
        //assert that simple product as default option
        Assert.assertTrue(Driver.getDriver().getTitle().contains("//option[.='Simple Product']"));

        //Test 03

        public class  TC03 {
    @Test
    public void testcase3(){
        Mertcan_VendorStoreManagerPage mertcanVendorStoreManagerPage = new Mertcan_VendorStoreManagerPage();
        Mertcan_HomePage mertcanHomePage = new Mertcan_HomePage();
        Mertcan_RegistrationPage mertcanRegistrationPage = new Mertcan_RegistrationPage();
        Faker faker = new Faker();
        //navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        WaitUtils.waitFor(1);
        //click on register button
        mertcanHomePage.RegisterButton.click();
        WaitUtils.waitFor(1);
        //click sign up as a vendor
        mertcanHomePage.SignupAsaVendorButton.click();
        WaitUtils.waitFor(1);
        //enter email
        mertcanRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(1);
        Driver.getDriver().navigate().refresh();
        WaitUtils.waitFor(1);
        //enter password
        mertcanRegistrationPage.password.sendKeys(faker.internet().password());
        WaitUtils.waitFor(1);
        //re enter password
        mertcanRegistrationPage.password.sendKeys(faker.internet().password());
        WaitUtils.waitFor(1);
        mertcanRegistrationPage.registerButton.click();
        WaitUtils.waitFor(1);
        //assert that vendor at home page
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://allovercommerce.com/store-manager/"));
        WaitUtils.waitFor(1);
        //click products button
        mertcanVendorStoreManagerPage.productsButton.click();
        WaitUtils.waitFor(1);
        //click add new button
        mertcanVendorStoreManagerPage.addnewButton.click();
        WaitUtils.waitFor(1);
        //assert that simple product as default option
        Assert.assertTrue(Driver.getDriver().getTitle().contains("//option[.='Simple Product']"));
        //click virtual
        mertcanVendorStoreManagerPage.virtualButton.click();
        //click downloadable button
        mertcanVendorStoreManagerPage.downloadableButton.click();
        //enter product title
        mertcanVendorStoreManagerPage.title.sendKeys("apple");
        //enter price
        mertcanVendorStoreManagerPage.price.sendKeys("999");
        //enter sale price
        mertcanVendorStoreManagerPage.salePrice.sendKeys("999");
        //select one categorie



    }
}




}
}



    }
    }




}

}



}



     */
}
