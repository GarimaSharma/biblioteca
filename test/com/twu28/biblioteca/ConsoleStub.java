package com.twu28.biblioteca;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ConsoleStub implements Console {
    public List<String> storedPrintedDataList = new ArrayList<String>();

    @Override
    public String scanData() {
        return storedPrintedDataList.remove(0);
    }


    @Override
    public void println(String data) {
        storedPrintedDataList.add(data);
    }


    @Override
    public String getStoredData(int index) {
            return storedPrintedDataList.get(index);
    }
}
