package es.uah.matcomp.mp.e1.ejerciciosclases.d.AbstractShape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void testConstructorPorDefecto() {
        Circle circle = new Circle();
        assertEquals("red", circle.getColor());
        assertTrue(circle.isFilled());
    }

    @Test
    void testConstructorConParametros() {
        Circle circle = new Circle(1.0, "blue", false);
        assertEquals("blue", circle.getColor());
        assertFalse(circle.isFilled());
    }

    @Test
    void testGetColor() {
        Circle circle = new Circle(1.0, "green", true);
        assertEquals("green", circle.getColor());
    }

    @Test
    void testSetColor() {
        Circle circle = new Circle();
        circle.setColor("yellow");
        assertEquals("yellow", circle.getColor());
    }

    @Test
    void testIsFilled() {
        Circle circle = new Circle(1.0, "red", true);
        assertTrue(circle.isFilled());

        circle.setFilled(false);
        assertFalse(circle.isFilled());
    }

    @Test
    void testSetFilled() {
        Circle circle = new Circle();

        circle.setFilled(false);
        assertFalse(circle.isFilled());

        circle.setFilled(true);
        assertTrue(circle.isFilled());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(1.0, "purple", true);
        String shapePart = "Shape: [color = purple, filled = true]";
        assertTrue(circle.toString().contains(shapePart));

        Circle circle2 = new Circle(1.0, "orange", false);
        String shapePart2 = "Shape: [color = orange, filled = false]";
        assertTrue(circle2.toString().contains(shapePart2));
    }

    @Test
    void testMetodosAbstractosImplementados() {
        Circle circle = new Circle(2.0, "red", true);
        assertEquals(Math.PI * 4, circle.getArea(), 0.001);
        assertEquals(4 * Math.PI, circle.getPerimeter(), 0.001);

        Rectangle rectangle = new Rectangle(2.0, 3.0, "blue", false);
        assertEquals(6.0, rectangle.getArea(), 0.001);
        assertEquals(10.0, rectangle.getPerimeter(), 0.001);
    }

    @Test
    void testHerenciaDeVariablesProtected() {
        class TestShape extends Shape {
            public TestShape(String c, boolean f) {
                super(c, f);
            }

            public String getColorDirect() {
                return color; // Acceso directo a variable protected
            }

            public boolean getFilledDirect() {
                return filled; // Acceso directo a variable protected
            }

            @Override
            public double getArea() { return 0; }

            @Override
            public double getPerimeter() { return 0; }
        }

        TestShape testShape = new TestShape("cyan", true);
        assertEquals("cyan", testShape.getColorDirect());
        assertTrue(testShape.getFilledDirect());

        // Verificamos que los setters modifican las variables protected
        testShape.setColor("magenta");
        testShape.setFilled(false);
        assertEquals("magenta", testShape.getColorDirect());
        assertFalse(testShape.getFilledDirect());
    }
}