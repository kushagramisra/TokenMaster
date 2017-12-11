package com.tokenmaster.pojo;

import com.sun.media.sound.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;
import tokenmaster.pojo.ServiceProvider;

/**
 * Created by kushagra on 12/7/2017.
 */
public class ServiceProviderTest {
    ServiceProvider serviceConsumer = new ServiceProvider();

    @Test
    public void testNameSetter() {
        serviceConsumer.setName("test");
        Assert.assertEquals(serviceConsumer.getName(), "test");
    }

    @Test
    public void testEmailSetter() throws InvalidFormatException {
        serviceConsumer.setEmail("kush@xyz.com");
        Assert.assertEquals(serviceConsumer.getEmail(), "kush@xyz.com");
    }

    @Test(expected = InvalidFormatException.class)
    public void testInvalidEmailSetter() throws InvalidFormatException {
        serviceConsumer.setEmail("kush@xyzcom");

    }

    public void testContactSetter() {
        serviceConsumer.setImageLocation("testpath");
        Assert.assertEquals(serviceConsumer.getImageLocation(), "testpath");
    }
}
