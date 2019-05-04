package com.dimonandpumba.calculator;

import java.io.*;
import java.util.Queue;

import java.util.LinkedList;

public class Storage {
    public Storage(double value) {
        Queue queue = new LinkedList();
        if (new File("memory.dat").exists()) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
                queue = (Queue) objectInputStream.readObject();
                System.out.println(queue.toString());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("input exception");
            }
        }

        queue.add(value);
        if(queue.size()>5){
            queue.poll();
        }

        for (Object object : queue ){
            System.out.println("Value : "+object);
        }

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            objectOutputStream.writeObject(queue);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("output");
        }

    }
}
