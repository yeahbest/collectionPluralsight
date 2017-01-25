package SET4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.monotonic.collections.Product;
import com.monotonic.collections.Supplier;

/**
 * Created by Pawl on 1/18/2017.
 */
public class ProcuctCatalogue implements Iterable<Product>{

    final Set<Product> product = new HashSet<Product>();

    public void isSuppliedy(Supplier supply){

        product.addAll(supply.getProducts());

    }

    @Override
    public Iterator iterator() {
        return product.iterator();
    }
}
