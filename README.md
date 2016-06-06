# NoTTeX

##### NoTTeX is a customizable and lightweight typesetting system designed for intuitive use. NoTTeX .ntex files can be directly compiled to PDF.

## Quickstart

NoTTeX code consists of text, tags and functions.



### Functions:
NoTTeX functions are intended for dynamically generating content. Functions can have 0 or more parameters.

[Full list of builtin functions](https://github.com/NoTTeX/nottex/wiki/Builtin-Functions)

#### Using functions
Syntax:
```::<funcName>(<arguments>) ```
* ```<funcName>``` is the name of the function to be called
* ```<arguments>``` is a comma-delimited list of positional arguments; whitespace around the arguments is ignored

An argument can be 
* a valid numerical expression using operators ```+```, ```-```, ```*```, ```/``` and parentheses ```(```, ```)``` or
* a string contained in quotes, e.g. ```"4get TeX, the new thing now is NoTTeX"```



### Tags
Tags represent formatting rules for content inside the tags. There are builtin tags that currently enable some limited formatting. Tags can also be user-defined.

[Full list of builtin tags](https://github.com/NoTTeX/nottex/wiki/Builtin-Tags)

#### Using tags
Syntax:
```,,<tagNames>{<content>} ```
* ```<tagNames>``` is a comma-delimited list of tag names; whitespace around the tag names is ignored
* ```<content>``` is any content containing a mixture of text, tags and functions


#### Defining tags
Tags can be defined anywhere in the NoTTeX file using the ```::def(<tagName>, <styleCSS>)``` function. This will affect all tag uses regardless of their position relative to the definition. If a tag is defined multiple times, the last definition will always take effect in the whole document.

The ```::def(<tagName>, <styleCSS>)``` function must be provided with 2 string-type arguments:
* ```<tagName>``` - name of the defined tag
* ```<styleCSS>``` - CSS 2.1 rules delimited by ```;``` for styling the tag's content



### Text:
All characters are allowed except ```,,``` and ```::```. Some special unicode symbols may not be supported.
