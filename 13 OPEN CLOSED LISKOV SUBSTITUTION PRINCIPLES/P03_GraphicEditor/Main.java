package P03_GraphicEditor;

public class Main {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawDrawable(new Picture());
        graphicEditor.drawDrawable(new Rectangle());
        graphicEditor.drawDrawable(new Circle());
        graphicEditor.drawDrawable(new Shape() {
            @Override
            public void draw() {
                System.out.println("I am Shape");
            }
        });
    }
}
