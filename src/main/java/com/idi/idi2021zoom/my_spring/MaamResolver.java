package com.idi.idi2021zoom.my_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component

public class MaamResolver implements VatResolver {

    private double maam;

    public MaamResolver() {
        maam = getMaamFromMasAhnasa();
    }

    private double getMaamFromMasAhnasa() {
        return 0.17;
    }

    @Override
    public double getVat() {
        return maam;
    }
}
