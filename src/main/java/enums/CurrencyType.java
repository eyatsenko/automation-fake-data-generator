package enums;

public enum CurrencyType {
    USD ("dollar"),
    EUR("euro"),
    UAH("grivna");

    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
