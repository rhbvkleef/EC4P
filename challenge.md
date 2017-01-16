# Extension CHALLENGES

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument


The CHALLENGES extension has the following format:


## Client -> Server

### Request

The request (CHALLENGE REQUEST) method requests a challenge with a specific player.

#### Syntax

 CHALLENGE REQUEST !name`

### Confirm

The confirm (CHALLENGE CONFIRM) confirms a challenge request. This requiest needs to have happened in order to confirm.

#### Syntax

`CHALLENGE CONFIRM !name`

### Deny

The deny (CHALLENGE DENY) method denies a challenge request.

#### Syntax

`CHALLENGE DENY !name`

## Server -> Client

### Request

The request (CHALLENGE REQUEST) method notifies the client a challenge request has been made.

#### Syntax

`CHALLENGE REQUEST !name`

### Deny

The deny (CHALLENGE DENY) method notifies the client that made a challenge request that the request was denied.

#### Syntax

`CHALLENGE DENY !name`

