package Enum;

public enum EnumProps {
    ALTAR("Altar da deusa"),
    ENTRADA("Entrada da Dungeon");

    private final String PROP;

    EnumProps(String prop) {
        this.PROP = prop;
    }

    public String getPROP() {
        return PROP;
    }
}
