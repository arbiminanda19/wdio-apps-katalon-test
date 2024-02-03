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

Mobile.tap(findTestObject('Object Repository/Forms/android.widget.TextView - Forms'), 0)

Mobile.setText(findTestObject('Object Repository/Forms/android.widget.EditText - Type something'), 'test', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Forms/android.widget.TextView - test'), 'test', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Forms/android.widget.Switch'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Forms/android.widget.TextView - Click to turn the switch OFF'), 
    'Click to turn the switch OFF', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Forms/android.widget.EditText - Select an item'), 0)

Mobile.tap(findTestObject('Object Repository/Forms/android.widget.CheckedTextView - Appium is awesome'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Forms/android.widget.EditText - Appium is awesome'), 'Appium is awesome', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Forms/android.widget.TextView - Active'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Forms/android.widget.TextView - This button is active'), 'This button is active', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Forms/android.widget.Button - OK'), 0)

