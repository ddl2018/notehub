# notehub
A toy APP enabled by REST, Spring Boot, Eureka and MongoDB


Input those DATA from CML:

curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"clean coder\", \"content\" : \"Try to be a clean coder.\" }" http://localhost:8887/note

curl -i -X POST -H "Content-Type:application/json" -d "{  \"name\" : \"clean coder\", \"content\" : \"Blablabla\" }" http://localhost:8887/note


Please refer to  -readme.pdf -overview.png for a quick menu and design idea.
