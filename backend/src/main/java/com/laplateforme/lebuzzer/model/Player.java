
package com.laplateforme.lebuzzer.model;

public class Player {

    private String id;
    private String nickname;
    private int score;

    public Player(String id, String nickname) {
        this.id = id;
        this.nickname = nickname;
        this.score = 0;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

