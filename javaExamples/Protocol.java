package protocol;

/**
 * Interface with constants as defined for group 4.
 */
public interface Protocol {

    // Client -> Server

    /**
     * Connect this client.
     * Example: <code>CONNECT stevejobs 01</code>
     * Or: <code>CONNECT hans</code>
     */
    public static final String CONNECT = "CONNECT %s %s";

    /**
     * Disconnect this client.
     */
    public static final String DISCONNECT = "DISCONNECT";

    /**
     * Readies this client.
     * Shouldn't be send when this client is already in this state.
     */
    public static final String READY = "GAME READY";

    /**
     * Unreadies this client.
     * Shouldn't be send when this client is already in this state
     */
    public static final String UNREADY = "GAME UNREADY";

    /**
     * Used to send move by a client.
     * Example: <code>GAME MOVE 2 1</code>
     */
    public static final String CLIENT_MOVE = "GAME MOVE %d %d";

    /**
     * Requests list of players on this server.
     */
    public static final String ASK_PLAYERS_ALL = "PLAYERS ALL";

    /**
     * Requests list of players with certain extensions.
     * Example: <code>PLAYERS 012</code>: Request players with extensions 0, 1 AND 2 installed.
     */
    public static final String ASK_PLAYERS_EXT = "PLAYERS %s";

    // All Server -> Client communication

    /**
     * Used to confirm connection. Can also contain server-supported extensions.
     */
    public static final String CONFIRM = "CONFIRM";

    /**
     * Inform client game will start.
     * LAST ARGUMENT CAN BE MULTIPLE NAMES!
     * Example: <code>GAME START bob peter</code>
     */
    public static final String START = "GAME START %s";

    /**
     * Broadcasted message announcing current move and future move (if applicable).
     * Example with future move: <code>GAME MOVE bob 2 0 hans</code> (Current move by bob at (2,0), next is hans).
     * Example without: <code>GAME MOVE hans 2 2</code> (Current move by hans at (2,2), this was final turn).
     */
    public static final String SERVER_MOVE = "GAME MOVE %s %d %d %s";

    /**
     * Broadcasted when game has ended in draw.
     */
    public static final String END_DRAW = "GAME END DRAW";

    /**
     * Broadcasted when game has ended in winner.
     * Example: <code>GAME END PLAYER hans</code>: hans has won the game.
     */
    public static final String END_WINNER = "GAME END PLAYER %s";

    /**
     * Result of player list query.
     * LAST ARGUMENTS CAN BE MULTIPLE NAMES.
     * Example: <code>PLAYERS ALL hans peter dirk tessa</code>: All players in this server are these.
     */
    public static final String RES_PLAYERS_ALL = "PLAYERS ALL %s";

    /**
     * Result of player list query with extension criteria.
     * LAST ARGUMENT CAN BE MULTIPLE NAMES.
     * Example: <code>PLAYERS 0 hans</code>: Of people on the server, only hans supports extension 0.
     */
    public static final String RES_PLAYERS_EXT =  "PLAYERS %s %s";

    public enum Error {
        // General errors
        INTERNAL_ERROR("000"),
        UNKNOWN_METHOD("010"),
        ILLEGAL_SYNTAX("011"),
        TIMEOUT("012"),
        EXTENSION_NOT_EXSISTING("020"),

        // Server errors
        ILLEGAL_MOVE("120"),
        PLAYER_DISCONNECT("110"),
        ILLEGAL_METHOD_USE("111"),
        USER_ALREADY_CONNECTED("190"),
        USER_NOSUPPORT_EXTENSION("191");

        public final String code;
        public Error(String code) {
            this.code = code;
        }
    }
}
