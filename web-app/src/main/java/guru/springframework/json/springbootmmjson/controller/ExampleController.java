package guru.springframework.json.springbootmmjson.controller;

import guru.springframework.json.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Donald F. Coffin on 2019-01-02 at 14:46
 **/
@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress(){

        return new ShippingAddress();
    }
}
