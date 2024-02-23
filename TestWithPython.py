import unittest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.service import Service

class test(unittest.TestCase):

    @unittest.skip("Disabled")
    def test01(self):
        driver = None
        service = Service("D:\\webdriver\\chromedriver.exe")
        driver = webdriver.Chrome(service=service)
        driver.get("http://www.coding-midcareer.com/register")
        
        driver.execute_script("window.scrollBy(0,2000)", "")
        
        dep_tel_tf = driver.find_element(By.NAME, "dep_tel").is_enabled()
        self.assertTrue(dep_tel_tf)
        
        receipt_name_tf = driver.find_element(By.NAME, "receipt_name").is_enabled()
        self.assertFalse(receipt_name_tf)

        # Uncomment the following lines if you want to interact with the form elements
        # firstNameInput = driver.find_element(By.ID, "firstname")
        # lastNameInput = driver.find_element(By.ID, "lastname")
        # ageInput = driver.find_element(By.ID, "age")
        # submitButton = driver.find_element(By.ID, "sub")
        # firstNameInput.send_keys("johnjohn")
        # lastNameInput.send_keys("canonc")
        # ageInput.send_keys("2")
        # submitButton.click()
        # result = driver.find_element(By.ID, "firstname").text
        # self.assertEqual("johnjohn", result)
        # driver.close()

    def testButton(self):
        driver = None
        service = Service("D:\\webdriver\\chromedriver.exe")
        driver = webdriver.Chrome(service=service)
        driver.get("https://mflowthai.com/mflow/consent")
        
        confirm_btn1 = driver.find_element(By.ID, "confirmModalButton").is_enabled()
        self.assertFalse(confirm_btn1)
        
        # Click Check_box
        chk0 = driver.find_element(By.ID, "0")
        chk1 = driver.find_element(By.ID, "1")
        chk2 = driver.find_element(By.ID, "2")
        chk3 = driver.find_element(By.ID, "3")
        chk0.click()
        chk1.click()
        chk2.click()
        chk3.click()
        
        driver.execute_script("window.scrollBy(0,500)", "")
        
        dep_tel2_tf = driver.find_element(By.ID, "confirmModalButton").is_enabled()
        self.assertTrue(dep_tel2_tf)
        driver.find_element(By.ID, "confirmModalButton").click()
        
        import time
        time.sleep(3)
        confirm_btn3 = driver.find_element(By.ID, "confirmModalButton").is_enabled()
        self.assertFalse(confirm_btn3)

if __name__ == '__main__':
    unittest.main()
