# Extension CHALLENGES

The CHALLENGES extension has the following format:

First Digit:

 - 0 Mandatory functionality
 - 1 Optional functionality

Second Digit:

 - 0 Mandatory if existent
 - 1 Optional if existent


#### Check extension support (001)

Checks whether the extension is supported

#### apply extension (010)

Applies and extention if and only if atleast 2 parties in one game support the extension

#### stop extension  (011)

Applies if and only if atleast 2 parties in one game support the extension and the party wants to implement a stop functionality

#### request game (011)

Requests a challenge on a name