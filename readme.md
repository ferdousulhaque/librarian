# Librarian
This a **Sprint Boot application** is a demonstration of the a librarian's day to day operations. Let's see what he does:

- Keeps the track of books (new, existing, obsolete) 
[**books**]
- Keeps track of rented books (rented, available) [**rent**]
- Keeps track of the users registration at library [**users**]

For each operations I have mentioned the relevant microservice that been used.

For managing the services I have used.

- Service Discovery [**eurekaSrv**]
- Configuration Server [**config-server**]
- Inter API Communication [**octopus**] - OpenFeign

## Start Up
Please follow the sequence to start the application

### Docker for Database
Very beginning you need to start the docker container and run the mysql database container.

```bash
docker compose up --build -d
```

### Boot Application
Now star the application as per the sequence
```
1. Config Server
2. Service Discovery
3. Books
4. Octopus
5. Users
6. Rent
```