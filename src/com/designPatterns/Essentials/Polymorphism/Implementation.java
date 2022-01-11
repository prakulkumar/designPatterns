package com.designPatterns.Essentials.Polymorphism;

public class Implementation {
    public static void perform() {
        draw(new TextBox());
        draw(new CheckBox());
    }

    public static void draw(UIControl control) {
        control.draw();
    }
}
