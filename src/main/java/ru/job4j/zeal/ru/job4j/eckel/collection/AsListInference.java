package ru.job4j.zeal.ru.job4j.eckel.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInference {
    public static void main(String[] args) {
        /**
         * snow1.add(new Heavy) -> Exception
         */
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder()
        );
        for (Snow snow : snow1) {
            System.out.print(snow + ", ");
        }
        System.out.println();

        /**
         * snow2.add(new Slush) -> Exception
         * snow2.add(new Crusty()) Exception
         */
        List<Snow> snow2 = Arrays.asList(
                new Light(), new Heavy()
        );

        for (Snow snow : snow2) {
            System.out.print(snow + ", ");
        }
        System.out.println();

        List<Snow> snow3 = new ArrayList<>();
        Collections.addAll(snow3, new Light(), new Heavy(), new Powder());
        for (Snow snow : snow3) {
            System.out.print(snow + ", ");
        }
        System.out.println();

        List<Snow> snow4 = new ArrayList<>();
        Collections.addAll(snow4, new Light(), new Heavy(), new Powder(), new Slush());
        for (Snow snow : snow4) {
            System.out.print(snow + ", ");
        }
        System.out.println();

        List<Snow> snow5 = Arrays.<Snow>asList(
                new Light(), new Heavy(), new Powder()
        );
        /**
         *   snow5.remove(1) or snow5.add(new Crusty()) Exception
         */
        for (Snow snow : snow5) {
            System.out.print(snow + ", ");
        }
        System.out.println();
    }
}
