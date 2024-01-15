package by.itacademy.kishkevich.domain;

import com.github.javafaker.Faker;

public class User {

    public static String getRandomEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }
    public static String getRandomPassword(){
        Faker faker = new Faker();
        return faker.internet().password();
    }
}
