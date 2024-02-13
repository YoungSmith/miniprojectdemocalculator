FROM ubuntu:latest
COPY target/CalculatorSpeMiniproject-1.0-SNAPSHOT.jar /app/CalculatorSpeMiniproject-1.0-SNAPSHOT.jar
# CMD sed -i 's/\r$//' /app/calculator.sh
