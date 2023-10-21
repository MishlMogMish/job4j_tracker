package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.*;

class Pet implements Comparable<Pet> {
    public int id() {
        return 14;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public int compareTo(Pet o) {
        return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }
}

class Rat extends Pet {
}

class Manx extends Pet {
}

class Cymric extends Pet {
    @Override
    public int id() {
        return 5;
    }
}

class Mutt extends Pet {
    @Override
    public int id() {
        return 14;
    }
}

class Pug extends Pet {
}

class Mouse extends Pet {
}

class Hamster extends Pet {
}

public class ListFeatures {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        Random rand = new Random(47);
        Collections.addAll(pets, new Rat(),
                new Manx(), new Cymric(),
                new Mutt(), new Pug(),
                new Cymric(), new Pug());
        System.out.println("1: " + pets);
        Hamster h = new Hamster();
        pets.add(h);
        System.out.println("2: " + pets);
        System.out.println("2: " + pets.contains(h));
        pets.remove(h);
        Pet p = pets.get(2);
        System.out.println("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));
        System.out.println("7: " + pets.remove(p));
        System.out.println("8: " + pets);
        pets.add(3, new Mouse());
        System.out.println("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("Sublist " + sub);
        System.out.println("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("Pets after sort: " + pets);
        System.out.println("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("pets after subList shuffle: " + pets);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(pets);
        System.out.println("before remove: " + copy);

        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, new Mouse());
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + pets.isEmpty());
        pets.clear();
        System.out.println("19: " + pets);
        System.out.println("20: " + pets.isEmpty());
        pets.add(new Rat());
        pets.add(new Manx());
        pets.add(new Cymric());
        pets.add(new Mutt());
        System.out.println("21: " + pets);
        Object[] o = pets.toArray();
        System.out.println("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println("23: " + pa[3].id());
    }
}
