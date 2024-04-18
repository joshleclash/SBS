package com.example.restservice.request;

public class MailEventData {
    private String sg_message_id;
    private String response;
    private String email;
    private Long timestamp;
    private String fromaddress;
    private String event;
    private long msize;
    private String customargs1;
    private String customargs2;
    private String tags;

    public String getSg_message_id() {
        return sg_message_id;
    }

    public void setSg_message_id(String sg_message_id) {
        this.sg_message_id = sg_message_id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Long getMsize() {
        return msize;
    }

    public void setMsize(int msize) {
        this.msize = msize;
    }

    public String getCustomargs1() {
        return customargs1;
    }

    public void setCustomargs1(String customargs1) {
        this.customargs1 = customargs1;
    }

    public String getCustomargs2() {
        return customargs2;
    }

    public void setCustomargs2(String customargs2) {
        this.customargs2 = customargs2;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}