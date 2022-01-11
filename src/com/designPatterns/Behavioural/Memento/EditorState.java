package com.designPatterns.Behavioural.Memento;

public class EditorState {
    // so we don't accidentally change it
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
