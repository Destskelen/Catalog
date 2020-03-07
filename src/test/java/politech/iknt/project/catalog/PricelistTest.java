package politech.iknt.project.catalog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PricelistTest {

    @Test
    void setName() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Limon", 1, 15.5);
        priceList.add(product);
        priceList.setName(1, "Lime");
        priceList.setName(2, "Tomat");
        assertEquals("Lime", priceList.getName(1));
        assertEquals("n/a", priceList.getName(2));
    }

    @Test
    void setPrice() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Limon", 1, 15.5);
        priceList.add(product);
        priceList.setPrice(1, 100.0);
        priceList.setPrice(2, 200.0);
        assertEquals(100, priceList.getPrice(1));
        assertEquals(-1, priceList.getPrice(100));
    }

    @Test
    void removeId() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Limon", 1, 15.5);
        priceList.add(product);
        assertEquals(1, priceList.removeId(1));
        assertEquals(-1, priceList.removeId(300));
    }

    @Test
    void amount() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Limon", 1, 15.5);
        priceList.add(product);
        assertEquals(31, priceList.amount(1, 2));
        assertEquals(-1, priceList.amount(2, 2));
        assertEquals(-1, priceList.amount(1, -2));
    }
}