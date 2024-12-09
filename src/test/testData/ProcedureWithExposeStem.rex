stem.name = "John"
stem.greeting = "Hello"
call hello
exit

hello: procedure expose stem.
say stem.greeting stem.name || "!"
return