package oop.lesson1;


public class Page {

    private String header;

    private String body;

    private String footer;


    public Page(String header, String body, String footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }


    public void updatePage(String updateInfo) {
        body += updateInfo;
    }


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
