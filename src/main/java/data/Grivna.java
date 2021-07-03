package data;

import enums.CurrencyType;

public class Grivna extends Currency{
    private CurrencyType type = CurrencyType.valueOf("UAH");
    private String desc = type.getName();

    public String getDesc() {
        return this.desc;
    }
}
