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

WebUI.navigateToUrl('https://www.ebay.com/')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'tegarpandji51@gmail.com')

WebUI.setEncryptedText(findTestObject('null'), '/kyljx7n72cKBGt0pneP1w==')

WebUI.setText(findTestObject('null'), 
    'Super Sentai')

WebUI.click(findTestObject('null'))

WebUI.switchToWindowTitle('Bandai Super Mini Pla Shinka Gattai Kyoryu Sentai Zyuranger Daizyujin 5 Pack New | eBay')

WebUI.click(findTestObject('Object Repository/Element/Page_Bandai Super Mini Pla Shinka Gattai Ky_b31ac9/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Element/Page_eBay shopping cart (1)/button_Go to checkout'))

WebUI.closeBrowser()

