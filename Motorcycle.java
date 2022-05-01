public class Motorcycle extends Vehicle {
    int mcdoor = 0;
    private boolean[] motordoor;

    public Motorcycle(boolean wiperState, boolean trunkState) {
        super(wiperState, trunkState);
        doors = new boolean[mcdoor];
    }

    public Motorcycle(boolean wiperState, boolean trunkState, int mcdoor) {
        super(wiperState, trunkState);
        doors = new boolean[mcdoor];
    }

    @Override
    public void unlockAllDoors() {

        for (int i = 0; i < mcdoor; i++) {
            doors[i] = false;
        }
    }

    @Override
    public void lockAllDoors() {
        for (int i = 0; i < mcdoor; i++) {
            doors[i] = true;
        }

    }
}