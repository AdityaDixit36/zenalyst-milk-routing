# Milk Routing Backend

Backend service for planning and running milk collection routes from villages and collection points to a chilling plant.

## Project Overview

This project provides a backend foundation for a dairy milk collection operation where milk is collected twice a day from multiple villages and transported to a chilling plant using tankers.

The system models the main operational entities such as villages, farmers, collection points, tankers, routes, route stops, and tanker status.

The backend is implemented using Java, Spring Boot, Spring Data JPA, PostgreSQL, and REST APIs.

## Technology Stack

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* REST APIs

## Implemented Components

The project currently contains backend components for:

* Village management
* Farmer management
* Collection point management
* Tanker management
* Route management
* Route stop management
* Tanker status management
* PostgreSQL persistence
* REST API structure

The current implementation provides the foundation for expanding the system into a complete milk collection planning and running workflow.

## API Structure

The main API resources are:

```text
/api/villages
/api/farmers
/api/collection-points
/api/tankers
/api/routes
/api/route-stops
/api/tanker-status
```

### Village APIs

#### Create Village

**POST**

```text
/api/villages
```

Example request:

```json
{
  "name": "Rampur"
}
```

#### Get All Villages

**GET**

```text
/api/villages
```

#### Update Village

**PUT**

```text
/api/villages/{id}
```

Example request:

```json
{
  "name": "Rampur Updated"
}
```

## Database Configuration

The application uses PostgreSQL for persistent data storage.

Before running the application, configure the PostgreSQL database connection in:

```text
src/main/resources/application.properties
```

Do not commit real database passwords or other secrets to the repository.

## How to Run

### Prerequisites

* Java 21
* PostgreSQL
* Git
* Maven or the included Maven Wrapper

### Start the Application

From the project root directory:

#### Windows PowerShell

```powershell
.\mvnw.cmd spring-boot:run
```

#### Linux / macOS

```bash
./mvnw spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```

## Testing APIs

The REST APIs can be tested using Postman or another REST client.

Example:

```text
POST http://localhost:8080/api/villages
```

Request body:

```json
{
  "name": "Rampur"
}
```

Then:

```text
GET http://localhost:8080/api/villages
```

to retrieve the saved villages.

## Assumptions

* A village has a unique name.
* PostgreSQL is used as the persistent database.
* Milk collection is expected to happen twice daily based on the assignment scenario.
* Routes are represented using route and route-stop entities.
* Tanker status is represented separately to support operational tracking.
* The current implementation is structured so additional planning and running logic can be added without changing the overall architecture.

## Scope / Current Limitations

The current version does not provide a complete production-grade route optimization or live tracking system.

The following are currently outside the implemented scope:

* Live GPS tracking
* Real-time tanker location updates
* Automatic map-based route optimization
* External map/routing service integration
* Farmer notifications
* Advanced milk spoilage prediction
* Production-grade authentication and authorization

These can be implemented as future enhancements.

## Project Structure

```text
src/
└── main/
    └── java/
        └── com/
            └── zenalyst/
                └── milkrouting/
                    ├── controller/
                    ├── entity/
                    ├── repository/
                    ├── service/
                    └── MilkRoutingApplication.java
```

## Architecture

The backend follows a layered Spring Boot architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL Database
```

* **Controller:** Handles HTTP requests and REST endpoints.
* **Service:** Contains application/business logic.
* **Repository:** Handles database operations using Spring Data JPA.
* **Entity:** Represents the application's domain objects.

## Status

The project provides an MVP backend structure for the milk routing assignment, including the core domain entities, layered REST architecture, and PostgreSQL persistence.

Further planning and operational logic can be extended on top of this foundation.
