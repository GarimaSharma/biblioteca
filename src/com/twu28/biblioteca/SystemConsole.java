package com.twu28.biblioteca;

import java.util.Scanner;

public class SystemConsole implements Console {


    @Override
    public void println(String data) {
        System.out.println(data);

    }

    @Override
    public int scanData() {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public String getStoredData(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
