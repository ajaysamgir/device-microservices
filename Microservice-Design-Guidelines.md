## Microservices
- Microservices gives you freedom to choose tools and technology as per your need for job.

### Implementing domain logic in Microservices
- Microservices architecture can make use of multiple different domain logic and data access patterns.
- Each microservice should have clearly defined responsibility. 
- Microservices code responsibilities
	1. Your microservice needs to be accept the incoming requests. via two common options HTTPRequest(By Web API) and Message(By event bus)
	2. Your microservice needs to be implements domain logic, which are the Business Logics.
	3. Your microservice needs to be very likely needs to perform some kind of data access, Microservices own there own data so microservice are going to need a way to query and update that data.
	4. Your microservice often needs to integrate with other services. that might be call to other microservices in your application that might be directly calling other microservices or pushing messages to an event bus or we might be call out to external third party services.
	
### Domain Logic Pattern
- There are 3 most common domain logic patterns use in enterprise application

1. Transaction Script patterns
- This is very simple pattern to structuring your domain logic.

2. Domain model pattern
- This pattern 	use object-oriented approach and fits well in domain driven design.
- This pattern is useful for complex business logic approach.

3. Data Access Pattern
- ORM(Object Relational Pattern) for relational database
- Whole Document operations for Document Database
- CQRS (Command Query Responsibility Segregation) for read and updates data
- Event Sourcing (Store state changes as a events)

### Avoid things when going to add new features
- When new feature comes that time it is important decision that where to put domain logic exactly. that time some things needs to avoid :
1. Duplicating business logic across multiple microservices 
2. Giving too many responsibilities to a single microservice
3. Too much communication between microservices, which leads to poor performance and availability.

### Backend For FrontEnd (BFF)
- Domain logic should live in microservices, means microservices also have the responsibilities for data access. If we keep DAO and data model layer separate then it helps to maintain and test the application more efficiently.
- BFF is additional layer between presentation layer and domain logic layer i.e BFF or API Getway.
- this BFF function calls service layer, this patterns have some benefits
	1. Security : BFF is single point of entry to application so we need to implement security only in one place.
	2. FrontEnd and Microservices are become independent to each other which make freedom to make changes without any dependency.
- For Best practice keep Domain logic and data across layer separate from API gateway/BFF so it prevent to large size of API Gateway layer.