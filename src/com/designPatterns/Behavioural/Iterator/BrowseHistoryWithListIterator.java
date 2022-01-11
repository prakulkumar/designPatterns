package com.designPatterns.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryWithListIterator {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    /* ******************* ListIterator ******************* */

    public class ListIterator implements Iterator<String> {
        private BrowseHistoryWithListIterator history;

        // To check how far we visited
        private int index;

        public ListIterator(BrowseHistoryWithListIterator history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
