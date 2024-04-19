### CREATING A JFRAME - LESSON 2
- To create a **jframe**, we can use either of 2 ways which can achieve the implementation.
- In this package we have 2 packages. The first package details the **inheritance** way of creating the jframe.The inheritance way is one of the simplest ways since it extends the JFrame class and uses its methods directly in the child class.
- Although it is the simplest, it is not one of the best ways to create a jframe since it exposes the inner methods of the JFrame class to the outside through its objects.This is very _bad practice_.
- The second package uses the **local object** way. This implementation hides out the JFrame methods to the outside since the class is not consuming any of the JFrame class features.
- We access methods through a local object inside  **initialize** method.Very _good practice_.

***Hope you find this information helpful***.