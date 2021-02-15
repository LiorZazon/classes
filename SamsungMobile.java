package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
public class SamsungMobile {

    public String color;
    public float size;
    public float current_os;

    public static float latest_os = 4.4f;

    public static void newOS() {
        latest_os += 0.1;
    }

    public void upgradeToLatestOS() {
        current_os = latest_os;
    }

    public SamsungMobile(String color, float size) {
        this.color = color;
        this.size = size;
        this.current_os = latest_os;
    }
}
