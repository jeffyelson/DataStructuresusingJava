public class Car extends Vehicle implements Trunk {
    //private boolean trunk_open;

    private final int cardoor = 4;
    // private boolean wiperstate;
    // private boolean trunkstate;

    public Car(boolean wiperState, boolean trunkState) {
        super(wiperState, trunkState);
        doors = new boolean[cardoor];
    }

    public Car(boolean wiperState, boolean trunkState, int cardoor) {
        super(wiperState, trunkState);
        doors = new boolean[cardoor];
    }

    @Override
    public void unlockAllDoors() {
        for (int i = 0; i < cardoor; i++) {
            doors[i] = false;
        }


    }

    @Override
    public void lockAllDoors() {

        for (int i = 0; i < cardoor; i++) {
            doors[i] = true;
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

    public static void main(String[] args){


    }
}