package com.idi.idi2021zoom.my_spring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {

    private Map<Class, Class> ifc2Class = new HashMap<>();
    private String packageToScan;

    public JavaConfig(String packageToScan) {
        this.packageToScan = packageToScan;
        ifc2Class.put(CoronaService.class, IsraelCoronaService.class);
        ifc2Class.put(TaxService.class, IsraelTaxService.class);
        ifc2Class.put(VatResolver.class, MaamResolver.class);
    }


    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2Class.get(type);
    }

    @Override
    public String getPackageToScan() {
        return packageToScan;
    }
}
