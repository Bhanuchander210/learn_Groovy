//Reads the object
String jsonstring='''
{
"employee":{ "name":"John", "age":30, "city":"New York" }
}
'''
def json = new JsonSlurper().parseText(jsonstring)
println json
println json.class

/*
output :
[employee:[name:John, age:30, city:New York]]
class java.util.ArrayList
*/
