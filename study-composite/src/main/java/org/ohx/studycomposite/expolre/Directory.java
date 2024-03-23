package org.ohx.studycomposite.expolre;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;

    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return directory.stream().mapToInt(Entry::getSize).sum();
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
