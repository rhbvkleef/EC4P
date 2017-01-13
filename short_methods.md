# Short method descriptions

Methods that are required to be implemented by the protocol, this does not include extensions.

## Documentation syntax description

This documentation uses non-standard syntax. It is described here.

- !argument is a required argument
- [arguments] is an array of arguments. These arguments are not space separated.
- [arguments\*] is an array of arguments. These arguments are space separated.
- {argument|argument} Choice between mltiple arguments.
- &lt;argument&gt; Optional argument

## Client -> Server

- CONNECT !name ![exts]
    - Must be sent immediately after establishing a connection
- DISCONNECT
    - Must be sent before disconnecting
- GAME
    - GAME READY
        - Allows this player to be assigned a random game by the server
    - GAM UNREADY
        - Disallows this player to be assigned a random game by the server
    - GAME MOVE !x !y
        - Signals the server to play a certain move. Z is automatcally derived.
- PLAYERS !{ALL|[exts]}
    - Lists players with the given extension(s) (or all players, given !ALL)
- ERROR !number
    - Signals the server an error has occured

## Server -> Client

- CONFIRM [exts]
    - Confirms a connect with the server. The server passes all extensions that both the client and the server support.
- GAME
    - GAME START ![players\*]
        - Signals the client that a game is started. The argument is a list in the order of which player plays. Extensions may extend this method to allow more than two players.
    - GAME MOVE !current !x !y &lt;next&gt;
        - This is a broadcast message. It lets everyone know a move has been made.
    - GAME END !{DRAW|PLAYER username}
        - This is a broadcast message. It lets everyone know that a game is ended and who has won.
- PLAYERS !{ALL|[exts]} [players\*]
    - Lists all players currently on the server (or those who support [exts])
- ERROR !code
    - Signals the client an error has occured.

## Error codes

### General errors
- Internal error
- Unknown method
- Illegal method syntax
- Timeout

### Server error codes
- Illegal move
- Player disconnect
- Illegal method use
- User already connected
