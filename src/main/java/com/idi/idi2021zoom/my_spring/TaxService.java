package com.idi.idi2021zoom.my_spring;

/**
 * @author Evgeny Borisov
 */
public interface TaxService {
    double withTax(double price);
    String description();
}
