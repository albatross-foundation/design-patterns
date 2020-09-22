package com.design.pattern.example2;

public class RemoteLoader {
    public static void main(String[] arg){
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoom = new Light("Living Room");
        LightOnCommand onCommand = new LightOnCommand(livingRoom);
        LightOffCommand offCommand = new LightOffCommand(livingRoom);
        remoteControl.setCommand(0, onCommand, offCommand);
        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        System.out.println(remoteControl);
    }
}
