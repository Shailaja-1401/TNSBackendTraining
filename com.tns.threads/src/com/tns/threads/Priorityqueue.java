package com.tns.threads;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(2);
        pq.offer(33);
        pq.offer(45);
        pq.offer(7);

        System.out.println("Iterating PriorityQueue (not sorted order):");
        for (int i : pq) {
            System.out.println(i);
        }

        System.out.println("\nPolling PriorityQueue (sorted order):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
