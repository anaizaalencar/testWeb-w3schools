package cucumber.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@HTMLForms",
        glue = "cucumber.test.steps", monochrome = true)

public class FormsTest {
}
