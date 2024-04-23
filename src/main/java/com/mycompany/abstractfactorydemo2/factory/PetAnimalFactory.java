package com.mycompany.abstractfactorydemo2.factory;

import com.mycompany.abstractfactorydemo2.animals.Dog;
import com.mycompany.abstractfactorydemo2.animals.Tiger;
import com.mycompany.abstractfactorydemo2.animals.WildDog;
import com.mycompany.abstractfactorydemo2.animals.WildTiger;

public class PetAnimalFactory extends AnimalFactory {

    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal.");
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }

}
