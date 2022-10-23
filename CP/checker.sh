#!/bin/bash
set -e
javac ./Solution.java 
javac ./generator.java 
javac ./bruteForce.java 
for((i = 1; ; ++i)); do
    java generator $i > input
    java Solution < input > myAnswer
    java bruteForce < input > correctAnswer
    diff -w myAnswer correctAnswer > /dev/null || break
    echo "Passed test: "  $i
done
echo "WA on the following test:"
cat input
echo "Your answer is:"
cat myAnswer
echo "Correct answer is:"
cat correctAnswer