package ticTacToe;

class Player {
    private String name;
    private String marker;

    Player(String name, String marker) {
        this.name = name;
        this.marker = marker;
    }

    String getName() {
        return name;
    }
    String getMarker() {
        return marker;
    }
}
