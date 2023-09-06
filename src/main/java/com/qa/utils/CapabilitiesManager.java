package com.qa.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();

        try {
            utils.log().info("getting capabilities");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
            caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
            caps.setCapability("newCommandTimeout", 120);
            switch (params.getPlatformName()) {
                case "Android":
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, props.getProperty("deviceName"));
                    caps.setCapability(MobileCapabilityType.UDID, props.getProperty("udid"));
                    caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                    caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                    caps.setCapability("systemPort", params.getSystemPort());
                    caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
                    //String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
                    String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "apps" + File.separator + "app-universal-debug.apk";
                    //utils.log().info("appUrl is" + androidAppUrl);
                    // caps.setCapability("app", androidAppUrl);
                    break;
                case "iOS":
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
                    caps.setCapability(MobileCapabilityType.APP, props.getProperty("app"));
                    caps.setCapability(MobileCapabilityType.UDID, props.getProperty("udid"));
                    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, props.getProperty("platformVersion"));
                    caps.setCapability(MobileCapabilityType.DEVICE_NAME, props.getProperty("deviceName"));

                    //String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                    String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "apps" + File.separator + "Finhay.app";
                    utils.log().info("appUrl is" + iOSAppUrl);
                    caps.setCapability("appActivity", props.getProperty("appActivity"));
                    caps.setCapability("appPackage", props.getProperty("appPackage"));
                    //    caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
                    caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
                    caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
                    caps.setCapability("app", iOSAppUrl);
                    caps.setCapability("unicodeKeyboard", true);
                    caps.setCapability("resetKeyboard", true);
                    caps.setCapability("connectHardwareKeyboard", true)
                    ;
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    break;
            }
            return caps;
        } catch (Exception e) {
            e.printStackTrace();
            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }
}
