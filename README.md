# java-springboot

## 機能1

### PUSH
```
curl -i -H "Accept: application/json" \
       -d "integer=${1}" \
       -d "string=${2}" \
       -d "strings=${2}1" -d "strings=${2}2" -d "strings=${2}3" \
       http://localhost:8080/hoges
```

### GET
```
curl -i -H "Accept: application/json" http://localhost:8080/hoges/${1}
```

## 機能2(thymeleaf)
ブラウザから、
http://localhost:8080/sample
にアクセスする

