//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package flat;

import java.util.Objects;

public class Coordinates implements Comparable<Coordinates> {
    private Float x;
    private Float y;

    public Coordinates() {
    }

    public Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getX() {
        return this.x;
    }

    public Float getY() {
        return this.y;
    }

    public int compareTo(Coordinates o) {
        return (int)((double)(this.x * this.x) + (double)(this.y * this.y) - (double)(o.getX() * o.getX()) - (double)(o.getY() * o.getY()));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Coordinates)) {
            return false;
        } else {
            Coordinates that = (Coordinates)o;
            return this.getX() == that.getX() && this.getY().equals(that.getY());
        }
    }

    public String toString() {
        return "Coordinates{\n\t\t x = " + this.x + "\n\t\t y = " + this.y + "\n\t }";
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.x, this.y});
    }
}
