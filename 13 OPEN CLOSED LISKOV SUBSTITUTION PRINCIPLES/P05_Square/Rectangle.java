package P05_Square;

class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return this.width * this.height;
    }
}
