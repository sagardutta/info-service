package com.vhl.domain;

import java.util.List;

/**
 * Created by sdutta on 12/26/15.
 */
public class InfoItem {

    String item;
    List<String> tags;

    public InfoItem(String item, List<String> tags) {
        this.item = item;
        this.tags = tags;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
