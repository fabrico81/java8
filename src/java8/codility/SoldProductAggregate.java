package java8.codility;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author faber
 */

class SoldProductsAggregate {
    private List<SimpleSoldProduct> products;
    private BigDecimal total;

    public List<SimpleSoldProduct> getProducts() {
        return products;
    }

    public void setProducts(List<SimpleSoldProduct> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
