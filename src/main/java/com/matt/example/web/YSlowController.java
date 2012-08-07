package com.matt.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/beacon")
public class YSlowController {

   @RequestMapping(method=RequestMethod.GET)
   public void beaconGet() {
      System.out.println("Receiving beacon get");
   }
   @RequestMapping(method=RequestMethod.POST)
   public void beaconPost(@RequestBody String body) {
      System.out.println("Receiving beacon post");
      System.out.println("RequestBody: " + body);
   }
}
