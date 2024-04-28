/* CodingNomads (C)2024 */
package com.codingnomads.springweb.resttemplate.GET.getForObject;

import com.codingnomads.springweb.resttemplate.GET.models.Excuse;
import com.codingnomads.springweb.resttemplate.GET.models.QuoteTemplate;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GetForObjectDemo {

    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(GetForObjectDemo.class, args);
    }

    @Bean
    public CommandLineRunner run() throws Exception {
        return args -> {
            Excuse[] excuse;
            excuse = restTemplate.getForObject("https://excuser-three.vercel.app/v1/excuse/office", Excuse[].class);
            System.out.println(Arrays.toString(excuse));

            // submit more requests here

            //        CodingNomadsTasksApiResponse response =
            //                restTemplate.getForObject("http://demo.codingnomads.co:8080/tasks_api/users/5",
            //                        CodingNomadsTasksApiResponse.class);
            //
            //        System.out.println(response.toString());

        };
    }
}
