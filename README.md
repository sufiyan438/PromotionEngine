This project deals with the implementation of a Promotion Engine where discounts based on bulk purchasing of same type of item or combo discount based on different items is applied. For instance:

Unit price for SKU's
A: 50
B: 30
C: 20
D: 15

Active Promotions
3 of A's for 130
2 of B'S for 45
C & D for 30

Scenario
A 3 -> 130
B 5 -> 45 + 45 + 30 -> 120
C 1 -> C & D for 30
D 1 -> C & D for 30 -> 30
Total -> 280

The base prices of the SKU's, promo prices, required quantity for the discounts can be altered from the Constants file.
The input can be given in input.txt file present in the src/main/resource/input.txt and the output (Total) will be displayed on the console.

Tools used in this project are - Java, Gradle. 

Once this project has been downloaded to your local machine, change the input and use the below command to run the application:

./gradlew bootrun --args='src/main/resources/input.txt'