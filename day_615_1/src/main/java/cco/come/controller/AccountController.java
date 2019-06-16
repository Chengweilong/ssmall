package cco.come.controller;


import cco.come.doname.Account;
import cco.come.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {


    @Autowired
    private AccountService accountService;


   @RequestMapping("/findById")
   private ModelAndView findById(){
   Account byId = accountService.findById(1);

    ModelAndView modelAndView=new ModelAndView();
    modelAndView.addObject("item",byId);
    modelAndView.setViewName("itemDetail");

    return modelAndView;

}














}
