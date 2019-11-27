
## Getting started  
  
#### Java, Java SDK  
* version 8 or higher  
* [documentation](https://docs.oracle.com/javase/8/docs/)  
  
#### Maven  
* version: 3.5.*  or higher
* [documentation](http://maven.apache.org/guides/)  
  
#### All dependencies from POM.xml  
```sh  
$ mvn dependency:resolve  
```  

## Test run
* To execute all test, in command line type: 
```sh  
$ mvn test -Dgroups=TEST_CASES
```  
* To execute only chosen test, in command line type:   
```sh  
$  mvn -Dtest=TestCircle test
```  
  
## Documentation  
#### Javadoc:
* ##### generate Javadoc:
```sh  
$ mvn javadoc:javadoc  
```  
* generated in file: 
```target/site/apidocs/index.html```

#### Test Reports:  
* ##### turn on reports mode:
```sh  
$ mvn site -DgenerateReports=false  
```  
* ##### generate reports:
```sh  
$ mvn surefire-report:report-only 
```  
* generated in file: 
```target/site/surefire-report.html```