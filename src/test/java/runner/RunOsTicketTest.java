package runner;

//import io.cucumber.junit.CucumberOptions;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.SNIPPET_TYPE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/osticket/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "junit")
@ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "camelcase")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@home-page")
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.osticket.step.definitions,common,hooks")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@home-page")
public class RunOsTicketTest {
}
