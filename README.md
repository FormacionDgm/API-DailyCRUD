# API-DailyCRUD
## Estructura del proyecto

Lo primero es crear la estructura para trabajar. Por ello el primer paso es crear una organización en github.
+ https://help.github.com/articles/creating-a-new-organization-from-scratch/

## API (Readme)

+ 4.1 GET     _-----/daily?user=----_ 
Request:
Response: { "User": "someone", "Date": "Someday", "Content": "something", "Status": OK }

+ 4.2 PUT      _-----/daily?user=----_
Request: { "Date": "someday", "Content": "something" }
Response: { "Status": OK }

+ 4.3 DELETE _-----/daily?user=----&date=----_ 
Request:
Response: { "Status": OK }

+ 4.4 POST     _-----/daily?user=----_ 
Request: { "Content": "something" }
Response: { "Status": OK }

## Iteración 1

UAT
1.  Por el momento no es necesario poder hacer login

2. El proyecto debe tener Readme (más abajo defino lo que tiene que haber) y un .gitignore usa los gitignore de java, intellij y maven de la siguiente página https://github.com/github/gitignore

3. Se debe preparar un esquema de la estructura para esta iteración, no importa que sea complejo pero tiene que haber un análisis SIEMPRE.

4. A continuación vienen las acciones que se deben poder realizar contra la API*:
    4.1 Un usuario puede acceder a una daily concreta
    4.2 Un usuario puede actualizar un content
    4.3 Un usuario puede borrar un registro
    4.4 Un usuario puede agregar una daily
