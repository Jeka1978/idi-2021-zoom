package com.idi.idi2021zoom.my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        JavaConfig javaConfig = new JavaConfig("com.idi.idi2021zoom.my_spring");
        ApplicationContext context = new ApplicationContext(javaConfig);


        TaxService taxService = context.getObject(IsraelTaxService.class);
        double withTax = taxService.withTax(100);
        System.out.println(withTax);
        System.out.println(taxService.description());

    }
}
