#!/bin/bash

curl -v -H 'Content-Type: application/json' -d '{"emailAddress" : "gurn@blanston.com", "plainTextPassword" : "welcomeToTheJungle"}' -X POST http://localhost:8080/users
