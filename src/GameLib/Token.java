package GameLib;

import java.io.Serializable;

public class Token implements Serializable {
    static final long serialVersionUID = 1; //or 1L
    private Player player;

    public Token(Player player)
    {
        this.player = player;
    }

    public Player getPlayer()
    {
        return player;
    }
    @Override
    public String toString()
    {
        return "" + player.getName().charAt(0);
    }
}
