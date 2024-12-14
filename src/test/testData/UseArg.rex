#! /usr/bin/env rexx
call greet "John"
exit
greet: procedure
use arg user
say "hello" user
return