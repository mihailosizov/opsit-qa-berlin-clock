package com.ubs.opsit.interviews;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.junit.Test;

import static com.ubs.opsit.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  You need to
 * edit this class to complete the exercise.
 */
public class BerlinClockScenario {

    private String timeValue;
    private String result;

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    @Given("time is $timeValue")
    public void givenTimeValue(String timeValue) {
        this.timeValue = timeValue;
    }

    @When("I convert time with berlin-clock converter")
    public void convertTime() {
        TimeConverter timeConverter = new TimeConverter();
        result = timeConverter.convertTime(timeValue);
    }

    @Then("clock should look like: $result")
    public void resultAssert(String result) {
        Assert.assertTrue(this.result.equals(result));
    }
}
