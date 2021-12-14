package com.lmfr.instala.bowling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

  @Test
  void new_game_score_is_zero() {
    Game game = new Game();
    assertThat(game.getScore()).isEqualTo(0);
  }

  @Test
  void some_rolls_calculate_score_without_spare_or_strike() {
    Game game = new Game();
    game.roll(3);
    game.roll(6);
    game.roll(9);
    game.roll(0);
    assertThat(game.getScore()).isEqualTo(18);
  }

}
