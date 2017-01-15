# Extension CHALLENGES

## Syntax defenitions

- `!argument`: required
- `[arguments]`: list of arguments, __not__ space separated
- `[arguments\*]`: List of arguments, space separated
- `{argument|argument}`: Choice between arguments
- `<argument>` Optional argument


The CHALLENGES extension has the following format:


## Client -> Server

#### Message

global message to everyone on the current server

#### Syntax

'MESSAGE !{num | GLOBAL | GAME} !message': a global message to everyone on the server

#### Get

Requests a user (name)

#### Syntax

'USER !GET !name'


## Server -> Client

#### Request

Request an extention

#### Syntax

'MESSAGE { GLOBAL | GAME | num } !user !message'

#### User Num

sends user and extension

#### Syntax

'USER !num ![exts]'

#### User Specific

gets specific data user

#### Syntax

'USER !name !num !status ![exts]'

