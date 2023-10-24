package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.AbstractCollection;
import java.util.*;

public class CollectionSequence extends AbstractCollection<Pet> {
    private List<Pet> petList = PetCreator.create(8);
    private Pet[] pets = petList.toArray(new Pet[8]);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
        System.out.println(c.iterator());

    }

}
