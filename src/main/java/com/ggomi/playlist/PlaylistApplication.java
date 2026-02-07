package com.ggomi.playlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaylistApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistApplication.class, args);

		// PlayListDto dto = new PlayListDto();
		// dto.setArtist("지아");
		// dto.setSongTitle("술 한 잔 해요");
		// System.out.println(dto);
		// com.ggomi.playlist.PlayListDto@7f4596d0
	}

}
