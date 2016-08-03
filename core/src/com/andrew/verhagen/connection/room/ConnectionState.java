package com.andrew.verhagen.connection.room;

public enum ConnectionState {
    NOT_CONNECTED("Not Connected."),
    CONNECTING("Connecting to Server."),
    CONNECTED("Connected to Server"),
    FAILED("Failed to Connect"),
    WAITING_FOR_OPPONENT("Waiting for Opponent."),
    GAME_ON("Game On.");

    public final String stateDescription;

    ConnectionState(String stateDescription) {
        this.stateDescription = stateDescription;
    }
}