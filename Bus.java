public class Bus extends Vehicle implements Trunk {
    int busdoor = 2;
    //private boolean trunk_open;
    //private boolean[] busdoors;

    public Bus(boolean wiperState, boolean trunkState) {
        super(wiperState, trunkState);
        doors = new boolean[busdoor];
    }

    public Bus(boolean wiperState, boolean trunkState, int busdoor) {
        super(wiperState, trunkState);
        doors = new boolean[busdoor];
    }


    @Override
    public int getNumberOfDoors() {
        busdoor = super.getNumberOfDoors();
        if (busdoor >= 1) {
            busdoor = super.getNumberOfDoors();
        }
        return busdoor;

    }

    @Override
    public void unlockAllDoors() {
        for (int i = 0; i < busdoor; i++) {
            doors[i] = false;
        }

    }

    @Override
    public void lockAllDoors() {
        if (busdoor >= 1) {
            for (int i = 0; i < busdoor; i++) {
                doors[i] = true;
            }

        }

    }

    @Override
    public void openTrunk() {
        this.trunk_open = true;
    }

    @Override
    public void closeTrunk() {
        this.trunk_open = false;
    }
}