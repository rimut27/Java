package oop.data;

public enum tingkatan {
    STANDART("Murah"),
    PRIMIUM("Menengah"),
    VIP("Mahal");

    private String deskreips;

    tingkatan(String deskreips) {
        this.deskreips = deskreips;
    }

    public String getDeskreips() {
        return deskreips;
    }
}
