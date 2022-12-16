package dev.eminarikan.resumebuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String header;
    private List<Entry> entries = new ArrayList<Entry>();
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public List<Entry> getEntries() {
        return entries;
    }
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    
}
