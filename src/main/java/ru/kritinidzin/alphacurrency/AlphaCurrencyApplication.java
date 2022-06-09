package ru.kritinidzin.alphacurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
@EnableFeignClients
public class AlphaCurrencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlphaCurrencyApplication.class, args);
    }

}
