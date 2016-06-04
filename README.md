# NoTTeX

##### NoTTeX is a powerful open-source typesetting system designed for intuitive use for users who need a lightweight but powerful typesetting system that converts user input directly to PDF.


## Quickstart

NoTTeX code consists of text, tags and functions.

#### Tags:
Tags are for text formatting. Basically they are CSS 2.1 rules that are applied for text inside tags. There are built-in tags and user defined tags. 

Tag use starts with ,, followed by list of tags separated by comma and ends with {} containing text (and/or tags and/or functions). Example: ```,,red, justify{text}```

User defines tags with function ::def("tag_name","CSS"). Example: ```::def("green","color:#008000;")```

Currently built-in tags:
```
* h
* red
* blue
* justify
```
#### Functions:
NoTTeX functions are intended to dynamically generate output. For example create a timestamp or evaluate arithmetic expression.

Function argument can be string, function call or arithmetic expression. 
Function call starts with ::function name followed by (arg1,arg2,....,argn).

Example:  ```::eval(5+5)```

Currently built-in functions:
```
::eval(arithmetic expression)   - function evaluates arithmetic operations
::def("tag_name","CSS")         - function for user to define tags
::escape("fuction or tag call") - function for writing NoTTeX function and tag calls without actual call.
::timeStamp()                   - function for timestamp creation
```

#### Text:
Everything is allowed except ```,,``` and ```::```. Some unicode symbols are not supported and will not be inserted into the output PDF. 
