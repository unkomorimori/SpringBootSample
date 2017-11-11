#!/bin/bash


if [ "${1}" = "" ]; then
  echo "Error."
  exit 1
fi

curl -i -H "Accept: application/json" http://localhost:8080/hoges/${1}
echo 
