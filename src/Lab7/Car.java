package Lab7;

public class Car {
    private String Color;
    private int seat;
    private String gearType;
    private String engineSize;

    //constructor


    public Car(String color, int seat, String gearType, String engineSize) {
        Color = color;
        this.seat = seat;
        this.gearType = gearType;
        this.engineSize = engineSize;
    }
    //getter and setter methods

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
}//class
