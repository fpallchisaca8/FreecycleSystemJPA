package edu.lawrence.auction.core;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class TagDAO {
    @Autowired
    private final JdbcTemplate jdbc;

    public TagDAO(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Item> getItemsFromTag(String tag) {
        /** 
         * The logic here is not correct and needs to be reworked.
         * 
         * You need two separate queries:
         * 
         * select item_id from tags where tag_name=?
         * 
         * for each id returned from that query you then need to do
         * 
         * select * from items where item_id=?
         * 
         * and collect all of those in a list.
         */
        String sql = "SELECT * FROM tags WHERE tag_name=?";
        return jdbc.query(sql, new ItemRowMapper(), tag);
    }

    
    public void addTagToItem(String itemId, String tagName) {
        String sql = "INSERT INTO tags (item_id, tag_name) VALUES (?, ?)";
        jdbc.update(sql, itemId, tagName);
    }
     
}
