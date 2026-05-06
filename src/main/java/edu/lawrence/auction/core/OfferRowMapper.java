package edu.lawrence.auction.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OfferRowMapper implements RowMapper<Offer> {
    @Override
    public Offer mapRow(ResultSet row, int rowNum) throws SQLException {
        Offer o = new Offer();
        o.setOfferId(row.getString("offer_id"));
        o.setItemId(row.getString("item_id"));
        o.setRecipientId(row.getString("recipient_id"));
        o.setStatus(row.getString("status"));
        return o;
    }
}