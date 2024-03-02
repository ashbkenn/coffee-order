package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepositoryTest {
    private OrderRepository orderRepository;
    private static final float DELTA = 0.01F;

    @BeforeEach
    public void setUp() {
        orderRepository = new OrderRepository();
    }

    @Test
    public void addDarkRoastWithMilk() throws Exception {
        OrderData order = new OrderData("Dark Roast", List.of("Milk"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Dark Roast, Milk", receipt.description());
        assertEquals(2.39F, receipt.cost(), DELTA);
    }

    @Test
    public void addDarkRoastWithSoy() throws Exception {
        OrderData order = new OrderData("Dark Roast", List.of("Soy"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Dark Roast, Soy", receipt.description());
        assertEquals(2.26F, receipt.cost(), DELTA);
    }

    @Test
    public void addDarkRoastWithMocha() throws Exception {
        OrderData order = new OrderData("Dark Roast", List.of("Mocha"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Dark Roast, Mocha", receipt.description());
        assertEquals(2.29F, receipt.cost(), DELTA);
    }

    @Test
    public void addDarkRoastWithWhip() throws Exception {
        OrderData order = new OrderData("Dark Roast", List.of("Whip"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Dark Roast, Whip", receipt.description());
        assertEquals(2.24F, receipt.cost(), DELTA);
    }

    @Test
    public void addHouseBlendWithMilk() throws Exception {
        OrderData order = new OrderData("House Blend", List.of("Milk"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("House Blend, Milk", receipt.description());
        assertEquals(2.05F, receipt.cost(), DELTA);
    }

    @Test
    public void addHouseBlendWithSoy() throws Exception {
        OrderData order = new OrderData("House Blend", List.of("Soy"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("House Blend, Soy", receipt.description());
        assertEquals(1.92F, receipt.cost(), DELTA);
    }

    @Test
    public void addHouseBlendWithMocha() throws Exception {
        OrderData order = new OrderData("House Blend", List.of("Mocha"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("House Blend, Mocha", receipt.description());
        assertEquals(1.95F, receipt.cost(), DELTA);
    }

    @Test
    public void addHouseBlendWithWhip() throws Exception {
        OrderData order = new OrderData("House Blend", List.of("Whip"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("House Blend, Whip", receipt.description());
        assertEquals(1.90F, receipt.cost(), DELTA);
    }

    @Test
    public void addEspressoWithMilk() throws Exception {
        OrderData order = new OrderData("Espresso", List.of("Milk"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Espresso, Milk", receipt.description());
        assertEquals(1.74F, receipt.cost(), DELTA);
    }

    @Test
    public void addEspressoWithSoy() throws Exception {
        OrderData order = new OrderData("Espresso", List.of("Soy"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Espresso, Soy", receipt.description());
        assertEquals(1.61F, receipt.cost(), DELTA);
    }

    @Test
    public void addEspressoWithMocha() throws Exception {
        OrderData order = new OrderData("Espresso", List.of("Mocha"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Espresso, Mocha", receipt.description());
        assertEquals(1.64F, receipt.cost(), DELTA);
    }

    @Test
    public void addEspressoWithWhip() throws Exception {
        OrderData order = new OrderData("Espresso", List.of("Whip"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Espresso, Whip", receipt.description());
        assertEquals(1.59F, receipt.cost(), DELTA);
    }

    @Test
    public void addDecafWithMilk() throws Exception {
        OrderData order = new OrderData("Decaf", List.of("Milk"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Decaf, Milk", receipt.description());
        assertEquals(1.68F, receipt.cost(), DELTA);
    }

    @Test
    public void addDecafWithSoy() throws Exception {
        OrderData order = new OrderData("Decaf", List.of("Soy"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Decaf, Soy", receipt.description());
        assertEquals(1.55F, receipt.cost(), DELTA);
    }

    @Test
    public void addDecafWithMocha() throws Exception {
        OrderData order = new OrderData("Decaf", List.of("Mocha"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Decaf, Mocha", receipt.description());
        assertEquals(1.58F, receipt.cost(), DELTA);
    }

    @Test
    public void addDecafWithWhip() throws Exception {
        OrderData order = new OrderData("Decaf", List.of("Whip"));
        Receipt receipt = orderRepository.add(order);
        assertEquals("Decaf, Whip", receipt.description());
        assertEquals(1.53F, receipt.cost(), DELTA);
    }
}