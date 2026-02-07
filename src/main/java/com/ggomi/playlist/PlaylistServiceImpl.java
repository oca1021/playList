package com.ggomi.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    PlaylistDao dao;

    @Override
    public int create(PlaylistDto dto) {
        System.out.println("PlaylistServiceImpl::create::" + dto);
        // 밸리데이션 체크

        // 신규 등록 시작
        // 신규 등록 결과 반환
        return dao.create(dto);
    }
    
}