# Extension LEADERBOARD

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument


The LEADERBOARD extension has the following format:


## Client -> Server

#### User

The user (LEADERBOARD USER) command requests a list of scores for the given user.

#### Syntax

'LEADERBOARD USER !user'

## Server -> Client

#### Request

The list (LEADERBOARD LIST) command returns a list of users, and for each user a list of scores. The same syntax may be used when returning a single user in response to a client LEADERBOARD USER request.

#### Syntax

'LEADERBOARD LIST [!user ![scores]]'

