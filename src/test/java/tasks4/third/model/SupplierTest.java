package tasks4.third.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplierTest {

    @Test
    void costOfVolume() {
        Supplier supplier = new Supplier(360, 6.1);
        supplier.costOfVolume(200);
        assertEquals(160, supplier.getCurrentVolume());
        supplier.costOfVolume(100);
        assertEquals(60, supplier.getCurrentVolume());
    }

    @Test
    void gasSold() {
        Supplier supplier = new Supplier(360, 6.1);
        supplier.costOfVolume(200);
        assertEquals(200, supplier.gasSold());
        supplier.costOfVolume(100);
        assertEquals(300, supplier.gasSold());
    }
}