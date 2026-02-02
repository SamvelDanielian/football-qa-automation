package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import utils.ReportGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Hooks {

    @After
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            WebDriver webDriver = DriverFactory.getDriver();

            TakesScreenshot ts = (TakesScreenshot) webDriver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());

            File targetFile = new File(
                    "target/screenshots/" + scenario.getName().replace(" ", "_") + ".png");

            try {
                Files.createDirectories(targetFile.getParentFile().toPath());
                Files.write(targetFile.toPath(), screenshot);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void generateHtmlReport() {
        ReportGenerator.generateReport();
    }
}