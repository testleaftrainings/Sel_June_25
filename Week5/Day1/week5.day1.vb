3:00 to 4:00 --->WebTable
4:00 to 4:20 --->BreakOut
4:20 to 5:00 --->WindowHandle
5:00 to 5:10 --->Break
5:10 to 6:00 --->Advanced User Interactions
6:00 to 6:15 --->Recap
types of webtable:
1)static-->no of rows and columns remains same(datas position may be changed)
2)dynamic----->no of rows and columns are changed

structue of webtable:

<table>
 <thead>
   <tr>---->tablerow
    <th>--->header info
    
    </th>
   
   </tr>
 </thead>

 <tbody>
  <tr>--->table row of the body
  <td>
  
  </td>---table data
  
  </tr>
 
 </tbody>

</table>
Window Handling:
What is a Window Handle?
A Window Handle is a unique identifier, a string, that Selenium WebDriver assigns to each open window or tab. It acts much like a unique address for a house, allowing WebDriver to navigate to and control a specific window.
Why Window Handles are Important
Web applications can open multiple windows or tabs.
To perform actions on elements within these windows, Selenium needs to know which window to interact with. - - Window handles enable this by providing a unique ID for each window.

How to Handle Windows
To handle windows, WebDriver provides two methods:
getWindowHandle(): Retrieves the ID of the current window.
getWindowHandles(): Retrieves a set of all open windows' IDs.
To switch to a different window, the syntax is driver.switchTo().window(windowHandle); where windowHandle is the unique identifier of the target window.

Handling Multiple Windows
Retrieve the set of window handles using driver.getWindowHandles().
Convert the set to a list to handle windows in a sequential manner.
Use the driver.switchTo().window(windowHandle) to switch control to the desired window.

After operations are completed, windows can be closed using driver.close(), and control can be switched back to the main window.
NoSuchWindowException:
NoSuchWindowException is an exception which signifies that the action you are trying to perform cannot be completed because the window or tab you are referencing no longer exists or is inaccessible. 