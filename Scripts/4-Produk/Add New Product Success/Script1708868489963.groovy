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

WebUI.callTestCase(findTestCase('1-Login/Login Success'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Homepage_kasirAja/Produk/div_produk'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage_kasirAja/Produk/div_produk'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/Produk/div_produk'))

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/Produk/a_tambah'))

WebUI.setText(findTestObject('Object Repository/Homepage_kasirAja/Produk/input_nama_nama'), 'Botol Air Mineral')

WebUI.setText(findTestObject('Object Repository/Homepage_kasirAja/Produk/input_deskripsi_deskripsi'), 'Le Minrale')

WebUI.setText(findTestObject('Object Repository/Homepage_kasirAja/Produk/input_harga beli_harga beli'), '4.000')

WebUI.setText(findTestObject('Object Repository/Homepage_kasirAja/Produk/input_harga jual_harga jual'), '10.000')

WebUI.setText(findTestObject('Object Repository/Homepage_kasirAja/Produk/input_stok_stok'), '20.000')

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/Produk/input_kategori_kategori'))

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/Produk/td_makanan ringan'))

WebUI.click(findTestObject('Object Repository/Homepage_kasirAja/Produk/button_simpan'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Homepage_kasirAja/Produk/td_Botol Air Mineral'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage_kasirAja/Produk/td_Botol Air Mineral'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

