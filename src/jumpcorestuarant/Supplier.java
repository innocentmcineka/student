/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpcorestuarant;

import java.util.Objects;
import java.util.function.BiPredicate;
import static jumpcorestuarant.Supplier.Consumer.bi;

/**
 *
 * @author Innocent Mcineka1
 */
public class Supplier {
    // This function returns a random value.
    /**
     *
     * @param <T>
     */
    @FunctionalInterface
public interface Consumer<T> {
      // BiPredicate
    BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
    BiPredicate<Integer, Integer> eq = (x, y) -> x -2 > y;
        
     // Consumer Method in functional class    
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
    
    }
    

    
    
    
    
    
}
