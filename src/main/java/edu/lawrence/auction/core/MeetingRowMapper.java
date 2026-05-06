package edu.lawrence.auction.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MeetingRowMapper implements RowMapper<Meeting> {
    @Override
    public Meeting mapRow(ResultSet row, int rowNum) throws SQLException {
        Meeting m = new Meeting();
        m.setMeetingId(row.getString("meeting_id"));
        m.setItemId(row.getString("item_id"));
        m.setSiteId(row.getString("site_id"));
        m.setTimeId(row.getString("time_id"));
        return m;
    }
}