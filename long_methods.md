# Long method descriptions

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

`PLAYERS !{ALL|[exts]}`
