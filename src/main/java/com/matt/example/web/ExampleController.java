package com.matt.example.web;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value="/example")
@SessionAttributes("hello")
public class ExampleController {

   @RequestMapping(method=RequestMethod.GET)
   public String goHome(Model model) {
      Map hello = new HashMap();
      hello.put("name","Bob");
      model.addAttribute("hello",hello);
      return "home";
   }
   @RequestMapping(value="/page/{page}/{random}")
   public String go(@PathVariable("page") String page, @PathVariable("random") String random) {
      System.out.println("In go with page " + page + ", with some random text " + random);
      return page;
   }
}
