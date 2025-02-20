import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.verifyElementText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/div_Swag Labs'), 
    'Swag Labs')

WebUI.setText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Swag Labs_user-name'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Swag Labs_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/span_1'))

WebUI.verifyElementText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/span_Your Cart'), 
    'Your Cart')

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/button_Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/span_Checkout Your Information'), 
    'Checkout: Your Information')

WebUI.verifyElementVisible(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/div_Checkout Your Information_checkout_info'))

WebUI.setText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Checkout Your Information_firstName'), 
    'Imam')

WebUI.setText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Checkout Your Information_lastName'), 
    'Fauzul')

WebUI.setText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Checkout Your Information_postalCode'), 
    '13330')

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/span_Checkout Overview'), 
    'Checkout: Overview')

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/button_Finish'))

WebUI.verifyElementText(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/div_Checkout Complete'), 
    'Checkout: Complete!')

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/button_Back Home'))

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/SH005 - Add Cart and Success Checkout/Page_Swag Labs/a_Logout'))

WebUI.closeBrowser()

