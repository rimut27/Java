package javaOO.data;

public enum HEWAN {
    kucing("Lucu"),
    ayam("digoreng"),
    anjing("Galak");

    private String descript;

    HEWAN(String descript) {
        this.descript = descript;
    }

    public String getDescript() {
        return descript;
    }
}
