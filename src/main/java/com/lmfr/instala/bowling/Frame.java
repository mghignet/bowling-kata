package com.lmfr.instala.bowling;

import java.util.ArrayList;
import java.util.List;

public class Frame {

  public List<Integer> rolls = new ArrayList<>();

  public Frame() {
  }

  public void roll(int rollScore) {
    this.rolls.add(rollScore);
  }

  public int getScore() {
    return this.rolls.stream().reduce(0, Integer::sum);
  }

  public boolean isComplete() {
    return rolls.size() == 2;
  }

}
