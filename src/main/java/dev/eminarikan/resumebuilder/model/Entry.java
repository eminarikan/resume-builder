package dev.eminarikan.resumebuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    private String header;
    private String detail;
    private String body;
    private String link;
    private List<String> tags = new ArrayList<String>();
    
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    
}
