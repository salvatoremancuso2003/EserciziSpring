package eserciziSpring.esercizio04.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/hostHeaders")
    public String getHeaders(@RequestHeader("host") String hostHeaders){
        String[] hostParts = hostHeaders.split(":");
        String hostName = hostParts[0];
        String hostPort = hostParts[1];
        return "Host Name = " + hostName + " \nHost Port = " + hostPort;
    }


}
