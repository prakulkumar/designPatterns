package com.designPatterns.Behavioural.State;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Section icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
