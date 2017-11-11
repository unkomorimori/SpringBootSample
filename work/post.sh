#!/bin/bash

function f()
{
  curl -i -H "Accept: application/json" \
       -d "integer=${1}" \
       -d "string=${2}" \
       -d "strings=${2}1" -d "strings=${2}2" -d "strings=${2}3" \
       http://localhost:8080/hoges
}

f 1 "AAA"
f 2 "BBB"
