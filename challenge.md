# Extension CHALLENGES

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument


The CHALLENGES extension has the following format:


## Client -> Server

#### Request

Request an extention

#### Syntax

'REQUEST !exts_name !name': requires extension name and name of the player


#### Confirm

Confirms a request

#### Syntax

'CONFIRM !exts_name !name': confirms player has this specific extension

#### Deny

Denies a request

#### Syntax

'DENY !exts_name !name': denies player has this specific extension



## Server -> Client

#### Request

Request an extention

#### Syntax

'REQUEST !name !exts_name': process request

#### Confirm

Confirms a request

#### Syntax

'CONFIRM !exts_name !name': process aceptation

#### Deny

Denies a request

#### Syntax

'DENY !exts_name !name': process deny

