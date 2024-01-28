package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExists {
    @Test
    public void fileExistTest(){

        //Pick a file on ur desktop
        String pathOfFlower = System.getProperty("user.home")+"/Desktop/flower.jpeg";
        System.out.println(pathOfFlower);

        //verify if that file exist on ur computer or not
        boolean isFlowerExist = Files.exists(Paths.get(pathOfFlower));//checking if the path exist
        Assertions.assertTrue(isFlowerExist);
    }
}
