package jp.coppermine.ping;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean {

    public String getMessage() {
        return "Hello, world";
    }
    
}
