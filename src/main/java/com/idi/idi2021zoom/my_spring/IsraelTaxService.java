package com.idi.idi2021zoom.my_spring;

import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class IsraelTaxService implements TaxService {
    @InjectFromContext
    private VatResolver maamResolver;

    @InjectFromContext
    private CoronaService coronaService;

    @Override
    public double withTax(double price) {
        return price+ price* maamResolver.getVat() +price*coronaService.getTax();
    }

    @Override
    public String description() {
        return "maam + tax for new mutation called: "+coronaService.getMutationName();
    }
}
