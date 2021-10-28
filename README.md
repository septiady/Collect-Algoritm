# Build Algoritm v1.0
All function algoritm implemented with Java

## How to use it?
1. Open the <b>`Android Studio IDE`</b> App
2. Open package <b>`id.septiyadi.buildalgoritma (test)`</b>
3. Then open the collection file you want to test and see the output

## Implemented Algorithm Collection
Below is a collection that we have created and can / friends use on some of the code blocks of the program that you are making

### 1. <b>`Get Date Today`</b>
Get date and time

@`TimeAndDate.java` > `getTodayDate`

```.java
@Test
public void getTodayDate() {
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date today = new Date();
    String todayTime = format.format(today);

    System.out.print(todayTime);
}
```
Output
```.txt
28/10/2021 05:23:36
```
