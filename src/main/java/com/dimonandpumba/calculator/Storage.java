package com.dimonandpumba.calculator;

import java.io.*;
import java.util.Queue;

 class Storage {

    private static final String MEMORY = "src/main/resources/memory.dat";
    private Queue queue;

      Queue getQueue() {
         return readStorage(queue);
     }

      void setQueue(Queue queue) {
         this.queue = queue;
     }

     <T> void writeStorage(T value) {
         queue.add(value);
         if(queue.size()>5){
            queue.poll();
        }

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(MEMORY));
            objectOutputStream.writeObject(queue);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("output");
        }
    }

    private Queue readStorage(Queue queue) {
        if (new File(MEMORY).exists()) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(MEMORY));
                queue = (Queue) objectInputStream.readObject();
                System.out.println("Last results: " + queue);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("input exception");
            }
        }
        return queue;
    }
}
