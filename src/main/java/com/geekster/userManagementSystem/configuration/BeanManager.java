package com.geekster.userManagementSystem.configuration;


import com.geekster.userManagementSystem.model.Type;
import com.geekster.userManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanManager {

    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(0,"Bitzz","9898989898","At post Solapur");
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
