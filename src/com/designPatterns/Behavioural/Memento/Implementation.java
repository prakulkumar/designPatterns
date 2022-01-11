package com.designPatterns.Behavioural.Memento;

public class Implementation {
    public static void perform() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createStore());

        editor.setContent("b");
        history.push(editor.createStore());

        editor.setContent("c");

        editor.restore(history.pop());
        System.out.println(editor.getContent()); // give b

        editor.restore(history.pop());
        System.out.println(editor.getContent()); // give a
    }
}
