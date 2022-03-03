package Runners; 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features/"},
        glue = {"Steps"},
        //tags = {"@APISuite"}
        tags = {"@GET"}
        ///tags = {"@Post"}
       // tags = {"@put"}
        //tags = {"@Delete"}
       )
public class  TestRunner{
}
