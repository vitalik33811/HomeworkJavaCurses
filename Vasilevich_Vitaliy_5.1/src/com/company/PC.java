package com.company;

import java.util.Scanner;

public class PC {
    private int resource;
    private boolean cpu;
    private boolean ram;
    private boolean hdd;
    private boolean isOn = false;
    private String act = "On";
    private boolean burnPC = false;
    private int attempt;

    public PC(int resource) {
        this.resource = resource;
    }

    public void Opisanie() {
        System.out.print("[" + cpu + ", ");
        System.out.print(ram + ", ");
        System.out.print(hdd + ", ");
        System.out.println(resource + "]");
    }

    public void CheckPC() {
        for (int i = 0; i < resource; i++) {
            attempt = new Scanner(System.in).nextInt();
            if (i == resource - 1) {
                System.out.println("Лимит превышен, комп сгорел");
                break;
            }
            if (burnPC == true) {
                System.out.println("Комп сгорел, ему конец");
                break;
            }
            int rand = (int) (Math.random() * 2);
            if (attempt == rand) {
                if (act == "On") {
                    On();
                    Opisanie();
                    act = "Off";
                    System.out.println("Комп включился");
                    continue;
                } else if (act == "Off") {
                    Off();
                    Opisanie();
                    act = "On";
                    System.out.println("Комп выключился");
                    continue;
                }
            }
            burnPC = true;
            System.out.println("Комп сгорел");
        }
    }

    private void On() {
        this.cpu = true;
        this.ram = true;
        this.hdd = true;
    }

    private void Off() {
        this.cpu = false;
        this.ram = false;
        this.hdd = false;
    }
}