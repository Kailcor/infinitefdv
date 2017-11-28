# infinitefdv
Repository for InfiniteFDV Test.
Project related to https://gist.github.com/nicopaez/511f730c68aff7ff651c39223e38763f.

To do the test just run "InfiniteTest.java"

For this simple project I was thinking about using Strategy Pattern to make the logic about "the plan" for rent (ByHour,Family,a new one, etc) easier to scale, separating the specific logic for rent plan, making possible to create new promotions without affecting the rest of the code, but the project was too small and with little complexity to use it, so instead I simple used Heritage from an abstract class (Rental) and separate the more specific logic  (as FamilyRent) in it's own class, then override the "rent" method from his parent.

The problem is not enough precise about Family Rental, when it's says "Anytype" of rent, it doesn't say if it can be combined (rent by hour, by day, etc) or if it's 3 to 5 of the same type. I let the code handle that posibility.


I used Java and JUnit for the the clases and Unit Test, also the names are written by Upper Camel Case, basic javadoc documentation and others common java conventions. 


