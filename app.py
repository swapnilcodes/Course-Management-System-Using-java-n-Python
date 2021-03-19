import pymongo
import json

client= pymongo.MongoClient("mongodb://localhost:27017")

db= client["student_management_genxclub"]

collection= db["students"]

data= open("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\TXT's\\createNewTry.txt", 'r')
data= data.read()
data= json.loads(data)
print(data)
ifMatches= False
for student in collection.find({"email": data["email"]}):
    ifMatches= True


if ifMatches:
    writer= open("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\TXT's\\emailExists.txt", "w")
    writer.write('true')

else:
    writer = open("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\TXT's\\emailExists.txt", "w")
    writer.write('false')