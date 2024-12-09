name = "John"
greeting = "Hello"
call hello
exit

hello: procedure expose name greeting
say greeting name || "!"
return