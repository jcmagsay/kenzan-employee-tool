# Employee Tool
This tool allows to manage users for an application with ease

## Dependencies
* Homebrew
https://docs.brew.sh/Installation

* MongoDB
https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/#install-mongodb-community-edition

* JDK 1.8+
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

* Gradle 4+
https://gradle.org/install/

## Running Locally
```sh
$ git clone https://github.com/jcmagsay/kenzan-employee-tool.git
$ cd kenzan-employee-tool
$ mongod

# In another tab
$ cd kenzan-employee-tool
$ gradle build bootRun
```
Your app should now be running on [localhost:8080](http://localhost:8080/).

## Using Endpoints
Endpoints are available for local development environment using postman:
https://www.getpostman.com/collections/a5c565a954989c660672


**Note: Some endpoints are dependent on data after records are entered into DB**


## Outstanding Features to be Developed
* Allow Flexibility in Endpoints
* Write Test for Endpoints
* Create better directory structure
* Ensure data types are proper for scalability
* Ensure endpoints cover all happy and unhappy paths
* Utility methods if necessary
* Webpack for UI build bundling
* Create React Application for UI
* [WIP] Spin up app on Heroku using Java and Gradle build packs with MongDB plugin
* Comment Code where necessary 

## Afterthoughts
* Gradle was a cool technology to use, but not sure it was the best choice
* Maven seems to be a better fit for web apps where Gradle is potentially better for building native apps
* IntelliJ IDEA seems to be the better IDE for Java development
* A Non-Relational database (MongoDB) was a good choice for the business requirements. It will also allow for a micro-service or server-less architecture in the future.
* Another choice considered for a non-relational db was DynamoDb

## Potential Issues

### MongoDB Related Issues
If `data/db` doesn't exist
```sh
$ cd kenzan-employee-tool
$ mkdir -p /data/db
$ mongod
```
If issues persist, this article should help:
https://stackoverflow.com/questions/26305279/dont-want-to-have-to-start-mongod-with-sudo-mongod
