package org.shemenev.spring.security.configuration;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

// уже отмечена как конфигурация
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    // обязательно переопределить
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       UserBuilder userBuilder = User.withDefaultPasswordEncoder(); // дефолтное шифрование паролей

        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("Stalin")
                .password("USSR")
                .roles("Vozhd"))
        .withUser(userBuilder.username("Lenin")
                .password("Communism")
                .roles("HR"))
        .withUser(userBuilder.username("Trotskiy")
                .password("Revolution")
                .roles("MANAGER", "IT"));

    }
}
