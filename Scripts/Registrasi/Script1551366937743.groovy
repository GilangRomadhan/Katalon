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

'Start Netzme'
Mobile.startApplication('C:\\Git\\Base\\src\\Netzme.apk', true)

'Tap tombol NEXT'
Mobile.tap(findTestObject('android.widget.TextView2 - NEXT'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - NEXT'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - NEXT'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - NEXT'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - NEXT'), 0)

Mobile.tap(findTestObject('android.widget.TextView3 - JOIN NOW'), 0)

Mobile.tap(findTestObject('android.widget.EditText0 - Phone number'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Phone number'), '08995097655', 0)

Mobile.tap(findTestObject('android.widget.CheckBox0'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - REGISTER'), 0)

Mobile.tap(findTestObject('android.widget.EditText0'), 0)

Mobile.setText(findTestObject('android.widget.EditText0'), '0000', 0)

Mobile.tap(findTestObject('android.widget.Button0 - VERIFY'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - Allow'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - SAVE'), 0)

Mobile.tap(findTestObject('android.widget.CheckBox0 - Dont show me again'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - CLOSE'), 0)

