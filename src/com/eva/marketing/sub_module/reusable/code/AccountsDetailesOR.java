package com.eva.marketing.sub_module.reusable.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eva.webutil.WebUtil;

import lombok.Getter;

@Getter
public class AccountsDetailesOR {

	public AccountsDetailesOR(WebUtil util) {
		PageFactory.initElements(util.getDriver(), this);
	}

	@FindBy(name = "accountname")
	protected WebElement accountNameTB;

	@FindBy(name = "website")
	protected WebElement webSiteTB;

	@FindBy(name = "tickersymbol")
	protected WebElement ticketSymboleTB;

	@FindBy(id = "phone")
	protected WebElement phoneTB;

	@FindBy(xpath = "//td[contains(text(),'ACC')]")
	protected WebElement accNoIT;

	@FindBy(xpath = "//input[@id='fax']")
	protected WebElement faxTB;

	@FindBy(xpath = "//input[@id='email1']")
	protected WebElement emailTB;

	@FindBy(name = "bill_street")
	protected WebElement billAddressTB;

	@FindBy(id = "bill_pobox")
	protected WebElement billPoxTB;

	@FindBy(id = "bill_city")
	protected WebElement billCityTB;

	@FindBy(id = "bill_state")
	protected WebElement billStateTB;

	@FindBy(id = "bill_code")
	protected WebElement billPostoleCodeTB;

	@FindBy(id = "bill_country")
	protected WebElement billCountryTB;

	@FindBy(name = "ship_street")
	protected WebElement shippAddressTB;

	@FindBy(id = "ship_pobox")
	protected WebElement shippPoxTB;

	@FindBy(id = "ship_city")
	protected WebElement shippCityTB;

	@FindBy(id = "ship_state")
	protected WebElement shippStateTB;

	@FindBy(id = "ship_code")
	protected WebElement shippPostoleCodeTB;

	@FindBy(id = "ship_country")
	protected WebElement shippCountryTB;

	@FindBy(xpath = "//b[text()='Copy Shipping address']/parent::td/child::input[@name='cpy']")
	protected WebElement copyShippingAddressCB;

	@FindBy(xpath = "//b[text()='Copy Billing address']/parent::td/child::input[@name='cpy']")
	protected WebElement copyBillingAddressCB;

	@FindBy(xpath = "description")
	protected WebElement descriptionTA;

}
