# Extension CHAT

## Syntax definitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument

## Client -> Server

### Message

The message (CHAT MESSAGE) command sends a message to a user or to a certain server group

#### Syntax

`CHAT MESSAGE !{GLOBAL | GAME | PRIVATE !name} !message`

#### Examples

`CHAT MESSAGE PRIVATE hans Hello`: The message "Hello" is sent to hans.

### User

The user (CHAT USER) command requests information about a specific user

#### Syntax

`CHAT USER !name`

#### Examples

`CHAT USER hans`: The client requests information about user hans.

## Server -> Client

### Message

The message (CHAT MESSAGE) command sends a chat message to a client. It also tells the client who sent it and in what kind of chat.

#### Syntax

`CHAT MESSAGE { GLOBAL | GAME | PRIVATE } !user !message`

#### Examples

`CHAT MESSAGE GOBAL hans Hello!`: User hans has sent the message hello in global chat

### User

The user (CHAT USER) command returns information about a specific user, like his status along with a list of extensions and his user number.

The status is a string: INGAME, ONLINE, OFFLINE, NOTFOUND, OTHER.

#### Syntax

`CHAT USER !name ![exts] !status`

#### Examples

`CHAT USER hans 012 ONLINE`: Hans has extensions 0, 1 and 2. He has the status ONLINE.

