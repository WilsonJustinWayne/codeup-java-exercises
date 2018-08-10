package ticTacToe;

public class Spot {
    private String content;
    private String filler;

    Spot(String content, String filler) {
        this.content = content;
        this.filler = filler + content + filler;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setFiller("-", content);
    }

    String getFiller() {
        return filler;
    }

    public void setFiller(String filler, String content) {
        this.filler = filler + content + filler;
    }
}
