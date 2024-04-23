package com.mycompany.abstractfactorydemo2;

import com.mycompany.abstractfactorydemo2.animals.Dog;
import com.mycompany.abstractfactorydemo2.animals.Tiger;
import com.mycompany.abstractfactorydemo2.factory.AnimalFactory;

public class AbstractFactoryDemo2 {

    public static void main(String[] args) {
        System.out.println("An Abstract Method demo 2.");

        System.out.println("");

        AnimalFactory factory;
        factory = FactoryProvider.createFactory("wild");
        Dog wildDog = factory.createDog("orange");
        wildDog.displayMe();
        
        System.out.println("");
        
        Tiger wildTiger = factory.createTiger("yellow");
        wildTiger.aboutMe();
        wildTiger.inviteDog(wildDog);
        
        System.out.println("\n************\n");
        
        factory = FactoryProvider.createFactory("pet");
        Dog petDog = factory.createDog("brown");
        petDog.displayMe();
        
        System.out.println("");
        
        Tiger petTiger = factory.createTiger("yellow");
        petTiger.aboutMe();
        petTiger.inviteDog(petDog);
    }
}
