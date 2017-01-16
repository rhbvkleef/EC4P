# Extension CHALLENGES

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument

## Client -> Server

### Request

The request (CHALLENGE REQUEST) method requests a challenge with a specific player.

#### Syntax

 CHALLENGE REQUEST !name`

#### Examples

`CHALLENGE REQUEST bob`: Requests a challenge with bob.

### Confirm

The confirm (CHALLENGE CONFIRM) confirms a challenge request. This requiest needs to have happened in order to confirm.

#### Syntax

`CHALLENGE CONFIRM !name`

#### Examples

`CHALLENGE CONFIRM peter`: Confirms the client wishes to accept the challenge from peter

### Deny

The deny (CHALLENGE DENY) method denies a challenge request.

#### Syntax

`CHALLENGE DENY !name`

#### Examples

`CHALLENGE DENY hans`: The client wishes not to play with hans.

## Server -> Client

### Request

The request (CHALLENGE REQUEST) method notifies the client a challenge request has been made.

#### Syntax

`CHALLENGE REQUEST !name`

#### Examples

 CHALLENGE REQUEST peter`: Peter has requested to start a game with to whomever this message is sent.

### Deny

The deny (CHALLENGE DENY) method notifies the client that made a challenge request that the request was denied.

#### Syntax

`CHALLENGE DENY !name`

#### Examples

`CHALLENGE DENY hans`: Hans denied playing with the person to whomever this message is sent.
