package com.wdwelle.human;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HomeHuman {
	@RequestMapping("/")
    public String index(@RequestParam(value="fname",defaultValue="Human", required=false) String fname, @RequestParam(value="lname",defaultValue="", required=false) String lname) {
        return ("Hello: " + fname+" "+ lname);
    }
}
