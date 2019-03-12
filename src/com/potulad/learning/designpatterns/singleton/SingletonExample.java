package com.potulad.learning.designpatterns.singleton;

/**
 * A singleton class that has the following assumptions :
 * <ul>
 *     <li> We are creating a singleton that is very expensive and we want to delay it's creation until it is really
 *     needed </li>
 *     <li> We are operating under a high TPS multithreaded system that accesses the singleton multiple times and hence the getters
 *     must be very effecient. </li>
 * </ul>
 */
public class SingletonExample {

    /**
     * Volatile to allow to
     */
    private static volatile SingletonExample uniqueInstance;

    /**
     * Prevent object creation from outside this class.
     */
    private SingletonExample() { }

    /**
     * Get the unique instance of the Singleton. This method leverages double-checked locking to make sure
     * that only instance is created among multiple threads.
     */
    public static SingletonExample getUniqueInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonExample.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonExample();
                }
            }
        }

        return uniqueInstance;
    }
}
