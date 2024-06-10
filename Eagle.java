public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        this.flying = true;
        System.out.printf("%s takes off in the sky%n", this.getName());
    }

    @Override
    public int ascend(int meters) {
        this.altitude += meters;
        System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.printf("glides into the air.%n");
    }

    @Override
    public int descend(int meters) {
        this.altitude -= meters;
        System.out.printf("%s flies downward, altitude: %d%n", this.getName(), this.altitude);
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.altitude > 1) {
            System.out.printf("%s is too high, it can't land.%n", getName());
        } else {
            System.out.printf("%s lands on the ground.%n", getName());
        }
    }

}
