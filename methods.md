# Long method descriptions

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument

## Client -> Server

### Connect

The connect (CONNECT) method signals the server whom is connecting and what extensions the client supports. A request with this method must be sent immediately after establishing a connection with the server.

#### Syntax

`CONNECT !name ![exts]`

#### Examples

`CONNECT stevejobs 01`: The client is called stevejobs and supports extensions 0 and 1.

`CONNECT hans`: The client is called hans, and supports no extensions.

#### Errors

The server is allowed to send a timeout error if the server decides the CONNECT method is not called in time.

### Disconnect

The disconnect (DISCONNECT) method signals the server that the client will close the current socket. This command is mandatory, however upon TCP timeout, the socket can be closed too.

#### Syntax

`DISCONNECT`

### Game ready

The game ready (GAME READY) method signals the server the client is ready to accept a random game to be assigned. The server is not required to respond immediately after this method.

#### Syntax

`GAME READY`

#### Errors

Illegal method use: The server is allowed to send this command if the client is ready already.

### Game unready

The game unready (GAME UNREADY) method signals the server that the client may not be assigned a random game anymore.

#### Syntax

`GAME UNREADY`
    
### Game move

The game move (GAME MOVE) method may only be called while the client is in a game and it is his turn. This command tells the server the X and Y coordinates he wishes a playpiece may be placed. These coordinates, in the minimum implementation of this protocol, range from 0-3. The Z-coordinate is derived automattically by the state of the board.

#### Syntax

`GAME MOVE !x !y`

#### Examples

`GAME MOVE 0 2`: Lets the server know it must attempt to place a piece at (0, 2)

`GAME MOVE 2 1`: Lets the server know it must attempt to place a piece at (2, 1)

#### Errors

Illegal move: The player has made a move at a moment it is not allowed to or at a position it is not allowed to.

Illegal method syntax: Either one or both coordinates are missing.

### Players

The players (PLAYERS) command requests the server to list all players or the players with the supplied extensions.

#### Syntax

`PLAYERS !{ALL|[exts]}

#### Examples

`PLAYERS ALL`: Lists all players currently connected

`PLAYERS 02`: Lists all players with extension 0 and 2 installed.

#### Errors

Illegal method syntax: The parameter is missing

### Error

The error (ERROR) command is used to communicate errors. See the chapter describing errors and error codes for more information.

#### Syntax

`ERROR !error`

## Server -> Client

### Confirm

The confirm (CONFIRM) command is used to confirm a connection. It also tells the client which extensions the server supports.

#### Syntax

`CONFIRM <[exts]>`

#### Examples

`CONFIRM 012`: Tells the client the extensions it supports are 0, 1 and 2. Also confirms a connection.

`CONFIRM`: Tells the client it supports no extensions. It does confirm a successful connection.

### Game start

The game start (GAME START) command is used to inform the client a game will start. It lists all players in the game in order of whom goes first and whom goes second.

#### Syntax

`GAME START ![players\*]`

#### Examples

`GAME START bob peter`: A game starts, bob is first, peter is second.

### Game move

The game move (GAME MOVE) command is a broadcast command that lets every player know a move has been made, by whom it was made and which coordinates it was made at. It also signals the next player (if there is one).

#### Syntax

`GAME MOVE !current !x !y <next>`

#### Examples

`GAME MOVE bob 2 0 hans`: Bob has made a move at (2, 0) it is Hans' turn now.

`GAME MOVE hans 2 2`: Hans has made a move at (2, 2) and it is the final move of this game.

### Game end

The game end (GAME END) command is used to signal the end of the game, along with whom has won.

#### Syntax

`GAME END !{DRAW|PLAYER !username}`

#### Examples

`GAME END PLAYER hans`: Hans has won the game

`GAME END DRAW`: The game ended in a draw

### Players

The players (PLAYERS) command is used as a response to the clients players (PLAYERS) command. It contains a list of all players that match the given criteria.

#### Syntax

`PLAYERS !{ALL|[exts]} [players\*]`

#### Examples

`PLAYERS ALL hans peter dirk jan`: All the players on this server are hans, peter, dirk and jan.

`PLAYERS 0 hans`: Hans is the only player who supports extension 0.

### Error

The error (ERROR) command signals a server error. More information can be found in the errors section.

#### Syntax

`ERROR !code`

