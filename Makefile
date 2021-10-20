default: run

run:
	./gradlew run

clean:
	./gradlew clean

test:
	./gradlew clean test

testHomework:
	./gradlew clean test --tests MyTests.testSimplify --tests MyTests.testStaticAdd --tests MyTests.testStaticSubtract --tests MyTests.testStaticMultiply --tests MyTests.testStaticDivide

testNonStatic: 
	./gradlew clean test --tests MyTests.testNonStaticAdd --tests MyTests.testNonStaticSubtract --tests MyTests.testNonStaticMultiply --tests MyTests.testNonStaticDivide

tests: test