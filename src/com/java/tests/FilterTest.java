package com.java.tests;

import com.java.coffee.Filter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 @author Jhasmany Quiroz on 7/09/19.
 */
public class FilterTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void not_contains_coffee_grounds() {
        Filter filter = new Filter();
        boolean actualResult = filter.containCoffeeGrounds();

        assertFalse("The filter contains coffee grounds", actualResult);
    }

    @Test
    public void contains_coffee_grounds() {
        Filter filter = new Filter();
        filter.setCoffeeGrounds(45);
        boolean actualResult = filter.containCoffeeGrounds();

        assertTrue("The filter doesn't contains coffee grounds", actualResult);
    }

    @Test
    public void negative_containsCoffeeGrounds_ErrorMessage() {
        int coffeeGrounds = 50;
        Filter filter = new Filter();
        filter.setCoffeeGrounds(55);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The capacity is only " + coffeeGrounds +  " coffee grounds.");
    }
}
