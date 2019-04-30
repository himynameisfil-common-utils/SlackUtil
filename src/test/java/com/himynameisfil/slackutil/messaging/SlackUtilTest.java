package com.himynameisfil.slackutil.messaging;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

public class SlackUtilTest {
    private SlackUtil slackUtil;

    @Before
    public void setup() {
        slackUtil   =   new SlackUtil("src/test/resources/HistoricalOptionsIngestorSlack.properties");
    }


    @Test
    public void loadPropertiesHappy() throws IOException {
        Assert.assertEquals("testWebhookUrl", slackUtil.webhookUrl);
        Assert.assertEquals("testChannel", slackUtil.channel);
        Assert.assertEquals("testName", slackUtil.name);
    }

}