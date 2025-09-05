# Sorting Algorithm Visualizer (Like you saw on YouTube 😉)




Damn I was bored and wanted to make something, so I made this sorting algo visualizer like I saw on youTube lol. 

![Screen shot](https://raw.githubusercontent.com/Sidd0OP/SortVizualizer/refs/heads/master/ss.png)



Its not maven or Gradle simple eclipse project, to write your own sorting algo and see it working do this 👉



## Clone this repository 
```bash
git clone https://github.com/Sidd0OP/SortVizualizer.git
```
 -  Create a Class of for your algo in the ```sort``` package.
- Extend the ```Sort``` class, example ```public  class DumbSort extends Sort```

### Override the sort method and write your own sorting algo inside it

```java
public  void sortFunction()
{
	//your sorting logic goes here

}
```
### Put this piece of code at every for-while loop inside your sort function for the delay (Me too lazy to create a method for this 😁)

```java
try {
	Thread.sleep(1);
} catch (InterruptedException e) {
	Thread.currentThread().interrupt();
	return;
}
```
### Create the object in canvas , name it something ig
```java
                            //xPos , yPos , name
CountSort cSort = new CountSort(1,1 , "Count");

//put this inside the initializeSorts() method
cSort.initializeList(ARRAY_LENGTH);

//put this inside the paintComponent(Graphics g) method
cSort.draw(graphic2D);
```

I did not make the red moving thingy and the  green hulk moment at the end. Simple to implement, me lazy 😎









