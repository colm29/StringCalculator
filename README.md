# TDD String Calculator

### Requirements
Add the following functionality to the calcultor.  For each function I write a test first that fails - then write the code that makes it pass.

* Create a simple String calculator with a method int Add(string numbers)
* The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example "" or "1" or "1,2"
* Allow the Add method to handle an unknown amount of numbers
* Allow the Add method to handle new lines between numbers (instead of commas).
* The following input is ok: "1\n2,3" (will equal 6)
* Support different delimiters
* To change a delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ';' .
* The first line is optional. All existing scenarios should still be supported
* Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed. If there are multiple negatives, show all of them in the exception message stop here if you are a beginner.
* Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
* Delimiters can be of any length with the following format: "//[delimiter]\n" for example: "//[---]\n1---2---3" should return 6
* Allow multiple delimiters like this: "//[delim1][delim2]\n" for example "//[-][%]\n1-2%3" should return 6.
* Make sure you can also handle multiple delimiters with length longer than one char
