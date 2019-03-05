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

'Button Contact\r\n'
Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton3'), 0)

'Pilih contact\r\n'
Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - 08995097601'), 0)

'Ketik pesan\r\n'
Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Type message here'), 'Test kirim pesan', 0)

'Kirim pesan\r\n'
Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0'), 0)

'Exit from chat\r\n'
Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton1'), 0)

