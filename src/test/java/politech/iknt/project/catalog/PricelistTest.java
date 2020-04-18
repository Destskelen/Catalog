package politech.iknt.project.catalog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PricelistTest {

    @Test
    void findName() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Lemon", 1, 15.5);
        priceList.addProduct(product);
        assertEquals(1, priceList.findName("Lemon"));
        assertEquals(-1,priceList.findName("Tomat"));
    }

    @Test
    void testadd() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Lemon", 1, 15.5);
        Product product2 = new Product("Lemon", 2, 30);
        Product product3 = new Product("Tomat", 1, 20.0);
        assertTrue(priceList.addProduct(product));
        assertFalse(priceList.addProduct(product2));
        assertFalse(priceList.addProduct(product3));
    }

    @Test
    void setName() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Lemon", 1, 15.5);
        priceList.addProduct(product);
        priceList.setName(1, "Lime");
        priceList.setName(2, "Tomat");
        assertEquals("Lime", priceList.getName(1));
        assertEquals("n/a", priceList.getName(2));
    }

    @Test
    void setPrice() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Lemon", 1, 15.5);
        priceList.addProduct(product);
        priceList.setPrice(1, 100.0);
        priceList.setPrice(2, 200.0);
        assertEquals(100, priceList.getPrice(1));
        assertEquals(-1, priceList.getPrice(100));
    }

    @Test
    void removeId() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Lemon", 1, 15.5);
        priceList.addProduct(product);
        assertEquals(1, priceList.removeId(1));
        assertEquals(-1, priceList.removeId(300));
    }

    @Test
    void amount() {
        Pricelist priceList = new Pricelist();
        Product product = new Product("Lemon", 1, 15.5);
        priceList.addProduct(product);
        assertEquals(31, priceList.amount(1, 2));
        assertEquals(-1, priceList.amount(2, 2));
        assertEquals(-1, priceList.amount(1, -2));
    }
}