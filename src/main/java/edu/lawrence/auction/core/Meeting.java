package edu.lawrence.auction.core;

public class Meeting {
    private String meeting_id;
    private String item_id;
    private String site_id;
    private String time_id;

    public Meeting() {}

    public String getMeetingId() {
        return meeting_id;
    }

    public void setMeetingId(String meeting_id) {
        this.meeting_id = meeting_id;
    }

    public String getItemId() {
        return item_id;
    }

    public void setItemId(String item_id) {
        this.item_id = item_id;
    }

    public String getSiteId() {
        return site_id;
    }

    public void setSiteId(String site_id) {
        this.site_id = site_id;
    }

    public String getTimeId() {
        return time_id;
    }

    public void setTimeId(String time_id) {
        this.time_id = time_id;
    }
}