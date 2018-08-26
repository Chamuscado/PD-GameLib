package GameLib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {
    static final long serialVersionUID = 1; //or 1L
    public static final int NUM_TOKENS_TURN = 3;
    private String name;
    public final int id;
    public List<Token> availableTokens = new ArrayList<>();
    public boolean hasWon;

    public Player(String name, int id) {
        this.name = name;
        hasWon = false;
        this.id = id;
    }

/*
    public void setName(String name) {
        this.name = name;
    }
    */

    public   String getName() {
        return name;
    }

    /*
            public boolean getHasWon() {
                return hasWon;
            }
        */
    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    /*
        public void getNewTokens() {
            availableTokens.clear();

            for (int i = 0; i < NUM_TOKENS_TURN; i++) {
                availableTokens.add(new Token(this));
            }

            hasWon = false;
        }
    */
    public List<Token> getAvailableTokens() {
        return availableTokens;
    }


    public int getNumAvailableTokens() {
        System.out.println("getNumAvailableTokens -> " + availableTokens.size());
        return availableTokens.size();
    }

    @Override
    public String toString() {
        return "Player " + name + "  Available tokens: " + availableTokens.size() + (hasWon ? "\nHAS WON!" : "");
    }
}
