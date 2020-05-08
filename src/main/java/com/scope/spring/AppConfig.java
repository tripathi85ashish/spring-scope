package com.scope.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "com.scope.spring")
public class AppConfig {
   @Bean("accountService")
   @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
   public AccountService getAccountService() {
      return new AccountService();
   }
}
