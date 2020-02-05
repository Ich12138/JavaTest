package org.day3.interfaceDeal;

import org.day3.CameraPhone;

public class NokiaPhone implements CameraPhone {
    private CameraPhone Nokia;
    public void takePhoto() {

    }

    public void call(String name) {
        System.out.println(name + ":使用 Nokia call");
    }

    public void receive() {

    }

    public void sendMsg() {

    }

    public void receiveMsg() {

    }
}
