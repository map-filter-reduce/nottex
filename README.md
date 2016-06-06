# NoTTeX

##### NoTTeX is a customizable and lightweight typesetting system designed for intuitive use. NoTTeX .ntex files can be directly compiled to PDF.

## Quickstart

NoTTeX code consists of text, tags and functions.
WHUT INSIDE WHUT

### Tags
Tags represent formatting rules for content inside the tags. There are some builtin tags that currently enable some limited formatting. Tags can also be user-defined.

Syntax:
```,,tagNames{content} ```
* ```tagNames``` is a comma-delimited list of tag names; whitespace around the tag names is ignored
* ```content``` is any content containing a mixture of text, tags and functions


#### Defining tags
Tags can be defined anywhere in the NoTTeX file using the ```::def(tagName, styleCSS)``` function and will affect all tag uses regardless of their position relative to the definition. If a tag is defined multiple times, the last definition will always take effect in the whole document.

The ```::def(tagName, styleCSS)``` function must be provided with 2 string-type arguments:
* ```tagName``` - name of the defined tag
* ```styleCSS``` - CSS 2.1 rules delimited by ```;``` for styling the tag's content


Tag use starts with ```,```, followed by list of tags separated by ```,``` and ends with ```{}``` containing text (and/or tags and/or functions). Example: ```,,red, justify{text}```

User defines tags with function ```::def("tag_name","CSS")```. Example: ```::def("green","color:#008000;")```

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
Function call starts with ```::function_name``` followed by ```(arg1,arg2,....,argn)```.

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
