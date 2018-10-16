import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.123.25')

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/button_ (1)'))

WebUI.setText(findTestObject('Object Repository/Page_STOP SPAM/input_person_mat-input-0'), 'afd@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STOP SPAM/input_https_mat-input-1'), 'NOZHw6sL/1I=')

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/button_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/a_'))

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/button_add'))

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/div_'))

WebUI.setText(findTestObject('Page_STOP SPAM/input_ _mat-input-7'), 'КМДА')

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/span_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_STOP SPAM/div_'))

WebUI.setText(findTestObject('Object Repository/Page_STOP SPAM/textarea__mat-input-11'), 'sadf')

WebUI.click(findTestObject('Page_STOP SPAM/button__2'))

