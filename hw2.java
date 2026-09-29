import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class hw2 {
    /**
     * Name: Stanley Ihunyere
     * Programming Language: Java
     *  IDE / Editer: Visual Studio Code  
     */
    
    // Part 2 - ADT Questions
    /** Q1. What does ADT stand for?
     *  Answer: Abstract Data Type
     *  
     * Q2. WIn your own words, what is an Abstract Data type?
     * Answer: An abstract data type is a data type that is defined by its behavior
     * 
     * Q3. What is the difference between ADT and its implementation?
     * Answer: An ADT is the conceptual model of a data structer. it 
     * defines the rules and behavior of the data structure. It focuses
     * on what it does, not how it works. The implementation of an ADT is
     * the actualy code, it brings the ADT to life, it focuses on how it is 
     * Stored and execued efficiently.
     * 
     * Q4: Can two programmers create different implementations of the same ADT?
     * Answer: Yes, since an ADT only defines the behavior and rules of a data structure, 
     * different programmers can create different implementations of the same ADT. 
     * Each implementation may have its own unique approach to storing and manipulating the data.
     *  
     * Q5 : If one programmer creates a Stack using an array and another creates a Stack
     * using a linked list, are both still Stacks? Explain why.
     * Answer: Yes, as long as they follow the rules and behavior of a ADT, both would be a Stack.
     * 
     */

    // Part 4 - Required Stack operations
    // Create your own Stack

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();
        System.out.println("STACK DEMOSTRATION \n");
        System.out.println("Adding: \n" );
        int numbers [] = {15, 25, 35, 45, 55};
        for (int num : numbers) {
          //  intStack.push(num);
            System.out.println(num);
            System.out.println();
        }
        intStack.push(15);
        intStack.push(25);
        intStack.push(35);
        intStack.push(45);
        intStack.push(55);


        System.out.println("Top item: \n" +intStack.peek()); // peek method tells you the number on top of the stack
        System.out.println("Removing: \n" + intStack.pop());  // displays the value removed (55)
        System.out.println("Removing: \n" + intStack.pop()); //  displays the value removed (45)
        System.out.println("New top: \n"  + intStack.peek()); // displays the value on top of the stack (35) now

        System.out.println("Is Stack empty? \n" + intStack.isEmpty()); // false since the stack ain't empty
    }

    // Part 8 - Stack Questions
    /**
     * Q6: What does LIFO mean?
     * Answer: Last in first out 
     * 
     * Q7: Why did 55 get removed before 15?
     * Answer: 55 was removed before 15 because in a Stack Data Structure
     * the last number added in the stack gets removed first, which follows
     * LIFO
     * 
     * Q8: If the Stack contains
     *          A
     * 
     *          B
     * 
     *          C
     * 
     *          D
     * and D was added last, which item should pop() remove first?
     * Answer: D will be removed first and displayed, since it was added last.
     * 
     *  Q9: Give one real-world or software example where a Stack could be useful.
     *      
     *      Examples discuessed in class may include:
     *      Browser Back history
     *      Undo operations
     *      Function calls
     * 
     * Example: Undo Operations
     *  When you type a word, delete a sentence or formatt a text the application
     *  records that actions and puts it in a hidden "history Stack". Ctrl + Z
     * 
     *  This feature related to the Stack Data Structure because it relies entirely on LIFO.
     *  The very last change you made is always the one you want to take back. A Stack keeps
     *  your latest actions at the top while burying your older actions at the bottom
     */

}
class Queues {

    public static void main(String[] args) {
        
        Queue<Integer> myQueue = new LinkedList<>();
        // add = enqueue, offer(), add to the front
        // remove = dequeue(), remove from back
        // peek() = examines the head and returns it 

        int[] numbers = {15, 25, 35, 45, 55};

        System.out.println("QUEUE DEMONSTRATION");
        System.out.println("Adding: \n");

        for (int num : numbers) {
          //  myQueue.offer(num);
            System.out.println(num);
            System.out.println();
        }

        myQueue.offer(15);
        myQueue.offer(25);
        myQueue.offer(35);
        myQueue.offer(45);
        myQueue.offer(55);

        System.out.println("Front item: \n" + myQueue.peek() + "\n"); // should display 15
        System.out.println("Removing: \n" + myQueue.poll() + "\n"); // should display 15 and removes it 
        System.out.println("Removing: \n" + myQueue.poll() + "\n"); // displays 25 and removes it 
        System.out.println("New front: \n" + myQueue.peek() + "\n"); // displays 35
        System.out.println("Is Queue empty? \n" + myQueue.isEmpty() + "\n"); // false because 55 is still there


        System.out.println(myQueue.size()); // 45 and 55 left

    }
}

