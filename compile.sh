#!/bin/bash

javac ./src/*/*.java -d ./bin
java -cp ./bin main.Main
