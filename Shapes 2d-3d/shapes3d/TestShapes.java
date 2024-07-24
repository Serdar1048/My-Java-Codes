package shapes3d;

public class TestShapes {
    public static void main(String[] args) {
        Cube c = new Cube(4);
        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.volume());

        Cylinder cy = new Cylinder(6,10);
        System.out.println(cy);
        System.out.println(cy.area());
        System.out.println(cy.volume());
    }


}
