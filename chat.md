# Extension CHAT

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument

## Client -> Server

### Message

The message (CHAT MESSAGE) command sends a message to a user or to a certain server group

#### Syntax

`CHAT MESSAGE !{num | GLOBAL | GAME} !message`

### User

The user (CHAT USER) command requests information about a specific user

#### Syntax

`CHAT USER !GET !name`

## Server -> Client

### Message

The message (CHAT MESSAGE) command sends a chat message to a client. It also tells the client who sent it and in what kind of chat.

#### Syntax

`CHAT MESSAGE { GLOBAL | GAME | PRIVATE } !user !message`

#### User

The user (CHAT USER) command returns information about a specific user, like his status along with a list of extensions and his user number.

The status is a string: INGAME, ONLINE, OFFLINE, NOTFOUND, OTHER.

#### Syntax

`CHAT USER !num ![exts] !status`

