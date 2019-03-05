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

Mobile.startApplication('C:\\Git\\Base\\src\\Netzme.apk', true)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton3'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - 08995097601'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Type message here'), 'Test kirim pesan', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton1'), 0)

'Header contact\r\n'
Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton3'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - 08995097601 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button1 - Allow'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - PHOTO'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ToggleButton1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (2)'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Describe your photo'), 'Send lewat camera', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - SEND'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton3'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - 08995097601 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView0 - VIDEO'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (3)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (4)'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Describe your video'), 'Kirim video lewat telpon', 
    0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - SEND (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - GOT IT'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton3'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - 08995097601 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView5'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (5)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (6)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton2'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView26'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - GOT IT (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView7'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton1 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (2)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - CROP'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Describe your photo'), 'Ganti PP', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - SAVE'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - SAVE'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (7)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView26'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView7'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - 08995097655'), 'Ganti Nick Name', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - SAVE'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (7)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View0'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View0'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.CheckBox0 - Dont show me again'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - GOT IT (2)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - PHOTO (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (2)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - Post to Stories'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Describe your photo'), 'Posting stories from gallery', 
    0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - POST'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView0 - VIDEO (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ViewSwitcher0'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - Post to Stories (1)'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Describe your video'), 'Posting video live', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - POST (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View2'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View2'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View0 (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - Post to Stories'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Describe your photo'), 'Posting photo from gallery', 
    0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - POST'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView14 - Quote'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Tell your stories'), 'This is quote from the past', 
    0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton5'), 0)

Mobile.tap(findTestObject('Smoke Test/android.view.View1'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView9 - New Group'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.CheckBox0 - Dont show me again (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - GOT IT (3)'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Group name'), 'Group Robot', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - ADD MEMBER'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - 08995097601 (2)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - ADD'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView1 - CREATE'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton3'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - Group Robot'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView3 - Group Robot (1)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.Button0 - ADD MEMBER'), 0)

Mobile.setText(findTestObject('Smoke Test/android.widget.EditText0 - Search contact'), '08995097611', 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - 08995097611'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.TextView2 - YES'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton0 (8)'), 0)

Mobile.tap(findTestObject('Smoke Test/android.widget.ImageButton1 (2)'), 0)

Mobile.closeApplication()

