package obiektowe.enums;

enum ShirtSize {
    //wartości
    XL(16),
    L(14),
    M(12),
    S(10),
    XS(8);
    // traktujemy to jak wywołania konstruktora

    //cechy
    private int europeanSize;

    //konstruktory
    ShirtSize(int europeanSize) {
        this.europeanSize = europeanSize;
    }


    //zachowania

    int getEuropeanSize() {
        return europeanSize;
    }

    public static ShirtSize findShirtSizeByEuropean(int europeanSize) {
        for (ShirtSize value : values()) {
            if (value.europeanSize == europeanSize) {
                return value;
            }
        }
        return null;
    }


}
