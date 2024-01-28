package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class JavaFaker {

    @Test
    public void fakerTest(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        System.out.println(firstName);

        //      last name
                System.out.println(faker.name().lastName());

        //      title
                System.out.println(faker.name().title());

        //      city
                System.out.println(faker.address().city());

        //      state
                System.out.println(faker.address().state());

        //      address
                System.out.println(faker.address().fullAddress());

        //      zip code
                System.out.println(faker.address().zipCode());

        //      phone number
                System.out.println(faker.phoneNumber().cellPhone());

        //      email
                System.out.println(faker.internet().emailAddress());

        //      random digit number
                System.out.println(faker.number().digits(10));

        //      random number in between
                System.out.println(faker.number().numberBetween(100000,200000));
    }
}