package dev.eminarikan.resumebuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String fullName;
    private String title;
    private String email;
    private String phone;
    private String linkedin;
    private String website;
    private String location;
    private List<Section> sections = new ArrayList<Section>();
    private List<Skill> skills = new ArrayList<Skill>();
    


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getLinkedin() {
        return linkedin;
    }
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Section> getSections() {
        return sections;
    }
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    
}
