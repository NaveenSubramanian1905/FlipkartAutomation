/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        
        System.setProperty("java.util.logging.config.file", "logging.properties");
        
        TestCases tests = new TestCases();

        tests.testCase01();

        tests.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
