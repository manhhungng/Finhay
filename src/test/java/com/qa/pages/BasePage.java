package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class BasePage {
    static AppiumDriver<?> driver;
    TestUtils utils = new TestUtils();
    public static WebDriverWait wait;



    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
        wait = new WebDriverWait(driver, 40);
    }
    public void refreshPage(){

    }
    public void waitForVisibility(MobileElement e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(MobileElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(MobileElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(MobileElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }


    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeysNoClear(MobileElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(MobileElement e, String txt) {
        waitForVisibility(e);
        clear(e);
        e.sendKeys(txt);
    }

    public boolean isElementDisplayed(MobileElement e) {
        try {
            return e.isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean isElementEnable(MobileElement e) {
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                getAttribute(e, "enabled");
                break;
            case "iOS":
                getAttribute(e, "enabled");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }

        return e.isEnabled();
    }


    //  public void sendKeys(MobileElement e, String txt, String msg) {
    //     waitForVisibility(e);
    //     utils.log().info(msg);
    //     e.sendKeys(txt);
    // }

    public String getAttribute(MobileElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(MobileElement e) {
        String txt;
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        return e.getText();
    }

    public String getText(MobileElement e, String msg) {
        String txt;
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public String getText(By e, String msg) {
        String txt;
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public void closeApp() {
        ((InteractsWithApps) driver).closeApp();
    }

    public void launchApp() {
        ((InteractsWithApps) driver).launchApp();
    }

    public MobileElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
        return (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                        + "new UiSelector()." + childLocAttr + "(\"" + childLocValue + "\"));");
    }

    public MobileElement iOSScrollToElementUsingMobileScroll(MobileElement e) {
        RemoteWebElement element = ((RemoteWebElement) e);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
//	  scrollObject.put("direction", "down");
//	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
//	  scrollObject.put("name", "test-ADD TO CART");
        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        return e;
    }

    public By iOSScrollToElementUsingMobileScrollParent(MobileElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement) parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
        scrollObject.put("predicateString", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        By m = MobileBy.iOSNsPredicateString(predicateString);
        System.out.println("Mobilelement is " + m);
        return m;
    }

    public MobileElement scrollToElement(MobileElement e, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.7);
        int endX = (int) (size.width * 0.7);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.8);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 7; i++) {
            if (find(e, 2)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 300);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found");
        }
        return e;
    }

    public By scrollToElement(By element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found");
        }
        return element;
    }

    public boolean find(final MobileElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public void swipe(int startX, int startY, int endX, int endY, int millis)
            throws InterruptedException {
        TouchAction t = new TouchAction(driver);
        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release().perform();
    }

    public void tapByElement(MobileElement e) {
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(e))).perform();
    }



    public void swipeMobileDown() {

        Dimension size = driver.manage().window().getSize();

        int starty = (int) (size.height * 0.7);

        int endy = (int) (size.height * 0.3);

        int startx = size.width / 2;

        try {
            swipe(startx, startx, starty, startx, endy);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void swipeMobileUp() throws InterruptedException {

        Dimension size = driver.manage().window().getSize();

        int starty = (int) (size.height * 0.8);

        int endy = (int) (size.height * 0.2);

        int startx = size.width / 2;

        swipe(startx, startx, endy, startx, starty);

    }

    public void rightLeftSwipe() throws InterruptedException {

        Dimension size = driver.manage().window().getSize();

        int startx = (int) (size.width * 0.90);

        int endx = (int) (size.width * 0.10);

        int starty = size.height / 2;

        swipe(startx, startx, starty, endx, starty);

    }

    public void leftRightSwipe() throws InterruptedException {

        Dimension size = driver.manage().window().getSize();

        int startx = (int) (size.width * 0.90);

        int endx = (int) (size.width * 0.10);

        int starty = size.height / 2;

        swipe(startx, endx, starty, startx, starty);

    }

    public void swipeUpInContainer(By locator, AndroidElement androidElementContainer, int count) throws InterruptedException {
        boolean isVisible = checkElementDisplayed(locator);
        if (isVisible) {
            return;
        }
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;

        startx = endx = androidElementContainer.getLocation().getX() + Math.round(androidElementContainer.getSize().getWidth() / 2);

        starty = (int) (androidElementContainer.getLocation().getY() + Math.round(0.8 * androidElementContainer.getSize().getHeight()));
        endy = (int) (androidElementContainer.getLocation().getY() + Math.round(0.2 * androidElementContainer.getSize().getHeight()));
        System.out.println(startx + "_" + starty + "_" + endx + "_" + endy);
        for (int i = 0; i < count; ++i) {
            swipe(startx, startx, starty, endx, endy);
            isVisible = checkElementDisplayed(locator);
            if (isVisible) {
                break;
            }
        }
    }

    public void swipeDownInContainer(By locator, AndroidElement androidElementContainer, int count) throws InterruptedException {
        boolean isVisible = checkElementDisplayed(locator);
        if (isVisible) {
            return;
        }
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;

        startx = endx = androidElementContainer.getLocation().getX() + Math.round(androidElementContainer.getSize().getWidth() / 2);

        starty = (int) (androidElementContainer.getLocation().getY() + Math.round(0.2 * androidElementContainer.getSize().getHeight()));
        endy = (int) (androidElementContainer.getLocation().getY() + Math.round(0.8 * androidElementContainer.getSize().getHeight()));
        System.out.println(startx + "_" + starty + "_" + endx + "_" + endy);
        for (int i = 0; i < count; ++i) {
            swipe(startx, startx, starty, endx, endy);
            isVisible = checkElementDisplayed(locator);
            if (isVisible) {
                break;
            }
        }
    }

    public void swipeLeftInContainer(By locator, AndroidElement androidElementContainer, int count) throws InterruptedException {
        boolean isVisible = checkElementDisplayed(locator);
        if (isVisible) {
            return;
        }
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;

        starty = endy = androidElementContainer.getLocation().getY() + Math.round(androidElementContainer.getSize().getHeight() / 2);

        startx = (int) (androidElementContainer.getLocation().getX() + Math.round(0.8 * androidElementContainer.getSize().getWidth()));
        endx = (int) (androidElementContainer.getLocation().getX() + Math.round(0.2 * androidElementContainer.getSize().getWidth()));
        System.out.println(startx + "_" + starty + "_" + endx + "_" + endy);
        for (int i = 0; i < count; ++i) {
            swipe(startx, startx, starty, endx, endy);
            isVisible = checkElementDisplayed(locator);
            if (isVisible) {
                break;
            }
        }
    }

    public void swipeRightInContainer(By locator, AndroidElement androidElementContainer, int count) throws InterruptedException {
        boolean isVisible = checkElementDisplayed(locator);
        if (isVisible) {
            return;
        }
        int startx = 0;
        int starty = 0;
        int endx = 0;
        int endy = 0;

        starty = endy = androidElementContainer.getLocation().getY() + Math.round(androidElementContainer.getSize().getHeight() / 2);

        startx = (int) (androidElementContainer.getLocation().getX() + Math.round(0.2 * androidElementContainer.getSize().getWidth()));
        endx = (int) (androidElementContainer.getLocation().getX() + Math.round(0.8 * androidElementContainer.getSize().getWidth()));
        System.out.println(startx + "_" + starty + "_" + endx + "_" + endy);
        for (int i = 0; i < count; ++i) {
            swipe(startx, startx, starty, endx, endy);
            isVisible = checkElementDisplayed(locator);
            if (isVisible) {

                break;
            }
        }
    }

    public static boolean checkElementDisplayed(By locator) {
        boolean isDisplay = false;
        AndroidElement androidElement = null;
        try {
            androidElement = (AndroidElement) driver.findElement(locator);
        } catch (Exception e) {

        }
        if (null != androidElement) {
            try {
                if (null != androidElement.getLocation()) {
                    int x = androidElement.getLocation().getX();
                    int y = androidElement.getLocation().getY();
                    Dimension windowSize = driver.manage().window().getSize();
                    String deviceScreenSize = "";

                    int yMaxScreen = (int) Math.round(windowSize.getHeight());
                    int xMaxScreen = (int) Math.round(windowSize.getWidth());
                    if (driver instanceof AndroidDriver) {
                        deviceScreenSize = StringUtils.substringBetween(driver.toString(), "deviceScreenSize=",
                                ",");
                    }
                    if (null != deviceScreenSize && !deviceScreenSize.equals("")) {
                        yMaxScreen = Integer.parseInt(deviceScreenSize.split("x")[1]);
                        xMaxScreen = Integer.parseInt(deviceScreenSize.split("x")[0]);
                    }
                    if (x >= 0 && x < xMaxScreen && y >= 0 && y < yMaxScreen) {

                        isDisplay = true;
                    }
                }
            } catch (Exception e) {

            }

        }
        return isDisplay;
    }

    public void switchContextToWebView() {
        if (!driver.getContext().contains("WEBVIEW")) {
            switchToContext("WEBVIEW");
        }
    }

    public void switchContextToNative() {
        if (!driver.getContext().contains("NATIVE_APP")) {
            switchToContext("NATIVE_APP");
        }
    }

    private void switchToContext(String contextName) {
        Set<String> contextNames = driver.getContextHandles();
        int count = 0;
        for (String context : contextNames) {
            System.out.println("context=" + context);
            count++;
            if (context.contains(contextName)) {
                driver.context(context);
                break;
            }
        }
        System.out.println("Current context: " + driver.getContext());
        System.out.println("Context count: " + count);
    }

    public void back() {
        driver.navigate().back();
    }


    protected void touchAndHoldForiOS(MobileElement e) {
        Map<String, Object> args = new HashMap<>();
        args.put("element", ((MobileElement) e).getId());
        args.put("duration", 1.5);
        driver.executeScript("mobile: touchAndHold", args);
    }

    // 6 - refesh current page
    public void refreshCurrentPage() {
        driver.navigate().refresh();
    }

    public void sleepInSecond(long timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    protected static boolean isDisplayed(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected static void isVisibleAndClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void resetApp() {
        driver.resetApp();
    }

    public void wifiOff() throws InterruptedException {
        NetworkConnection mobileDriver = (NetworkConnection) driver;
        if (mobileDriver.getNetworkConnection() != NetworkConnection.ConnectionType.AIRPLANE_MODE) {
            // enabling Airplane mode
            mobileDriver.setNetworkConnection(NetworkConnection.ConnectionType.AIRPLANE_MODE);
        }
    }

    public void pushFileToDevice(String nameFile) throws Exception {
        // Push file to path of device ( emulator , simulator ,real device )
        String ANDROID_PHOTO_PATH = "/mnt/sdcard/Pictures";
        File classpathRoot = new File(System.getProperty("user.dir"));
        File assetDir = new File(classpathRoot, "../assets");
        File img = new File(assetDir.getCanonicalPath(), nameFile);
        // actually push the file
        driver.pullFile(ANDROID_PHOTO_PATH + "/" + img.getName());
    }

    public static void removeApp() {
        driver.removeApp("vn.finhay.finhay");
    }

    public void swipeScreen(Direction dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }
    public void longPress(MobileElement e) {
        TouchActions action = new TouchActions(driver);
        action.longPress(e);
        action.moveToElement(e,250,250);
        action.perform();
    }
    public void longPressToElement(MobileElement e) {
        new Actions(driver).clickAndHold(e).perform();
        sleepInSecond(3);
    }

    public void draw(MobileElement e) {
        Point centerCoordinates = e.getCenter();
        int startX = centerCoordinates.x;
        int startY = centerCoordinates.y;
        int endX = (centerCoordinates.x+5)/2;
        int endY = (centerCoordinates.y+5)/2;

        TouchAction action = new TouchAction<>(driver);
        action.longPress(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public static void swipeByElementAndDirection(MobileDriver driver , Direction direction, long duration) {
        Dimension size = driver.manage().window().getSize();

        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;

        switch (direction){
            case RIGHT:
                startY = (int) (size.height /2);
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                break;

            case LEFT:
                startY = (int) (size.height /2);
                startX = (int) (size.width * 0.05);
                endX = (int) (size.width * 0.90);
                break;

            case UP:
                endY= (int) (size.height * 0.70);
                startY  = (int) (size.height * 0.30);
                startX = (size.width / 2);
                break;


            case DOWN:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);

                break;

        }

        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

    }
    public void swipeElementAndroid(MobileElement el, Direction dir) {
        System.out.println("swipeElementAndroid(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder;
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Rectangle rect = el.getRect();
        // sometimes it is needed to configure edgeBorders
        // you can also improve borders to have vertical/horizontal
        // or left/right/up/down border variables
        edgeBorder = 0;

        switch (dir) {
            case DOWN: // from up to down
                pointOptionStart = PointOption.point(rect.x + rect.width / 2,
                        rect.y + edgeBorder);
                pointOptionEnd = PointOption.point(rect.x + rect.width / 2,
                        rect.y + rect.height - edgeBorder);
                break;
            case UP: // from down to up
                pointOptionStart = PointOption.point(rect.x + rect.width / 2,
                        rect.y + rect.height - edgeBorder);
                pointOptionEnd = PointOption.point(rect.x + rect.width / 2,
                        rect.y + edgeBorder);
                break;
            case LEFT: // from right to left
                pointOptionStart = PointOption.point(rect.x + rect.width - edgeBorder,
                        rect.y + rect.height / 2);
                pointOptionEnd = PointOption.point(rect.x + edgeBorder,
                        rect.y + rect.height / 2);
                break;
            case RIGHT: // from left to right
                pointOptionStart = PointOption.point(rect.x + edgeBorder,
                        rect.y + rect.height / 2);
                pointOptionEnd = PointOption.point(rect.x + rect.width - edgeBorder,
                        rect.y + rect.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeElementAndroid(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeElementAndroid(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {

        }
    }}

