package ru.test;

import ru.test.printers.Printer1;
import ru.test.printers.Printer2;
import ru.test.printers.Printer3;

/*
    Задание:
    Переделать MainClass таким образом, чтобы остался один метод: public static void printShit
    в который можно передать любой из трёх классов и он бы печатал именно то что печатает экземпляр каждого типа Printer
 */
public class MainClass {

    public static void main(String[] args) {
        printShit(new Printer1());
        printShit(new Printer2());
        printShit(new Printer3());
    }

    public static void printShit(Printer1 printer) {
        printer.printText("Any text");
    }

    public static void printShit(Printer2 printer) {
        printer.printText2();
    }

    public static void printShit(Printer3 printer) {
        printer.printText228("Random stuff");
    }
}
