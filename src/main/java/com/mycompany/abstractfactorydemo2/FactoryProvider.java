package com.mycompany.abstractfactorydemo2;

import com.mycompany.abstractfactorydemo2.factory.AnimalFactory;
import com.mycompany.abstractfactorydemo2.factory.PetAnimalFactory;
import com.mycompany.abstractfactorydemo2.factory.WildAnimalFactory;

public class FactoryProvider {
    public static AnimalFactory createFactory(String type){
        if (type.equalsIgnoreCase("wild")){
            return new WildAnimalFactory();
        } else if (type.equalsIgnoreCase("pet")){
            return new PetAnimalFactory();
        } else {
            System.out.println("You can opt for either wild or pet factories");
            throw new IllegalArgumentException("You need to pass " + 
                    "either wild or pet as argyment.");
        }
    }
}
