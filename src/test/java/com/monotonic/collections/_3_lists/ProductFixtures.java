package com.monotonic.collections._3_lists;

import com.monotonic.collections.Product;
import com.monotonic.collections.Supplier;

public class ProductFixtures
{
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static Supplier bobs = new Supplier("Bob's supplies");
    public static Supplier kebs = new Supplier("Keb's supplies");


    static {

        bobs.getProducts().add(door);
        bobs.getProducts().add(floorPanel);
        bobs.getProducts().add(window);

        kebs.getProducts().add(floorPanel);
       // kebs.getProducts().add(door);
        kebs.getProducts().add(new Product("Wooden Door",35));
    }



}
