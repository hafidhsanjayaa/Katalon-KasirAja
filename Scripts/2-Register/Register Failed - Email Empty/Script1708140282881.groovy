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

WebUI.callTestCase(findTestCase('1-Login/Move to Register Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Homepage_kasirAja/RegisterPage_kasirAja/input_nama toko_name'), 'Toko Sejahtera')

WebUI.setEncryptedText(findTestObject('Object Repository/Homepage_kasirAja/RegisterPage_kasirAja/input_password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/RegisterPage_kasirAja/svg_password_svg-inline--fa fa-eye-slash'))

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/RegisterPage_kasirAja/button_daftar'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Homepage_kasirAja/RegisterPage_kasirAja/div_email is not allowed to be empty'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage_kasirAja/RegisterPage_kasirAja/div_email is not allowed to be empty'))

WebUI.closeBrowser()
