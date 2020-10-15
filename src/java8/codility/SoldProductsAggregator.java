package java8.codility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author faber
 */

public class SoldProductsAggregator {


    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {

        SoldProductsAggregate soldProdAggregate = new SoldProductsAggregate();
        List <SimpleSoldProduct> simpleSoldProduct = new ArrayList<>();

        List<SoldProduct> soldProducts = products.collect(Collectors.toList());

        List<SoldProduct> soldProductList = products
                .filter(soldProduct -> soldProduct.getPrice().compareTo(BigDecimal.ZERO) > 0)
                .peek(soldProduct -> exchangeService.rate(soldProduct.getCurrency())).collect(Collectors.toList());

        soldProductList.forEach(soldProduct -> {
            SimpleSoldProduct simpleProduct = new SimpleSoldProduct();
            simpleProduct.setPrice(soldProduct.getPrice());
            simpleProduct.setName(soldProduct.getName());
            simpleSoldProduct.add(simpleProduct);
        } );
        soldProdAggregate.setProducts(simpleSoldProduct);
        soldProdAggregate.setTotal(simpleSoldProduct.stream().map(value -> value.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add));

        return null;
    }
}
