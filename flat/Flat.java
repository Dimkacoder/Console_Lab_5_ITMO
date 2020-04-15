//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package flat;

import MainFiles.Main;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Random;
import java.util.Map.Entry;

public class Flat implements Comparable<Flat> {
    private Long id;
    private String name;
    private Coordinates coordinates = new Coordinates();
    private ZonedDateTime creationDate;
    private Integer area;
    private Long numberOfRooms;
    private Boolean newOrNot;
    private Furnish furnish;
    private Transport transport;
    private House house = new House();

    public Flat(String name, Coordinates coordinates, ZonedDateTime creationDate, Integer area, Long numberOfRooms, Boolean newOrNot, Furnish furnish, Transport transport, House house) {
        Random random = new Random();

        Long id;
        boolean AllRight;
        do {
            id = Math.abs(random.nextLong());
            AllRight = this.IsIdOk(id);
        } while(!AllRight);

        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.newOrNot = newOrNot;
        this.furnish = furnish;
        this.transport = transport;
        this.house = house;
    }

    public Flat(Long id, String name, Coordinates coordinates, ZonedDateTime creationDate, Integer area, Long numberOfRooms, Boolean newOrNot, Furnish furnish, Transport transport, House house) {
        boolean AllRight = this.IsIdOk(id);
        if (!AllRight) {
            System.out.println("Id недействителен. Подбираю другой id");

            while(!AllRight) {
                Random random = new Random();
                id = Math.abs(random.nextLong());
                AllRight = this.IsIdOk(id);
            }
        }

        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.newOrNot = newOrNot;
        this.furnish = furnish;
        this.transport = transport;
        this.house = house;
    }

    public Flat() {
        Random random = new Random();

        Long id;
        boolean AllRight;
        do {
            id = Math.abs(random.nextLong());
            AllRight = this.IsIdOk(id);
        } while(!AllRight);

        this.id = id;
        this.creationDate = ZonedDateTime.now();
    }

    private boolean IsIdOk(Long id) {
        Iterator iterator = Main.flats.entrySet().iterator();

        Flat value;
        do {
            if (!iterator.hasNext()) {
                return true;
            }

            Entry<Integer, Flat> pair = (Entry)iterator.next();
            value = (Flat)pair.getValue();
        } while(!value.getId().equals(id));

        return false;
    }

    public void setCoordinates(Float x, Float y) {
        this.coordinates.setX(x);
        this.coordinates.setY(y);
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public void setNumberOfRooms(Long numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNewOrNot(Boolean newOrNot) {
        this.newOrNot = newOrNot;
    }

    public void setFurnish(String condition) {
        this.furnish = Furnish.getByName(condition);
    }

    public void setTransport(String condition) {
        this.transport = Transport.getByName(condition);
    }

    public void setHouse(String name, Long year, Long numberOfFloors) {
        this.house.setName(name);
        this.house.setYear(year);
        this.house.setNumberOfFloors(numberOfFloors);
    }

    public boolean setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return this.creationDate;
    }

    public Integer getArea() {
        return this.area;
    }

    public Long getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public Boolean getNewOrNot() {
        return this.newOrNot;
    }

    public Furnish getFurnish() {
        return this.furnish;
    }

    public Transport getTransport() {
        return this.transport;
    }

    public House getHouse() {
        return this.house;
    }

    public int compareTo(Flat o) {
        int what_return = this.name.compareTo(o.name);
        if (what_return != 0) {
            return what_return;
        } else {
            what_return = this.creationDate.compareTo(o.creationDate);
            if (what_return != 0) {
                return what_return;
            } else {
                what_return = this.coordinates.compareTo(o.coordinates);
                if (what_return != 0) {
                    return what_return;
                } else {
                    what_return = this.area.compareTo(o.area);
                    if (what_return != 0) {
                        return what_return;
                    } else {
                        what_return = this.numberOfRooms.compareTo(o.numberOfRooms);
                        if (what_return != 0) {
                            return what_return;
                        } else {
                            what_return = this.newOrNot.compareTo(o.newOrNot);
                            if (what_return != 0) {
                                return what_return;
                            } else {
                                what_return = this.furnish.compareTo(o.furnish);
                                if (what_return != 0) {
                                    return what_return;
                                } else {
                                    what_return = this.transport.compareTo(o.transport);
                                    if (what_return != 0) {
                                        return what_return;
                                    } else {
                                        what_return = this.house.compareTo(o.house);
                                        return what_return != 0 ? what_return : 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        return "Flat №" + this.id + "\n\t Name : " + this.name + "\n\t Coordinates : " + this.coordinates + "\n\t Date : " + this.creationDate + "\n\t Area : " + this.area + "\n\t Number of rooms : " + this.numberOfRooms + "\n\t New or not : " + this.newOrNot + "\n\t Furnish : " + this.furnish + "\n\t Transport : " + this.transport + "\n\t House : " + this.house + "\n";
    }
}
