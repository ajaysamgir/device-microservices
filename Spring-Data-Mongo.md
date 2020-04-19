
## MongoDB Overview
- MongoDB is popular and powerful NoSQL database for quickly scale and handle large amount of data.
- It also fits nicely to develop a rest api's using spring
- Spring provides strong support with Spring Data MongoDB connector.
- instead of using tables MongoDB use Collections and Documents to store data and database is a namespace for a collection. 
- Collections is similar like a table which store the documents.
- Documents are individual records similar to JSON objects. the document model maps back to objects in your application code. 

## Spring Data MongoDB
- Spring data for MongoDB is part of umbrella Spring data project and makes it easy to develop solution that connect to MongoDB.
- Spring Data Modules
  1. Spring data commons
  2. Spring data MongoDB
  3. Spring data JPA
  4. Spring data JDBC
  5. Spring data Cassandra
  6. Spring data REST

## @Documents @DBRef @Query
- TODO : research and add some notes

## Querying with Spring
- Spring provides several ways to querying data through the application.

### Documents relationship
- Documents relationship need not to mention like annotation @OneToMany you just need to define object/list of objects
- There are two ways to manage relationship in NoSQL 
	1. Embedded Documents
	- Benefits of embedding over referencing is that you don't have to issue a separate query to obtain the data.
	- Also embedding causes no repetition of data.
	2. Documents References
	-  You can reference another document manually or by using the @DBRef annotation
	-  Need multiple querying for get object and related object data.	 

### MongoRepository 
- MongoRepository is a very simple interface which contains some generic methods.
- It implements CrudRepository interface, PagingAndSortingRepository, QueryByExampleExecutor and Repository
- There are several methods provided inbuild
  - find(), findOne(), findAll(), findById(), insert(), delete(), save()

### MongoTemplate
- Another way to query in spring-mongo application is using MongoTemplate
- It follows standard template pattern in Spring, it helps to easily perform common database operations like Create, Update, Delete and Query
- MongoTemplate also provides mapping between domain objects and MongoDB documents.
- It provides much more granular control over the query and the data included in the results.
- You need to create @Bean of MongoTemplate class along with dependency MongoClient in your application configuration file.

### Criteria Object
- Criteria is central class to creating queries, we need to create a query using Query class instance and then adding a criteria in it.
```
Query query = new Query();
query.addCriteria(Criteria.where("name").is(user.getUserName()));

//Update object use for update the data in database

Update update = new Update();
update.set("mobile", user.getMobileNumber());

mongoTemplate.updateFirst(query, update, User.class);
```

### Array Of Documents
- Documents can be embedded inside another documents. 
- using dot operator we can pass query parameter of another documents and fetch the data.

## Managing Indexes and Common Annotations
- Indexes helps to queries for find documents that matches the query criteria without performing a collection scan. 
- if a query has an appropriate index, MongoDB uses then index and limit number of documents it examines. 
- There are saveral annotations for crating indexes. 
- @Indexed
	- It specifies field that will be indexed by MongoDB
- @TextIndexed
	- It specifies a field that will be a part of the text index
- @CompoundIndex 
	- It specifies that class will be use compound indexes
- @GeoSpacialIndexed 
	- it specifies field that will be indexed using MongoDB's geoSpecial indexing feature. 
	
## Session and Transaction Management
- There are several limitations in store HTTP session on server, spring removes those limitations.

### Sessions
- Spring session core module is similar to Spring data commons and provides core functionalities and APIs with other modules containing data stores specific requirements. there was recent splits where APIs specific to MongoDB solution.

- APIs
 - Manage users sessions 
- HTTPSession
 - Replace HttpSession in neural way
- Clustered sessions
 - Cluster specific session management
- RESTFul APIs
 - Spring sessions allows to provide session ID and Headers in order to work with RESTFul APIs.

### Transaction Management
- MongoDB allows transaction to run in replica set. 
- Transaction means set of action which is perform in single unit and if any one action is fail then all group should fail and all completed action should be rollback. if all actions is complete then transaction should commit in database.
- Multistep transaction is big deal for lots of companies, Transaction management insures data consistency and integrity.
- For More, Course -> Data Transaction with Spring (Pluralsight)  

### MongoTransactionManager
- Manage all transaction in application
- Transaction support disabled by default
- provide easy access to Spring transaction support
 