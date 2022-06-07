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
        
        MultithreadThing myThing = new MultithreadThing(1);
        MultithreadThing myThing2 = new MultithreadThing(1);
        myThing.run();
        myThing2.run();
        
        
        System.out.println();
        System.out.println("___________________________________");
        System.out.println("Using start() method with two objects:");
        
        MultithreadThing myThing3 = new MultithreadThing(1);
        MultithreadThing myThing4 = new MultithreadThing(2);
        myThing3.start();
        myThing4.start();
        
        System.out.println();
        System.out.println();
        System.out.println("___________________________________");
        System.out.println("A interesting thing is, even on thread throws a Exception, the others threads");
        System.out.println("will keep runing.");
        System.out.println("___________________________________");
        
        for(int i=0; i<=3; i++) {
            MultithreadThing myThing5 = new MultithreadThing(i);
            myThing5.start();
        }
        
    }

}
