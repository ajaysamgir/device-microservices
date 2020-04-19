Course : Understanding NoSQL 

### NoSQL

- NoSQL database is not relational, normalization, data modelling, joining is not exist in NoSQL so complicated things become more easier.
- In NoSQL inside one table or container you may see the difference between record by record.
- Most NoSQL database are distributed by nature. 

### Consistency and Indexing
- Consistency in NoSQL is important because NoSQL DBs tend to be distributed and when you have a distributed database with different nodes in a cluster then data between those replicated nodes should be consistent, is bound to come up. 

#### CAP theorem
- database may be only excel at two of the following three attributes: 
  - Consistency
  - Availability
  - Partition tolerance
- The theorem says out those three things, any given database can really only excel two of them. so relational database is tends to excel at consistency and partition tolerance, where as NoSQL databases tend to excel at availability and partition tolerance. 

#### ACID guarantees
- Atomicity, Consistency, Isolation, durability
- NoSQL database does not offer ACID guarantees.
- Relational database gives ACID guarantees.

### Indexing
- Most of the NoSQL database indexed by the key.
- Improve performance in search operation

### Queries, MapReduce, Sharding
- NoSQL database actually does not support to query base language. the whole notion of a declarative query over the data actually doesn't exist, instead you really think about the data as files, the files holds all of the records that you created and the way you're going to process and determine what's inside of files is by creating a procedural program that will actually loop through those files and stack things up and execute some conditional logic give you back the answers that you need.
- Most of the NoSQL databases support to imperative code instead declarative query and lots of them using coding approach called as MapReduce.
- MapReduce means writing a code which has two functions in it, first function is implements map step. in  map step you taken a overall query and you split it up into little chunks. this goes hand in hand with distributed nature of NoSQL databases.
- In reduce step merge the result and return the list of values as per demand.
- Sharding is database partitioning pattern where separate servers stores partitions
- each partition is manage by different server and that means each of this are autonomous.
- almost all NoSQL databases support to to fan-out queries along with sharding, fan-out queries means when you submit one query to master node in cluster then it takes care of pushing that query to other nodes using MapReduce

### Technical view on NoSQL

#### Key Value stores
- Most common now days, which contains data like JSON in key-value pair.
- Examples on Clouds : Amazon SimpleDB, Azure CosmosDB

#### Document stores
- They have databases rather than tables
- THey have documents to store data rather than rows
- Document typically JSON object
- Each documents have properties and values
- Values can be arrays, links, JSON objects
- attachments as well
- we can say documents are specialized key-value stores
- e.g Couchbase, MongoDB

### What's good in Relational Database

#### Transactional
- Business systems requires atomic transactions, atomic transaction means it is system capable of grouping multiple, individual changes to a database into a single individual step, so that if any part, if any one of those operations succeeds then they all must succeed and if any one of them fail then all must fail. 

#### Declarative Queries
- Imperative queries work very well when range of queries are small.
- Declarative Queries help to get quick response when we try to fetch lengthy data.

