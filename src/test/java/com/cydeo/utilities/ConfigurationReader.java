package com.cydeo.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// In this class, we will be creating the re-usable to read from configuration. properties file
public class ConfigurationReader {

    //1- Create the properties object (create object)

    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.
    private static Properties properties = new Properties();


    static {

        try {
            //2- open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("Configuration.properties");
            //3- Load the "properties" object with "file" (load properties)
            properties.load(file);

            //4- Close the file (close file)
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!");
            e.printStackTrace();

        }

    }
//Create a utility method to use the object to read
//4- Use the "properties" object to read value from the file (read properties)

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }




}
