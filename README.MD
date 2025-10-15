# Template Java Spring Keycloak Application

---

## for quick start rename "template" to your realm Keycloak name
#### use in idea ```Ctrl + Shift + R```

---

### Needed
- java 24
- docker

### start docker
```cmd
    cd docker
    docker-compose -f docker-compose.yml up -d
```

---

## For enable Authorization Code with PKCE:
### In keycloak:
- clients
- - Client authentication
- - - disable
#### AND
- clients
- - advanced
- - - proof Key for Code Exchange Code Challenge Method
- - - - S256

