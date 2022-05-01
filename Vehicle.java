abstract class Vehicle {
    //public int doornum;
    protected boolean[] doors;
    protected boolean trunk_open;
    private boolean wiper_active;


    public Vehicle(boolean wiperState, boolean trunkState) {
        this.wiper_active = wiperState;
        this.trunk_open = trunkState;
    }


    public boolean getWiperState() {
        return wiper_active;
    }


    public void toggle_wiper() {
        this.wiper_active = !getWiperState();
    }


    public int getNumberOfDoors() {
        return doors.length;
    }

    public boolean getDoorState(int door) {
        return this.doors[door];
    }

    public boolean getTrunkState() {
        return trunk_open;
    }

    public abstract void unlockAllDoors();

    public abstract void lockAllDoors();


}