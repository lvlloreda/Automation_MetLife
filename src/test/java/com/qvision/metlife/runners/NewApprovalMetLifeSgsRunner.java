package com.qvision.metlife.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/qvision/metlife/features/NewApprovalSgs.feature", glue = "com.qvision.metlife.stepsdefinitions", snippets = SnippetType.CAMELCASE)

public class NewApprovalMetLifeSgsRunner {

}
