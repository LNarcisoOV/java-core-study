package thread;

public class MultithreadMain {
    
    public static void main(String... a) {
        System.out.println("___________________________________");
        System.out.println("MULTITHREADING");
        System.out.println("To use multithreading, your class has to extends Thread class ");
        System.out.println("and override the method run(), also you have to call the method start() ");
        System.out.println("because run() isn't multithreading.");
        System.out.println("___________________________________");
        
        System.out.println();
        System.out.println("Using run() method with two objects:");
        
        MultithreadThing myThing = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();
        myThing.run();
        myThing2.run();
        
        
        System.out.println();
        System.out.println("Using start() method with two objects:");
        
        myThing.start();
        myThing2.start();
        
        
        
    }

}
