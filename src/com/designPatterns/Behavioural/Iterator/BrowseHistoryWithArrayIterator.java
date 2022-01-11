package com.designPatterns.Behavioural.Iterator;

public class BrowseHistoryWithArrayIterator {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    /* ******************* ArrayIterator ******************* */

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistoryWithArrayIterator history;

        // To check how far we visited
        private int index;

        public ArrayIterator(BrowseHistoryWithArrayIterator history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
