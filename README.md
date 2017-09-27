# SE254-A03
Assignment 3 for SOFTENG254

# Assignment 3

Modelling, Click Dummies and Software Processes

**Assignment Due: Sunday 8th October, 2017 @ 11.59pm**

This assignment is worth 5% of your overall mark.
Please hand in a **single ZIP file** containing all deliverables to the assignment dropbox before due
time. Failure to follow these instructions may result in your assignment not being marked!

## Question 1: Data Model (30%)

A new leasing company “Lease Right” have approached you to create a lease management system
software. They have given you the following description:

_The company “Lease Right” needs a program to manage their customers, equipment, repairs, lease
and employees. Customers have a name, contact number, email, address, organization/company and
optional credit card number. There are different kind of equipment: printer, desktop and laptops. All
equipment have a specifications, make and model. Each equipment which is owned by the leasing
company have Unique ID, equipment type, year and weight. Printers have type of pages, which it can
print (e.g. A1-A4) and print speed in pages per minutes (PPM). Desktop and laptops have operating
system (e.g. Windows 7, 10 and Ubuntu), display size and whether it is touch screen or not.
Furthermore, an equipment can be associated with a number of repairs. A repair contains description
of what has been repaired, the cost and the repair type. The rate of lease depend on type of equipment
and duration. Each equipment can be leased for either 1 week, 2 week, 4 weeks, 2 months, 4 months,
6 months and 12 months. A lease also have equipment, date of entry (date of booking), date of lease
start, duration, lease amount, security amount and additional conditions (if any). Employees who are
working at “Lease Right” have staff ID, name, address, email, contact number and IRD number which
is required for taxation of their salaries. Furthermore, a lease contains the equipment that was leased,
the customer that made the lease, the lease rate that was agreed upon and lease has a start and end
date._

**Draw an analysis model (** **_i.e._** **class diagram) for the system with the UMLet tool. Hand in the UMLet**
**_*.uxf_** **file, and a PDF showing the diagram (you can easily export UMLet diagrams to PDF).**

Remember: You may download the latest version of UMLet from here: [http://www.umlet.com/](http://www.umlet.com/)

If you’re working on a lab machine, unzip the downloaded plugin into C:\Users\<your
username\.eclipse\<some_long_eclipse_folder_name>\plugins. If you’re working on your own
machine, unzip it into the plugins directory directly in your eclipse folder.

UMLet also offers a standalone version of the program (i.e. not an Eclipse plugin) which is identical
in functionality and fine on personal machines.


## Question 2: User Interface Model (30%)

Lease Right have also given you the following requirements for the system’s user interface:

_“The lease management program should have an easy-to-use graphical user interface (GUI), which
should work similar to this: the main screen should let the user choose between general activities:
managing leases, managing equipment, managing customers and managing employees. Choosing
managing lease opens a new screen, which shows a list of all the recent leases and lets you add,
update, delete and search for a lease. The user can also go back to the main screen. The function for
adding a lease opens a screen where the user can set all relevant information for the new lease (e.g.
customer, equipment, ...). The user can confirm the new lease or cancel, and both lead back to the lease
management screen with an appropriate message. Lease can be deleted by choosing them in the list
and invoking the delete function, which asks for confirmation before deleting. The search function for
lease also opens a new window which lets the user enter a time period (i.e. a start and end date) and
other known details (e.g. customer, equipment, type, ... ) about the lease that the user is looking.
When the search is started, the found lease are shown in the list of the lease management screen.
Analogous to the screen for managing leases, there is a GUI for managing equipment, customers and
employees. When modifying a record, the old values are shown. The system refuses to accept a record
where the mandatory fields are left blank._

**Draw a screen diagram (paper prototype) for the user interface, then scan or photograph it. It is
allowable to decompose the diagram into several sub-diagrams, as long as it is clear how the sub-
diagrams fit together as a whole. Hand in a PNG, JPG, or PDF file showing the diagram.**

## Question 3: Click Dummy (30%)

Create a click dummy UI prototype for the leasing company with WindowBuilder (Java Swing) or
Scenebuilder (JavaFX) for Eclipse. The click dummy should be based on your screen diagram from
question 2. If there are case distinctions in the screen diagram ( _e.g._ when sometimes a system warning
is displayed and sometimes not), you only need to implement the common case. That is, when the
user activates a control the click dummy will always react in the same way. Make sure that your click
dummy compiles and runs without problems.

**Hand in the complete Eclipse project directory** **_(not the entire workspace, just the single Eclipse
project)_** **of the click dummy program.**

WindowBuilder:
Remember: Go to this link to find the Eclipse update site link for your Eclipse version:
https://eclipse.org/windowbuilder/download.php

Once you’ve got the link, open Eclipse and go to Help  Install New Software  Add... and paste the
update site link in the Location text field. Install (at least) all of “Swing Designer” and “WindowBuilder
Engine” except “WindowBuilder XML Core”. This process will work on your own machines as well as
the lab machines.


Scene-Builder:
Download Scene- builder executable jar file from following URL

[http://gluonhq.com/products/scene-builder/](http://gluonhq.com/products/scene-builder/)

On lab machine JavaFx code might not work. On way to make it work is to add access rule to Eclipse
project build path. Following are main steps for adding access rule:

Right click on project >Build Path> Configure Build path> Libraries tab > select “Access rules” as shown

Then click on Edit


Add new Access Rule “ javafx/**” as shown below and click OK.

After adding this access rule your JavaFX code will work.

## Question 4: Processes (10%)

Imagine that the lease management system is a real project. How can a software development process
make sure that the application will be of high quality? Briefly describe five concrete ways in which a
process can help (no more than 3 sentences for each of the five ways).

**Hand in your answer as a Word or PDF document.**

## Submission Instructions

Please submit all necessary files to the assignment dropbox **on or before 11.59pm, Sunday 8th
October, 2017**. The files should be submitted as a single zip file with the following file structure:

```
 <yourupi>.zip
o Q1 (folder)
 A single *.uxf file, and a single PDF file, representing your UML diagram.
o Q2 (folder)
 One or more PNG, JPG, or PDF files representing your screen diagram.
o Q3 (folder)
 The Eclipse project folder for your click dummy. You’ll know you’ve included
the correct folder as it will have a .classpath and .project file, and a src folder
in it (among other things).
o Q4 (folder)
 A single Word of PDF document containing your answer to question four.
```
Please adhere to this submission structure. **Failure to do so may result in your assignment not being
marked.**
