//package com.multithreading;
//
//public class ConsumerProducerExample {
//    public static void main(String[] args) {
//
//    }
//
//    private class Producer {
//        Producer() {
//            synchronized (q) {
//                q.notify();
//            }
//        }
//    }
//
//    private class Consumer {
//        Consumer() {
//            synchronized (q) {
//            if(q.isEmpty)q.wait();
//            else{
//                consume it;
//            }
//            }
//        }
//    }
//}
