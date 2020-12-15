package testSuites;

import org.testng.annotations.Test;

public class Potok2 {

        @Test
        public void groupTestOne() {
            long id = Thread.currentThread().getId();
            System.out.println("Simple test-method One. Thread is:" + id);
        }

        @Test
        public void groupTestTwo() {
            long id = Thread.currentThread().getId();
            System.out.println("Simple test-method two. Thread is:" + id);
        }

        @Test
        public void groupTestThree() {
            long id = Thread.currentThread().getId();
            System.out.println("Simple test-method three. Thread is:" + id);
        }


    }

