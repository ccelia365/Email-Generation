# Email Generation

A company may have different types of customers including Business, Returning, Frequent, New and VIP. 
Since it needs to send customer specific emails to their customers, this application generates 
emails from a base template for the different types of customers. It auto-generates emails based 
on specific customer types.

This application is designed using the Factory method pattern. The factory method pattern provides 
an interface for creating objects but allows subclasses to decide the types of objects that will 
be created. The SimpleCustomerFactory can create various customers without knowing how to generate 
the customer specific emails. The creator is Factory, and the product is Customer. The concrete 
creator is the SimpleCustomerFactory, and the concrete products are Business, Returning, Frequent, 
New and VIP.

Since Factory method pattern is used, implementation is flexible. The customer class can be extended
to add new types of customers. Using an abstract class and extending the new customer allows for the 
creation of the customer specific email. Different customer objects can also be created at runtime. 
This design pattern has reduced the amount of duplicated code. Each overridden method 
is unique to its class.

The Object-oriented design of this application allows the implementation to be simple and easily 
understood. Ex: The SimpleCustomerFactory creates a customer.  But it does not know how the customer 
specific email will be generated. Although each customer has some attributes in common, their 
differences will be unique to their own class. 

Repo: https://github.com/ccelia365?tab=repositories
  

# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




