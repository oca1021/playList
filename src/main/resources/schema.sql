-- 1. 테이블 생성
DROP TABLE IF EXISTS PLAYLIST;

CREATE TABLE PLAYLIST (
    ID          SERIAL PRIMARY KEY,           -- 자동 증가 시퀀스 (POSTGRESQL 스타일)
    GENRE       VARCHAR(50),                  -- 장르
    ARTIST      VARCHAR(100),                 -- 가수
    SONG_TITLE  VARCHAR(200) NOT NULL,        -- 노래제목
    IS_USED     CHAR(1) DEFAULT 'Y' CHECK (IS_USED IN ('Y', 'N')), -- 사용 여부 및 제약조건
    CREATED_AT  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP, -- 등록일
    UPDATED_AT  TIMESTAMP DEFAULT CURRENT_TIMESTAMP  -- 수정일
);