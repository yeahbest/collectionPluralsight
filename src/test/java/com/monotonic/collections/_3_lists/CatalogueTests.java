package com.monotonic.collections._3_lists;

import org.junit.Test;
import SET4.ProcuctCatalogue;

import static com.monotonic.collections._3_lists.ProductFixtures.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Created by Pawl on 1/18/2017.
 */
public class CatalogueTests {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception{

        ProcuctCatalogue catalogue = new ProcuctCatalogue();
        catalogue.isSuppliedy(bobs);
        catalogue.isSuppliedy(kebs);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));


    }
}
