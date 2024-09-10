class ShapeTest {
    public void testCircleVectorRendering() {
        Shape circle = new Circle(new VectorRenderer());
     assertEquals("Drawing Circle using Vector rendering", circle.draw());
    }
    private void assertEquals(String string, String draw) {
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
    public void testCircleRasterRendering() {
        Shape circle = new Circle(new RasterRenderer());
     assertEquals("Drawing Circle using Raster rendering", circle.draw());
    }
    public void testSquareVectorRendering() {
        Shape square = new Square(new VectorRenderer());
     assertEquals("Drawing Square using Vector rendering", square.draw());
    }
    public void testSquareRasterRendering() {
        Shape square = new Square(new RasterRenderer());
    assertEquals("Drawing Square using Raster rendering", square.draw());
    }
}

interface Renderer {
    String render(String shape);
}

class VectorRenderer implements Renderer {
    public String render(String shape) {
        return "Drawing " + shape + " using Vector rendering";
    }
}

class RasterRenderer implements Renderer {
    public String render(String shape) {
        return "Drawing " + shape + " using Raster rendering";
    }
}
abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String draw();
}
class Circle extends Shape {

    public Circle(Renderer renderer) {
        super(renderer);
    }
    public String draw() {
        return renderer.render("Circle");
    }
}

class Square extends Shape {

    public Square(Renderer renderer) {
        super(renderer);
    }

    public String draw() {
        return renderer.render("Square");
    }
}
class DrawingApp {
    public static void main(String[] args) {
        // Create a Circle with Vector rendering
        Shape circleVector = new Circle(new VectorRenderer());
        System.out.println(circleVector.draw()); // Output: Drawing Circle using Vector rendering

        // Create a Circle with Raster rendering
        Shape circleRaster = new Circle(new RasterRenderer());
        System.out.println(circleRaster.draw()); // Output: Drawing Circle using Raster rendering

        // Create a Square with Vector rendering
        Shape squareVector = new Square(new VectorRenderer());
        System.out.println(squareVector.draw()); // Output: Drawing Square using Vector rendering

        // Create a Square with Raster rendering
        Shape squareRaster = new Square(new RasterRenderer());
        System.out.println(squareRaster.draw()); // Output: Drawing Square using Raster rendering
    }
}

