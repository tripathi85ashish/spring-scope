package com.scope.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      
      AccountService service1=context.getBean("accountService",AccountService.class);
      service1.setAccountHolder("abhishek");
      System.out.println(service1.getAccountHolder());
      
      AccountService service2=context.getBean("accountService",AccountService.class);
      System.out.println(service2.getAccountHolder());
      
      UserService userService1=context.getBean(UserService.class);
      userService1.setUserName("user.com");
      System.out.println(userService1.getUserName());
      
      UserService userService2=context.getBean(UserService.class);
      System.out.println(userService2.getUserName());
      context.close();
   }
}
