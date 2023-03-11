package eserciziSpring.esercizio06.services;

import eserciziSpring.esercizio06.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("My service constructor has been called");
    }
    public String getName(){
        System.out.println(" myService.getName() has been called ");
       return myComponent.getMyComponentName();
    }
}
