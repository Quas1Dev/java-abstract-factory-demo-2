package com.mycompany.abstractfactorydemo2.factory;

import com.mycompany.abstractfactorydemo2.animals.Dog;
import com.mycompany.abstractfactorydemo2.animals.PetDog;
import com.mycompany.abstractfactorydemo2.animals.PetTiger;
import com.mycompany.abstractfactorydemo2.animals.Tiger;

public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("You opt for an wild animal factory!");
    }

    @Override
    public Tiger createTiger(String color) {
        return new PetTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new PetDog(color);
    }
}
