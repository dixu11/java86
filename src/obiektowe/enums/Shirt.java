package obiektowe.enums;

class Shirt {

    private ShirtSize size;

    Shirt(ShirtSize size) {
        this.size = size;
    }

    ShirtSize getSize() {
        return size;
    }

    int getEuropeanSize() {
        return size.getEuropeanSize();
    }
}
