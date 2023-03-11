package eserciziSpring.esercizio06.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final String myComponentName;

    public MyComponent() {
        this.myComponentName = "Salvatore";
        System.out.println("\nMy component constructor has been called");
    }

    public String getMyComponentName(){
        System.out.println("\n MyComponent.getMyComponentName() has been called");
        return myComponentName;

    }

    }

