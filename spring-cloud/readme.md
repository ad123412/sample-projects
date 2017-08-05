This is an example of how we can externalise the configuration/ properties.
So using spring cloud config server we can externalise the project properties.
This will override the application.properties of the client project.
If we change any property in the centralised repository/ properties file, we can refresh the client 
using "http://localhost:8888/refresh" in the client (8888 is the client boot project port)

Also use the following to add the local directory as git repository
1. create any folder and create ant file with <any name>.properties. Then add all the properties in that file.
2. cd the folder. then use git init
3. then git add -A
4. then git commit
