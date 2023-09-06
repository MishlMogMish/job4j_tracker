package ru.job4j.pojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ShopTest {

    @Test
    void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        int expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenHasNoNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Chips", 9);
        products[4] = new Product("Icecream", 23);
        int rsl = Shop.indexOfNull(products);
        int expected = -1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenHasNullAtIndex3() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[4] = new Product("Icecream", 23);
        int rsl = Shop.indexOfNull(products);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }
}
