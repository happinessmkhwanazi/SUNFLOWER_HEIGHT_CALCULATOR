# SUNFLOWER_HEIGHT_CALCULATOR
This Java program, named "Sunflower.java", is designed to solve a problem where a sunflower plant grows each day by a certain height determined by a mathematical function.
The objective is to find the minimum initial height required for the sunflower to reach a specific height within a given number of days.<br>

Growth rate :<br>

H<sub>i+1</sub> = H<sub>i</sub> + Math.floor(Math.sqrt(H<sub>i</sub>)) <br>

The program employs a binary search algorithm to find the minimum initial height.
It iteratively narrows down the search range by evaluating the result of a mathematical function for each midpoint.
The mathematical function calculates the height of the sunflower plant on each day based on the initial height and the square root of the current height.
The program adjusts the search boundaries based on whether the calculated height meets the required height to win.
Once the binary search converges, the program outputs the minimum initial height required. <br>

The function takes two parameters: "height" (initial height of the sunflower) and "n" (number of days). It calculates the height of the sunflower on each day based on the formula: height + Math.floor(Math.sqrt(height)). The calculated heights for each day are stored in an array.
Finally, the method returns the height of the sunflower on the last day.
