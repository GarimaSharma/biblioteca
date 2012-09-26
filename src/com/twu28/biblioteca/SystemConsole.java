package com.twu28.biblioteca;

import java.util.Scanner;

public class SystemConsole implements Console {


    @Override
    public void println(String data) {
        System.out.println(data);

    }

    @Override
    public String scanData() {
        try {
            return new Scanner(System.in).next();
        } catch (RuntimeException runtimeException) {
            int temp = new Scanner(System.in).nextInt();
            return temp + "";
        }
    }

    @Override
    public String getStoredData(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void acceptAsInput(String inputString) {
        println(inputString);
    }
}
