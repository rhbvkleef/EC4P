# Errors

Erros have the following format:

First digit:

- 0 General error
- 1 Server error
- 2 Client error

Second digit:

- 0 Internal and general errors
- 1 Networking and communications errors
- 2 Game errors
- 9 Other

The third digit is used as an identifier.

## General errors

General errors are in the domain: 0xx. Preceding zero's are required.

### Internal error (000)

Signals something has gone wrong that cannot be identified immediately. This usually means there has been an oversight in development. When this error is sent, the remote may assume the last command didn't go through.

### Unknown method (010)

A request/response has been sent which has not been recognised. When this error is sent, the remote may assume the last command didn't go through.

### Illegal method syntax  (011)

The syntax of the sent method is not correct. When this error is sent, the remote may assume the last command didn't go through.

### Timeout (012)

The remote didn't respond in time.

## Server errors

Server erros are in the domain: 1xx. Preceding zero's are required.

### Illegal move (120)

The move that was attempted is not possible.

### Player disconnect (110)

A remote player has disconnected, the game has ended.

### Illegal method use (111)

The use of this method is not allowed at this moment.

### User already connected (190)

A user with the same name is already connected.
