package com.ggomi.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistContoller {
    // @Autowired = 필드 주입, 필드 멤버에 객체를 알아서 주입하는 방식(클래식 방식)
    // 생성자에 서비스 넣는 방식 = 생성자 주입, 이 방법은 서비스 객체를 final로 선언해서 불변하게 만들 수 있음(최신 방식)
    /*
        private final PlaylistService service;

        public PlaylistContoller(PlaylistService service) {
            this.service = service;
        }
     */

    @Autowired
    private PlaylistService service;

    @PostMapping("/playlists")
    public ResponseEntity<?> create(@RequestBody PlaylistDto dto) {
        System.out.println("PlaylistContoller::create::" + dto);

        int createdCount = service.create(dto);
        if (createdCount == 1) {
            return ResponseEntity.status(201).body("플레이 리스트가 성공적으로 추가되었습니다.");
        } else {
            return ResponseEntity.internalServerError().body("플레이 리스트 추가에 실패하였습니다.");
        }
    }
}
