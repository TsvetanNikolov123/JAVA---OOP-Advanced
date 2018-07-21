package p09_traffic_lights;

public enum Light {

    RED,
    GREEN,
    YELLOW;

    private static Light[] values = values();

    public Light next() {
        Light next = values[(this.ordinal() + 1) % values().length];
        return next;
    }
}
