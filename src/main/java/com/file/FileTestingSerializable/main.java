package com.file.FileTestingSerializable;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.lifeLevel = 55;

        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;


        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream= new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.sword);












        }
    }
