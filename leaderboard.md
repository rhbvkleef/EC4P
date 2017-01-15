# Extension LEADERBOARD

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument


The LEADERBOARD extension has the following format:


## Client -> Server

#### Request

Requests the leaderboard position

#### Syntax

'USER !user'


## Server -> Client

#### Request

Request an extention

#### Syntax

'LIST [!user ![scores]]'

