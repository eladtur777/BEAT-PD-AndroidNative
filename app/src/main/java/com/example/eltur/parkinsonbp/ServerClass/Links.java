package com.example.eltur.parkinsonbp.ServerClass;

import static java.lang.String.format;

/**
 * Created by elad on 18/09/2017.
 */

public class Links {

    private Long linkID;
    private String linkHeadLine;
    private String linkURL;

    @Override
    public String toString(){
        return format("{linkHeadLine:\"%s\",linkURL:\"%s\"}",linkHeadLine, linkURL);
    }
    public Links(){}
    public Links(Long linkID, String lintkHeadLine, String linkURL) {
        this.linkID = linkID;
        this.linkHeadLine = lintkHeadLine;
        this.linkURL = linkURL;
    }

    public Long getLinkID() {
        return linkID;
    }

    public void setLinkID(Long linkID) {
        this.linkID = linkID;
    }

    public String getLinkHeadLine() {
        return linkHeadLine;
    }

    public void setLinkHeadLine(String linkHeadLine) {
        this.linkHeadLine = linkHeadLine;
    }

    public String getLinkURL() {
        return linkURL;
    }

    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }
}
