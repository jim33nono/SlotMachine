# Genesis Java Exam

## Purpose:

* Evaluate Java knowledge and skills of a candidate and good programming practices
* Evaluate the ability to understand documentation of java classes
* Evaluate the ability to implement logic out of requirements
* Evaluate the knowledge of a candidate on the usage of tools such as github

## Requirements:

*Objective:* Crerate a Slot Machine out of this library. The Slot Machine is 1 Liner with 3 reels. 

### R1. Reels Setup
The slot machine will have the following Reel setup.

| Reel 1 | Reel 2 | Reel 3 |
|--------|--------|--------|
|A | Z | A |
|B | Y | B |
|C | X | C |
|X | A | X |
|Y | B | Y |
|Z | C | Z |

### R2. Weights

Each symbol's name will have a corresponding weight. A weight determines the probability of symbol to hit the winning line. 


Here are the weights of each symbol name:

| Symbol Name | Symbol Weight |
|-------------|--------------|
| A | 1 |
| B | 1 |
| C | 1 |
| X | 2 |
| Y | 3 |
| Z | 4 |


### R3. Payout Calculation

If the resulting symbol combination of the spin is winning combination, the payout will be calcutated according to it's Bet Multiplier below:

| Winning Combination | Bet Multiplier |
|-------------|----------------|
| A,A,A | 20  |
| B,B,B | 20  |
| C,C,C | 20  |
| A,B,C | 30  |

Note:
Payout = Bet * Bet Multiplier.

There is no payout if the spin result is not a winning one.

## Instruction
1. Checkout this project and build using maven `mvn clean install`
2. You will need to create a project (use maven or gradle) with a depency to this project. example dependency: 
```
...
<dependency>  
  <groupId>gensesis.exam.java</groupId>  
  <artifactId>java-exam</artifactId>  
  <version>1.0</version>  
</dependency> 
...
```
3. Create a `com.genesis.exams.slot.SlotMachine` instance in your main class. 
	1. Use the reels setup defined from requirement R1. 
	2. To determine spin result, use the weight defined from requirement R2. Note that the heavier, the higher chance of the symbol to come out
	3. Evaluate the payout using the requirements from R3. 
	4. Your main class should invoke `spin` method of your `com.genesis.exams.slot.SlotMachine` instance with a bet amount of 100. You have to print the result of the spin.
4. Create a readme.md on how to compile/build and run your project
4. Nice to have: Add unit tests to your project.
5. Commit your project source to a public repository (ie: github, bitbucket) and send the link to your repository to genesis via email. Ask your genesis recruiter for the email.


For reference: Please see javadoc of the class `com.genesis.exams.slot.SlotMachine` and of its composition (ie: `com.genesis.exams.slot.Reel`, `com.genesis.exams.slot.Spinner`., etc)
