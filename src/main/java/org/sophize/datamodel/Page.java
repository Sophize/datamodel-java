package org.sophize.datamodel;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Page {
    private Citation[] citations;
    private User contributor;
    private String description;
    private String pageID;
    private String parentPageID;
    private Double sortHint;
    private String title;

    @JsonProperty("citations")
    public Citation[] getCitations() { return citations; }
    @JsonProperty("citations")
    public void setCitations(Citation[] value) { this.citations = value; }

    @JsonProperty("contributor")
    public User getContributor() { return contributor; }
    @JsonProperty("contributor")
    public void setContributor(User value) { this.contributor = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("pageId")
    public String getPageID() { return pageID; }
    @JsonProperty("pageId")
    public void setPageID(String value) { this.pageID = value; }

    @JsonProperty("parentPageId")
    public String getParentPageID() { return parentPageID; }
    @JsonProperty("parentPageId")
    public void setParentPageID(String value) { this.parentPageID = value; }

    @JsonProperty("sortHint")
    public Double getSortHint() { return sortHint; }
    @JsonProperty("sortHint")
    public void setSortHint(Double value) { this.sortHint = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
