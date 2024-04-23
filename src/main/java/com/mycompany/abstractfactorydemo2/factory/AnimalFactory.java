package com.mycompany.abstractfactorydemo2.factory;

import com.mycompany.abstractfactorydemo2.animals.Dog;
import com.mycompany.abstractfactorydemo2.animals.Tiger;

public abstract class AnimalFactory {
    public abstract Tiger createTiger(String color);
    public abstract Dog createDog(String color);
}
