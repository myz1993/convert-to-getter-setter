package com.github.hcsp.encapsulation2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void hasGettersAndSetters() {
        String name = UUID.randomUUID().toString();
        int age = new Random().nextInt(10);
        com.github.hcsp.encapsulation.Cat cat = new com.github.hcsp.encapsulation.Cat();

        cat.setName(name);
        cat.setAge(age);
        cat.setCute(true);

        Assertions.assertEquals(name, cat.getName());
        Assertions.assertEquals(age, cat.getAge());
        Assertions.assertTrue(cat.isCute());
    }

    @Test
    public void allFieldsArePrivate() {
        Assertions.assertTrue(
                Stream.of(com.github.hcsp.encapsulation.Cat.class.getDeclaredFields())
                      .map(Field::getModifiers)
                      .allMatch(Modifier::isPrivate));
    }
}
