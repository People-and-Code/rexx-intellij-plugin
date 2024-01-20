::class 'DemoClass'
::attribute 'myField'
::method 'displayMyField'
say self~myField
demoObj = .DemoClass~new
demoObj~myField = "Hello, World!"
demoObj~displayMyField