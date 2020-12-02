package io.zulvani.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalRounding {

    public BigDecimalRounding() {
        BigDecimal totalPayment = new BigDecimal("34999.49");
        BigDecimal paymentAmount = new BigDecimal("34999");

        System.out.println(totalPayment.setScale(0, RoundingMode.HALF_UP));
        System.out.println(totalPayment.compareTo(paymentAmount) > 0);
    }

    public static void main(String[] args){
        new BigDecimalRounding();
    }

}
