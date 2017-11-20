# dockerandmendixalovestory
Docker and Mendix, A Love Story

```
cd buildpack
time docker build --no-cache --build-arg BUILD_PATH=0be36f8e-ca6a-4411-a0a7-966387107563/trunk/  -t jimleitch/puppers:latest .
docker-compose -f docker-compose-puppers.yml up


