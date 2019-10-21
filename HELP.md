./mvnw package

docker login --username=khawarhere

docker build -t apptwo .

docker tag apptwo inserito/apptwo:2

docker push inserito/apptwo:2
