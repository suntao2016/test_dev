******************** ccigmall auto test **********************
1、svn url
   http://192.168.1.64/svn/ccigmall/trunk/ccig-test/auto-test/
2、install jdk.1.6
3、window
     svn client: TortoiseSVN
     eclipse plugin : http://subclipse.tigris.org/update_1.10.x
   Linux
4、command
     cd **/auto-test
     mvn eclipse:eclipse (downloading relate with jar) 
     [run] *.xml
5、testng report [ auto-test/test-output/index.html , auto-test/test-output/old/index.html , auto-test/test-output/html/index.html ]
6、projetc structure 
     auto-test/src/main/java
        auto-test/src/main/java/com/ccigmall/auto/test/common/**.java  (this is base test code that contains the auto test base param and webdriver encapsulation)
        auto-test/src/main/java/com/ccigmall/auto/test/constant/**.java (this is common static variable and webdriver element location path)
        auto-test/src/main/java/com/ccigmall/auto/test/pc
        auto-test/src/main/java/com/ccigmall/auto/test/pad  (this is test cases)
     
     auto-test/src/main/resources/
        auto-test/src/main/resources/browser/** （this is browser driver）
        auto-test/src/main/resources/memcached/** （dev or test）
        auto-test/src/main/resources/com/ccigmall/auto/test/pc/** (test case need param)
        auto-test/src/main/resources/suite/** (this is testng driver)
PS：edit selenium.properties
            switch=true (regress test)
            switch=false (unit test)
            browser (type)
                
**************************************************************