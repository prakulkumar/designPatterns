package com.designPatterns.Behavioural.Iterator;

public class Implementation {
    public static void perform() {
        var browseHistory = new BrowseHistoryWithListIterator();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        var iterator = browseHistory.createIterator();

        while (iterator.hasNext()) {
            var current = iterator.current();
            System.out.println(current);
            iterator.next();
        }

        var browseHistoryWithArray = new BrowseHistoryWithArrayIterator();
        browseHistoryWithArray.push("a");
        browseHistoryWithArray.push("b");
        browseHistoryWithArray.push("c");

        var iterator2 = browseHistoryWithArray.createIterator();

        while (iterator2.hasNext()) {
            var current = iterator2.current();
            System.out.println(current);
            iterator2.next();
        }
    }
}
