# To Read

### Database used :

I used mySql 
with a database named javarecipies
and tables names are :
- ingredients
- steps
- recipe

J'ai testé les endpoints via postman, 
en ajoutant dans le body pour ajouter des recettes :


    {
        "title" : "",
        "author" : "",
        "publication_date" : "",
        "ingredientList":
            [
                {
                    "name": "",
                    "quantity": 0,
                    "unit": ""
                } 
            ],
        "stepList": 
            [
                {
                    "title" : "",
                    "description" : ""
                }
            ]
    }

Exercices :
Les premiers exercices sont executés grâce au controller FirstExercisesController
Le design pattern singleton est utilisé dans la class rectangle
