# Lab Activity #1 - DFA String Acceptance Checker

**Objective:**  Implement a DFA that accepts binary strings ending with 01.

**Instructions:** 
1. Write a Java program that takes a binary string as input.
2. Simulate the DFA and print whether the string is accepted or rejected.

## Program Output
Input: `1101` → **Accepted**  
Input: `1110` → **Rejected**  
<br>
Both results show that the DFA accepts strings ending with `01`.

<br>

![Screenshot 2025-11-01 173346](https://github.com/user-attachments/assets/1aa9c594-0a3c-4caa-87cd-57ca69d57e9a)
![Screenshot 2025-11-01 173406](https://github.com/user-attachments/assets/58da426d-c12f-415f-989d-b0be2b74bffb)

***
# Lab Activity #2 - NFA Simulation (Multiple Next States)

**Objective:** Build an NFA simulator for strings containing ab as a substring.

**Instructions:** 
1. Represent the NFA using a map: state -> (symbol -> set of next states).
2. Accept strings that contain the substring "ab".
3. Use recursion or queue to explore multiple transitions.

## Example Input/Output

**Input:** `aab` 
<br>
**Output:** Accepted  

**Input:** `bbaa` 
<br>
**Output:** Rejected

<br>

![Screenshot 2025-11-01 173335](https://github.com/user-attachments/assets/b391e7b9-9eba-4030-9ca5-a46fa05d2cba)
![Screenshot 2025-11-01 180111](https://github.com/user-attachments/assets/434f9477-3c1e-4cba-90a4-22962fa16efd)
