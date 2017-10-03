package com.example.osgiproject.package01.internal;

/**
 * Created by dewni on 10/1/17.
 */
import com.example.osgiproject.package01.HelloService;
import com.example.osgiproject.package01.HelloServiceImpl;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(name = "com.example.osgiproject.package01.internal.HelloServiceComponent",
        immediate = true)
public class HelloServiceComponent {

    @Activate
    protected void activate(BundleContext bundleContext) {

        bundleContext.registerService(HelloService.class, new HelloServiceImpl(), null);
    }

}
