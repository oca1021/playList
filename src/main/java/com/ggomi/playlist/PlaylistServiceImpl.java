package com.ggomi.playlist;

import org.springframework.stereotype.Service;

@Service
public class PlaylistServiceImpl implements PlaylistService {

    @Override
    public int create(PlaylistDto dto) {
        System.out.println("PlaylistServiceImpl::create");
        return 1;
    }
    
}