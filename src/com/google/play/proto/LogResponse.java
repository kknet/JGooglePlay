// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Log.proto
package com.google.play.proto;

import com.squareup.wire.Message;

public final class LogResponse extends Message {

  public LogResponse() {
  }

  private LogResponse(Builder builder) {
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof LogResponse;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<LogResponse> {

    public Builder() {
    }

    public Builder(LogResponse message) {
      super(message);
    }

    @Override
    public LogResponse build() {
      return new LogResponse(this);
    }
  }
}