/**********
 * Part 14 -- Queue Questions
 * Q10: What does FIFO mean?
 * Answer: First in, First out.
 * 
 * Q11: Why was 15 removed before 55?
 * 15 was removed before 55 because queues follow FIFO Structure. 
 * Since 15 was added as the first element of the queue, it's the 
 * first to be processed and removed when myQueue.poll(); was called.
 * 
 * Q12
 * If customers enter a line in this order:

    Alex

    Maria

    John

    Sarah

    who should leave the Queue first?

    Answer: Alex, since it's first in, first out

    Q13: Give one real-world or software example of where a Queue is useful.

    Anwer: An example would be people waiting in line, if someone joins a line
    they walk to the back of the line behind everyone else. It's like adding a
    item to the tail (Enqueue add() and offer() methods).

    The person standing at the very fron of the line is next to be served.
    If a cashier wants to check who is next without serving them yet, they look
    at who's at the front of the line. Waiting at the front (Peek() method).

    When a cashier is ready, the person at the front is served and leaves the line.
    Instantly, the person right behind steps up to be served, they become the new person
    at the front of the line. In code it removes the front items and shifts the Queue forward
    (Dequeue/poll() method).

    Part 15 - Stack vs Queue
 * 
    Scenario 1 — Undo Feature
    A text editor remembers your recent actions.

    If you type:

    A

    B

    C

    the most recent action should be undone first.

    Stack or Queue?

    Explain.

    Answer: A Stack because the last action that is done will be the first one undone.
    In this case it will be the letter C since it was the last thing added to the Stack.
    When you hit undo C is the first that's remove than B and A.


    Scenario 2 — Printer
    Three students send documents to a printer.

    The first document submitted should normally print first.

    Stack or Queue?

    Explain.

    Answer: Queue, Since a Queue Data Structure follows first in first out, 
    if three people are trying to send documents to a printer; the printer
    won't print them all at the same time, it places it into a Queue and the
    document that was sent first will be the first one printed, follow by the 
    second one, third one..etc.


    Scenario 3 — Browser Back Button
    You visit:

    Google

    YouTube

    GitHub

    Amazon

    You click the Back button.

    Which page should appear first?

    What ADT does this resemble?

    Answer: This resembles a Stack ADT, since the sites are stacked up
    the most recent one (Amazon) will appear first, since a Stack follows
    a Last in, first out format.

    Scenario 4 — Customer Service
    Customers are waiting to talk to an employee.

    The person who arrived first should normally be helped first.

    Stack or Queue?

    Answer: Queue because it follows First in, First out formatt.


    Scenario 5 — Plates
    You place five plates on top of one another.

    Which ADT does this represent?

    Explain.

    Answer: Stack because you can only take the plate at the top of the stack off
    if you tried to take it from the bottom you risk breaking all of them, Therefore
    it should follow a LIFO format of last in first out, first out being the top plate 
    being removed first.


    Part 16 — Predict the Output
    Do not run the following examples until after you write your answers.
    Stack
    Start with an empty Stack.

    push(7) -> 7

    push(12) -> 12

    push(18) -> 18

    pop() -> displays 18 and removes it

    push(22) -> 22

    peek() -> 22
    Question 14
    What does pop() return?
    Answer: 18, then removes it from the stack after

    Question 15
    What does the final peek() return?
    Answer: 22



    Queue
    Start with an empty Queue.

    enqueue(7) -> 7

    enqueue(12) -> 7 12

    enqueue(18) -> 7 12 18

    dequeue() -> 12 18

    enqueue(22) -> 12 18 22

    peek() -> 12

    Question 16
    What does dequeue() return?
    Answer: Displays 7 and removes it 

    Question 17
    What does the final peek() return?
    Answer: 12, it returns the head of the Queue


    Part 17 - Compare the ADTs
    Complete the table.


    Feature             |  Stack                     |  Queue          
    Rule                |  LIFO (Last in, First out) |  FIFO (First In, First Out)
    Add operation       |  push(item)                |  add(item) or offer(item)/enqueue
    Remove operation.   |  pop()                     |  poll() or remove()/dequeue()
    View next item      |  peek()                    |  peek() (views the front)
    First item removed  |  The most recent item      |  The oldest item, earliest added (first in line)



    Part 18 — Connect the ADT to the Implementation

    Answer the following.

    Question 18
    If you implement a Stack using an array, which part is the ADT?

    Answer: The Stack is the ADT, it's the set of rules and behaviors.
    

    Question 19
    Which part is the implementation?

    Answer: The array is the built in Data Structure that is used to make the Stack.
    I The programmer use the array to build my Stack and hold the items.


    Question 20
    If you replace the array with a linked list but keep the same Stack operations, did the ADT change?

    Explain.

    Answer: No, The ADT does not change, it doesn't matter if you use a Array or a LinkedList to
    build a Stack, as long as it adheres to the rules of LIFO and its operations push, pop, and peek.
    Whether those elements are stored in an array or linkedList does not matter. Only the implementation
    changed, not the Abstract Data Type.
 */