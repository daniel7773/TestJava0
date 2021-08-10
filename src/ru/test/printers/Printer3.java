package ru.test.printers;

public class Printer3 {
    public void printText228(String str) {
        System.out.println("Печатает принтер 3...");
        String printText;
        if (str != null) {
            printText = "Text for printing: ";
        } else {
            printText = "No text";
        }
        System.out.println(printText);
    }
}
