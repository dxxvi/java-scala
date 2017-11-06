package home.example.hk2;

import home.example.hk2.service.MyService;
import home.example.hk2.service.MyServiceImpl;
import home.example.hk2.service.MySubServiceImpl;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.api.ServiceLocatorFactory;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.junit.Assert;
import org.junit.Test;

public class HK2Example {
    @Test public void testHK2DependencyInjection() {
        ServiceLocator serviceLocator = ServiceLocatorFactory.getInstance().create(null);
        ServiceLocatorUtilities.addClasses(serviceLocator,
                MyServiceImpl.class, MySubServiceImpl.class);
        MyService service = serviceLocator.getService(MyService.class);
        Assert.assertTrue("The minimum of 5, 3, 8 must be 3.", service.min(5, 3, 8) == 3);
    }
}
