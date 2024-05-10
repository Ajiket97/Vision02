Feature: Register name page
#Scenario: Step parameterization
#Given i have tow nymber 5 and 6
#When i add them
#Then print result


#Scenario: Step parameterixation with string and word
#Given i have a string "hello testinf Shastra"
#Given i have a word "hi"


Scenario: passing list to step defination
Given i have folling list:
|"orange"|
|"mango"|
|"apple"|
|"peach"|



Scenario Outline: This is my first data driven test case
Given i have <quantity> <fruits>
Examples:
|quantity|fruits|
|"orange"|9|
|"mango"|8|
|"apple"|5|
|"peach"|2|

