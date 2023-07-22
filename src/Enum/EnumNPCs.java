package Enum;

public enum EnumNPCs {
    MERC_ARMAS("Mercador de Armas"),
    ALDEAO("Aldeão"),
    GUARDA("Guarda"),
    MERC_BENS("Mercador de Bens");

    private final String NPC;

    EnumNPCs(String npc) {
        this.NPC = npc;
    }

    public String getNPC() {
        return NPC;
    }
}
