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
Mobile.tap(findTestObject('Registrasi/Reg.button - NEXT'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - NEXT'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - NEXT'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - NEXT'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - NEXT'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - JOIN NOW'), 0)

Mobile.setText(findTestObject('Registrasi/Reg.button - Phone number'), '08995097655', 0)

Mobile.tap(findTestObject('Registrasi/Reg.Checkbock - Term  condition'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - REGISTER'), 0)

Mobile.setText(findTestObject('Registrasi/android.widget.EditText0'), '0000', 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - VERIFY'), 0)

Mobile.tap(findTestObject('General/Button permission - Allow'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - SAVE'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.checkbox - Dont show me again'), 0)

Mobile.tap(findTestObject('Registrasi/Reg.button - CLOSE'), 0)

