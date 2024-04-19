### EXPLANATION
#### Launcher.java
- The _launcher_ class is the starting and executing point of the app. Make sure you run this class.
- In the launcher class there is the main method as the main thread of our app. The first line in this method simply calls the **invokeLater() method from swing utilities to run our app in an event dispatcher thread (*EDT*).
- This implementation makes sure the app doesn't run in different threads rather a single thread to avoid complications.
- Then inside the thread we are passing our runnable object to start executing our app thread.
- Finally, we call the show method from the main object to execute our app.

#### MainWindow.java
- First of all we create a JFrame window object to access its method and features.
- Inside the constructor we set the initial parameters for our app on its starting and operation behaviors.
- Finally, the show method is used to draw the frame on screen for us to see.

***Hope you find this information helpful***.