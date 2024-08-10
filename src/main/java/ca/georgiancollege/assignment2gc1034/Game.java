package ca.georgiancollege.assignment2gc1034;

public class Game {
    private int game_id;
    private String moby_url, title;

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoby_url() {
        return moby_url;
    }

    public void setMoby_url(String moby_url) {
        this.moby_url = moby_url;
    }
}
