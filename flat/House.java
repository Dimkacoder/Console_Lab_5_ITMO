//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package flat;

public class House implements Comparable<House> {
    private String name;
    private Long year;
    private Long numberOfFloors;

    public House() {
    }

    public House(String name, Long year, Long numberOfFloors) {
        this.name = name;
        this.year = year;
        this.numberOfFloors = numberOfFloors;
    }

    public String getName() {
        return this.name;
    }

    public Long getYear() {
        return this.year;
    }

    public Long getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setNumberOfFloors(Long numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String toString() {
        return "House {\n\t\t name : " + this.name + "\n\t\t year : " + this.year + "\n\t\t numberOfFloors : " + this.numberOfFloors + "\n\t }";
    }

    public int compareTo(House o) {
        int what_return = this.name.compareTo(o.name);
        if (what_return != 0) {
            return what_return;
        } else {
            what_return = this.year.compareTo(o.year);
            if (what_return != 0) {
                return what_return;
            } else {
                what_return = this.numberOfFloors.compareTo(o.numberOfFloors);
                return what_return != 0 ? what_return : 0;
            }
        }
    }
}
