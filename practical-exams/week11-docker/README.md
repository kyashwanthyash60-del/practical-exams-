# Week 11: Docker Practical

## Aim
Build and run a Docker container for a static web page.

## Requirements
Install and start Docker Desktop.

## Run
Open a terminal in `week11-docker/hello-docker`:
```bash
docker build -t practical-hello .
docker run --name practical-hello-container -d -p 8080:80 practical-hello
```
Open `http://localhost:8080`.

## Stop and remove
```bash
docker stop practical-hello-container
docker rm practical-hello-container
```

Expected result: the browser displays “Hello from Docker!”.
