@tag
Feature:
As Admin user i want user ERP module
@supplier
Scenario Outline:
i want add suppliers with multipe data
Given Launch browser as
When launch url
When wait for username with "name" and "username" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath"  and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]" and "10"
When click Supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When Wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When Click Addicon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for supplier number with "name" and "x_Supplier_Number" and "10"
When Capture Supplier number with "name" and "x_Supplier_Number"
When Enter in "<suppliername>" with "name" and "x_Supplier_Name"
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']" 
When Click Add button with "id" and "btnAction"
When wait for ConfirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When  click Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Verify SupplierNumber
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|suppliername|address|city|country|cperson|pnumber|mail|mnumber|note|
|Testing1|Ameerpet1|Hydearbad|India|Qedgetech1|8765432123|test@gmail.com|7654321234|iam a new Supplier|
|Testing2|Ameerpet2|Hydearbad|India|Qedgetech5|8765432123|test@gmail.com|7654321234|iam a new Supplier|

@Customer
Scenario Outline:
Validate Customer with multiple data
Given Launch browser as
When launch url
When wait for username with "name" and "username" and "10"
When Enter user name with "name" and "username" and "admin"
When Enter password with "xpath"  and "//input[@id='password']" and "master"
When click login button with "xpath" and "//button[@id='btnsubmit']"
When wait for customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]" and "10"
When click customer link with "xpath" and "(//a[contains(text(),'Customers')])[2]"
When Wait for AddIcon with "xpath" and "(//span[@data-caption='Add'])[1]" and "10"
When Click Addicon button with "xpath" and "(//span[@data-caption='Add'])[1]"
When wait for customer number with "name" and "x_Customer_Number" and "10"
When Capture customer number with "name" and "x_Customer_Number"
When Enter in "<customername>" with "name" and "x_Customer_Name"
When Enter in "<address>" with "xpath" and "//textarea[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//input[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//input[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//input[@id='x_Notes']" 
When Click Add button with "id" and "btnAction"
When wait for ConfirmOk button with "xpath" and "//button[normalize-space()='OK!']" and "10"
When  click Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]" and "10"
When Click Alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Verify CustomerNumber
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|customername|address|city|country|cperson|pnumber|mail|mnumber|note|
|Nikhil1|karimnagar1|Hyderabad|India|Sravanthi1|807431360|Test@gmail.com|8074258697|i am a new customer|
|Nikhil2|karimnagar2|Hyderabad|India|Sravanthi2|807431360|Test@gmail.com|8074258697|i am a new customer|




