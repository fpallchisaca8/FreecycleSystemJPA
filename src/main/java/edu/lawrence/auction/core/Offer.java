package edu.lawrence.auction.core;

public class Offer {
    private String offer_id;
    private String item_id;
    private String recipient_id;
    private String status;

    public Offer() {}

    public String getOfferId() {
        return offer_id;
    }

    public void setOfferId(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getItemId() {
        return item_id;
    }

    public void setItemId(String item_id) {
        this.item_id = item_id;
    }

    public String getRecipientId() {
        return recipient_id;
    }

    public void setRecipientId(String recipient_id) {
        this.recipient_id = recipient_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}