package com.albiosz.honeycombs.game.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameRequest {
	@Schema(description = "Name of the created Game ", example = "New Game")
	private String name;
}
