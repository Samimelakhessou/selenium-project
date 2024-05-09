package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void javaFakerPractice() {

        //Create Java Faker Object
        Faker faker = new Faker();

        //Print out a random first name using faker object
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        //Print out a random last name using faker object
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //Print out a random full name using faker object
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //print out a city
        System.out.println("faker.address().city() = " + faker.address().city());

        //print out a zip code
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        //numerify() method is used to generate digits with specific formatting
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("415-###-####"));

        System.out.println("faker.numerify(\"####_####_####_####\") = " + faker.numerify("####_####_####_####"));

        //Letterify() method is used to generate Random letter with specific formatting
        System.out.println("faker.letterify(\"????????_??????_???????\") = " + faker.letterify("????????_??????_???????"));

        //numerify() method is used to generate both letters and digits randomly
        System.out.println("faker.bothify(\"?#?#?#_#?#?#?+#?#?#?\") = " + faker.bothify("?#?#?#_#?#?#?+#?#?#?"));

        //chuckNorr() method is used to create chucknorris facts
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.muhtar().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris","Muhtar"));


    }
}
