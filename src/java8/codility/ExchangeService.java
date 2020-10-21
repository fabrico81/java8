package java8.codility;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author faber
 */

public interface ExchangeService {

    Optional<BigDecimal> rate(String currency);

}
