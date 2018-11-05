# Employee Tool

This tool allows to manage users for an application with ease

The tool is viewable at: http://

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
$ gradle tasks --all
$ ./gradlew stage
$ heroku local web
```

Your app should now be running on [localhost:5000](http://localhost:8080/).

If you're going to use a database, ensure you have a local `.env` file that reads something like this:

```
DATABASE_URL=postgres://localhost:5432/gradle_database_name
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
