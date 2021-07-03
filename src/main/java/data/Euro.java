package data;

import enums.CurrencyType;

public class Euro extends Currency {
    private CurrencyType type = CurrencyType.valueOf("EUR");
    private String desc = type.getName();

    public String getDesc() {
        return this.desc;
    }
}
