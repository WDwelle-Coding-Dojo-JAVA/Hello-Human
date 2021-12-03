package com.wdwelle.human;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HomeHuman {
	@RequestMapping("/")
    public String index(@RequestParam(value="fname",defaultValue="Human", required=false) String fname, @RequestParam(value="lname",defaultValue="", required=false) String lname, @RequestParam(value="times",defaultValue="1", required=false) int num) {
        return (("Hello: " + fname+" "+ lname).repeat(num));
    }
}
