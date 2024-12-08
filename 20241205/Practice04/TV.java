public class TV {
    private boolean power = false;
    private int channel;

    public void togglePower() {
        power = !power;
    }

    public void changeChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "power=" + power +
                ", channel=" + channel +
                '}';
    }
}
