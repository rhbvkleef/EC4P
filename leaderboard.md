# Extension LEADERBOARD

## Syntax definitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument


The LEADERBOARD extension has the following format:


## Client -> Server

### User

The user (LEADERBOARD USER) command requests a list of scores for the given user.

#### Syntax

`LEADERBOARD USER !user`

#### Examples

`LEADERBOARD USER hans`: Get leaderboard information for hans.

### All

The all (LEADERBOARD ALL) command lists all users and their scores

#### Syntax

`LEADERBOARD ALL`

## Server -> Client

### List

The list (LEADERBOARD LIST) command returns a list of users, and for each user a list of scores. The same syntax may be used when returning a single user in response to a client LEADERBOARD USER request.

#### Syntax

'LEADERBOARD LIST [!user ![scores]]'

#### Examples

`LEADERBOARD LIST hans 2 31 48 2 peter 81 71 48 1 1`

