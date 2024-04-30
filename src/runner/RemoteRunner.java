package runner;

import controller.Remote;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new Remote();
        System.out.println(remote.getColour());
    }
}