# Examples

Format:

- &gt;: Client to server
- &lt;: Server to client

## No extensions

`
> CONNECT hans
< CONFIRM
> GAME READY
< GAME START peter hans
< GAME MOVE peter 0 1 hans
> GAME MOVE 1 1
...
< GAME END PLAYER hans
> DISCONNECT
`

## Challenging

`
> CONNECT hans 0
< CONFIRM 0
> PLAYERS 0
< PLAYERS 0 hans peter jack steve
> CHALLENGE REQUEST peter
< CHALLENGE DENY peter
> CHALLENGE REQUEST jack
< GAME START jack peter
...
< GAME END PLAYER jack
> DISCONNECT
`

## Chat

`
...
> CHAT MESSAGE GLOBAL Hello!
> CHAT USER GET hans
< CHAT USER hans 2 01 ONLINE
> CHAT MESSAGE 2 Hello!
< CHAT MESSAGE PRIVATE 2 Hello back!
...
`

## Leaderboard

`
...
> LEADERBOARD LIST
< LEADERBOARD LIST hans 0 5 2 4 peter 1 75 12 48
> LEADERBOARD USER hans
< LEADERBOARD LIST hans 0 5 2 4
`
