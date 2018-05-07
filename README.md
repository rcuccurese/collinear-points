# Collinear points
Given a set of P feature points in the bidimensional plane, determine every line that contains at least N or more COLLINEAR points.

# Functionalities
This is a Maven project using Spring Boot 2.
The application exposes 4 REST API:

  - POST "/point" Body { "x" : .., "y": .. } - Adding a new point in the space
  - GET "/space" - Returning all points in the space
  - GET "/lines/{n}" - Get all line segments passing through at least N points.
  - DELETE "/space" - Remove all points from the space

# Installation
This is a standard Maven project with no specific requirement, after cloning the repo, just import the project in your IDE as Maven project and simply run CollinearPointsApplication.java.
The application will exposes its endpoints on localhost:8080 (Spring Boot default)

# Tests
I've written a test class to check the behaviour of the main data structure (see PlaneTest.java) which draws lines and handles the points in the space, there are also a couple of more tests LineTest and CollinearPointsServiceTest just to check the basic behaviour.
