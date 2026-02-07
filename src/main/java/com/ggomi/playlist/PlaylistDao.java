package com.ggomi.playlist;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PlaylistDao {
    // DB 접근을 위한 객체
    // @Autowired
    // private DataSource dataSource;

    // 필드 멤버
    private final DataSource dataSource;
    
    // 생성자 생성
    public PlaylistDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    int create(PlaylistDto dto) {
        String sql = "INSERT INTO PLAYLIST (GENRE, ARTIST, SONG_TITLE) VALUES (?, ?, ?)";

        try (Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, dto.getGenre());
            preparedStatement.setString(2, dto.getArtist());
            preparedStatement.setString(3, dto.getSongTitle());

            int createdCount = preparedStatement.executeUpdate();
            return createdCount;
        } catch (Exception e) {
            throw new RuntimeException("플레이리스트 저장 중 오류 발생: " + e.getMessage(), e);
        }
    }
}
