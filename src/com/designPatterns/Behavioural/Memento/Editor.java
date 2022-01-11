package com.designPatterns.Behavioural.Memento;

public class Editor {
    public String content;

    public EditorState createStore() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
