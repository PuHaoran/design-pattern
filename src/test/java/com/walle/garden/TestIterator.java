package com.walle.garden;

import com.walle.guide.iterator.Iterator;
import com.walle.guide.iterator.PetRepository;

/**
 * @author 123
 * @create 2022/9/21 22:23
 */
public class TestIterator {
    public static void main(String[] args) {
        PetRepository petRepository = new PetRepository();
        for(Iterator iter = petRepository.getIterator(); iter.hasNext();) {
            String pet= (String) iter.next();
            System.out.println("pet: " + pet);
        }
    }
}
