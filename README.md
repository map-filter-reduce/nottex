# NoTTeX

##### NoTTeX is a open-source typesetting system designed for intuitive use for users who need a lightweight but powerful typesetting system.


## Quickstart

NoTTeX code consists of text, tags and functions.

#### Tags:
Tags are for text formatting. Basically they are CSS 2.1 rules that are applied for text inside tags. There are built-in tags and user defined tags. 

Tag use starts with ,, followed by list of tags separated by comma and ends with {} containing text (and/or tags and/or functions). Example: ,,tag1, tag2{text}

User defines tags with function ::def("tag_name","CSS"). Example: ::def("green","color:#008000;")

#### Functions:
NoTTeX functions are intended to dynamically generate output. For example create a timestamp. 




