package com.lmfr.instala.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {

  public List<Frame> frames = new ArrayList<>();
  public Frame currentFrame;

  public Game() {
    this.initializeFrame();
  }

  public void roll(int score) {
    if (this.currentFrame.isComplete()) {
      this.initializeFrame();
    }
    this.currentFrame.roll(score);
  }

  private void initializeFrame() {
    Frame frame = new Frame();
    this.frames.add(frame);
    this.currentFrame = frame;
  }

  public int getScore() {
    return this.frames.stream()
          .map(Frame::getScore)
          .reduce(0, Integer::sum);
  }
}
