package com.dimonandpumba.calculator;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

 class Storage {

    private static final String MEMORY = "src/main/resources/memory.dat";
    private Queue queue;

    Storage() {
         this.queue = new LinkedList();
    }

    void readStorage() {
        if (new File(MEMORY).exists()) {
            try {
                 ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(MEMORY));
                 queue = (Queue) objectInputStream.readObject();
                 objectInputStream.close();
                 System.out.println("Last results: " + queue);
            } catch (Exception e) {
                 e.printStackTrace();
                 System.out.println("input exception");
            }
        }
    }

    <T> void writeStorage(T value) {
         queue.add(value);
         if(queue.size()>5){
            queue.poll();
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(MEMORY));
            objectOutputStream.writeObject(queue);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("output");
        }
    }
}
