package com.ggomi.playlist;

import java.time.LocalDateTime;

public class PlaylistDto {

    // 시퀀스
    private Long id;
    // 장르
    private String genre;
    // 가수
    private String artist;    
    // 제목
    private String songTitle;
    // 사용여부
    private String isUsed;   
    // 등록일
    private LocalDateTime createdAt;
    // 수정일
    private LocalDateTime updatedAt;

    // Getter & Setter 메서드
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // 디버깅을 위한 toString 오버라이드 (선택 사항)
    // 오버라이드(오버라이딩) : 부모껄 덮어씀!!
    // 오버로드(오버로딩) : 내껄 덮엏씀!!
    @Override
    public String toString() {
        return "PlaylistDto [id=" + id + ", genre=" + genre + ", artist=" + artist + 
               ", songTitle=" + songTitle + ", isUsed=" + isUsed + 
               ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }
}
