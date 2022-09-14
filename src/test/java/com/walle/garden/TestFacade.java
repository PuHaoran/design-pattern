package com.walle.garden;

import com.walle.guide.facade.PetMaker;

public class TestFacade {
    public static void main(String[] args) {
        PetMaker petMaker = new PetMaker();
        petMaker.behaviorDog();
        petMaker.behaviorCat();
    }
}
