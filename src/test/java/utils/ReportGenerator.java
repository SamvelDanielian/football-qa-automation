package utils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;

public class ReportGenerator {

    public static void generateReport() {
        File reportOutputDirectory = new File("target/html-report");
        File jsonFile = new File("target/cucumber-report.json");

        Configuration config = new Configuration(reportOutputDirectory, "Football QA Automation");
        config.setBuildNumber("1.0");
        config.addClassifications("Platform", "Windows");
        config.addClassifications("Browser", "Chrome");
        config.addClassifications("Tester", "Sam");

        ReportBuilder reportBuilder =
                new ReportBuilder(Collections.singletonList(jsonFile.getAbsolutePath()), config);

        reportBuilder.generateReports();
    }
}