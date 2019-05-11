# Mutation_Source_Code_Testing

This project was done as part of our Software Testing course.

-----------------
Team Members:

1. Duvvuru Nithish - IMT2014016
2. Pericherla Seetarama Raju - IMT2014038
-----------------
Project Directory Structure:

1. "Screenshots" folder - Screenshots of Mutant generation summary and Mutation result for each class/file
2. "Terminal_Outputs" folder - Terminal output of the Mutation result for each class/file
3. "Source_Code" folder - Java Source code
4. "Source_Code_Documentation.pdf" file - Documentation explaining the source code
5. "Mutation_Testing_Output" folder - Contains the source code and the mutated code generated for each class/file
-----------------
About the Source code:

In the project, we are implementing the interpreter similar to that of the Python interpreter that does some of the basic Arithmetic operations (Addition, Subtraction, Multiplication, Division and Negation) where the input is given in the form of expressions involving numerics or variables.

NOTE - This source code was written during the Java course by Seetarama Raju's team (Team Members - Seetarama Raju, Kb.Shyam, Armitha, Aditya). We used the code directly and made modifications to the source code to fit the test driven environment. We also wrote the complete documentation for the source code.

The relevant files of the source code are present in the "Source_Code" folder and the project documentation is provided in the "Source_Code_Documentation.pdf" file.

The "Source_Code" folder contains a folder called "myinterpreter" which is the package that combines all the source code files and the source code files are present in the "myinterpreter" folder.

The interpreter code can work for both single input (A string containing the expression to be evaluated is given in the inputType variable in main function of the Interpereter.py file) and continuous interactive input from terminal.

For testing purposes, we have used the single input format.
-----------------
Execution of Source code:

1. Navigate to "Source_Code" folder.
2. For single input, the inputType variable in main function of the Interpereter.py file should be set to a string containing the expression to be evaluated.
3. For continuous interactive input from terminal, the inputType variable in main function of the Interpereter.py file should be set to "Continuous"
4. From inside the "Source_Code" folder, execute "javac myinterpreter/*.java"
5. From inside the "Source_Code" folder, execute "java myinterpreter/Interpreter"
6. If single input is executed, the result will be shown in the terminal.
7. If continuous interactive input is executed, the terminal will show ">>>" which means the user can start giving expressions in the terminal to be executed. (To stop, enter "exit" or "stop")
-----------------
Test case strategy used and Designed unit test cases:

Keeping in mind all the corner cases where the method will pass/fail, we designed the test cases accordingly.

For every method in each class, we designed test cases. We used JUnit for unit testing. The respective Unit Test file for each file is named after the file name itself. (Example unit test file for BackEnd.java is named as BackEndTest.java)
-----------------
Execution of unit test cases:

For execution of the unit test cases, we used Eclipse (Eclipse IDE for Java Developers - Version: 2018-09 (4.9.0)).

1. Load the source code files into Eclipse.
2. Right click the unit test file to be run.
3. Select option - "Run As -> JUnit test"
4. The result will be shown in a seperate console.
-----------------
Open source testing tool used:

MuJava - https://cs.gmu.edu/~offutt/mujava/

We explored other Mutation testing tools such as PITest (http://pitest.org) and also the eclipse plugin version of mujava (MuClipse). But we found MuJava to be better than these tools in terms of simplicity of usage and results generation.
-----------------
Testing procedure and testing tool executable files:

The whole testing procedure has been clearly explained on MuJava's website (https://cs.gmu.edu/~offutt/mujava/) and we followed it step-by-step. The required executable/jar files and and setup has been provided in the website itself.
-----------------
Mutation operators used:

MuJava provides both class level and method level operators. Since, our project is "Mutation-source-code", we have used the method level operators provided by MuJava. We all the 19 method level operators provided by MuJava for testing all the files except EvaluateString.java dn BackEnd.java (Since these 2 files are generating many mutants and while testing the mutants, we have faced memory heap issues). For EvaluateString.java dn BackEnd.java files, we have used the operators - {AORS (Arithmetic Operator Replacement), AOIU (Arithmetic Operator Insertion), AODS (Arithmetic Operator Deletion), COR (Conditional Operator Replacement), COD (Conditional Operator Deletion), COI (Conditional Operator Insertion), LOI (Logical Operator Insertion), VDL (Variable DeLetion)}

Information on all these method level operators is given at https://cs.gmu.edu/~offutt/mujava/mutopsMethod.pdf
-----------------
Results:

Using the MuJava tool, we generated the mutants for the files/classes - {BackEnd, Variable, PException, NVException, IVSTException, Intepreter, ICException, FrontEnd, EvaluateString, DZException, CNTASGNException}. The "Mutation_Testing_Output" folder contains the source code and the mutated code generated for each class/file. For each class/file, 3 folders are generated - {traditional_mutants, class_mutants, original}. "traditional_mutants" (mutated code) and "original"(original code) folders are the required folders. We have used the method level operators provided by MuJava.

Once the mutants were generated, mutation testing on them was done using the MuJava tool and the output is shown on the MuJava GUI and terminal (Screenshots of output on GUI for each class/file provided in "Screenshots" folder and terminal outputs for each class/file provided in "Terminal_Outputs" folder)

The mutation scores are:

BackEnd - 84%
Variable - 66%
PException - 50%
NVException - 51%
IVSTException - 50%
Intepreter - 100%
ICException - 50%
FrontEnd - 33%
EvaluateString - 76%
DZException - 50%
CNTASGNException - 50%
