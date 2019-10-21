./mvnw package

docker login --username=khawarhere

docker build -t apptwo .

docker tag apptwo inserito/apptwo:3

docker push inserito/apptwo:3
