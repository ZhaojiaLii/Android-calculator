# Assignment 2: Simple Calculator

The first assignment was all about getting to know better basic widgets. Now this assignment will ask
you to manipulate a bit more Buttons and TextViews.

## Description of the App

In this assignment, you will mainly manipulate Buttons to create a simple calculator. This calculator
will display the following widgets:
- A TextView that displays the number being typed,
- 10 Buttons that represent digits from 0 to 9,
- A Button that represents the floating point,
- 4 Buttons that represent the four basic algebraic operations (addition, substraction, multiplication, division),
- A Button that evaluates or calculates an expression (represented by the "=" sign),
- A Button that changes the sign of the number displayed in the TextView,
- A Button that will evaluate and display the percentage of the number in the TextView,
- A Button that will clear the contents of the TextView.

You can base the design of your app on the figure displayed in the course notes.

## Detailed specifications
The following points must be implemented in your app:
1. Although the calculator can manipulate floating numbers, the evaluation of floating numbers does
not need to be exact.
2. All operations must be defined. In particular, dividing by 0 should be prohibited.
3. It is impossible to have multiple floating points inside a single number.
4. If the user presses the "=" button several times in a row, the calculator applies the same operation
on the displayed result. For example :
    - User wishes to evaluate 2 + 3
    - User presses "=", TextView displays 5
    - User presses "=" again, TextView displays 8 (because 5 + 3)
    - etc.
5. If the user presses several operation buttons in a row, the last button pressed will be used when
evaluating an expression.
6. It should be possible to chain operations. For example:
    - User wishes to evaluate 2 + 3
    - Without pressing "=", user directly presses "*" and TextView displays 5
    - User presses 4
    - Without pressing "=", user directly presses "-" and TextView displays 20
    - etc.
    

## Deadline for submission
Deadline: October 2 2018, 23:59

Lateness policy applies.
