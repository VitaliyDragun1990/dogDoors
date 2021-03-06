package com.doors.dog;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        remote.pressButton();

        System.out.println("\nFido's all done...");
        remote.pressButton();

        System.out.println("\nFido's bak inside...");
        remote.pressButton();
    }
}
