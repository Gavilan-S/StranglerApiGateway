package com.application.StranglerApiGateway.task;

public class Task {
  private String descriptionTask;
  private boolean state;

  public Task(String descriptionTask, boolean state) {
    this.descriptionTask = descriptionTask;
    this.state = state;
  }

  public String getDescriptionTask() {
    return descriptionTask;
  }

  public void setDescriptionTask(String descriptionTask) {
    this.descriptionTask = descriptionTask;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public boolean isCompleted() {
    return state;
  }
}
