package interfacess;

import java.math.BigDecimal;

public interface IProtifable {

    //fields
    BigDecimal INCOME_PER_AUDIENCE=BigDecimal.ZERO;


    //methods
    void earn(int noOfAudience);
    BigDecimal calculateProfit();

}
