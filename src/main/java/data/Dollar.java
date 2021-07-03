package data;

import enums.CurrencyType;

public class Dollar extends Currency {
    private CurrencyType type = CurrencyType.valueOf("USD");
    private String desc = type.getName();

    public String getDesc() {
        return this.desc;
    }
}
