# About

Student service with MySQL database to test the kubernetes deployment

## Local MySQL in Docker

```bash
docker run --name student-db --restart on-failure -p 3306:3306 -e MYSQL_ROOT_PASSWORD=student-pass -d mysql:latest

```
