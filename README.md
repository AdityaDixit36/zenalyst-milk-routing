# Milk Routing Backend

Backend service for planning and running milk collection routes from villages/farmers to a chilling plant.

## Project Overview

The system is designed for a dairy collection operation where milk is collected twice a day from multiple villages and transported to a chilling plant using tankers.

The backend provides APIs to manage villages and supports the foundation for milk collection route planning and daily tanker operations.

## Technology Stack

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* REST APIs

## Current Features

* Create a village
* Get all villages
* Update village details
* Persistent storage using PostgreSQL
* REST API based backend

## API Endpoints

### Create Village

**POST**

`/api/villages`

Example request:

```json
{
  "name": "Rampur"
}
```

### Get All Villages

**GET**

`/api/villages`

### Update Village

**PUT**

`/api/villages/{id}`

Example request:

```json
{
  "name": "Rampur Updated"
}
```

## Database Configuration

The application uses PostgreSQL for persistent data storage.

Before running the application, configure the PostgreSQL database and update the database connection properties in:

`src/main/resources/application.properties`

Do not commit real database passwords or other secrets to the repository.

## How to Run

### Prerequisites

* Java 21
* PostgreSQL
* Maven or Maven Wrapper
* Git

### Start the Application

From the project root directory, run:

```bash
./mvnw spring-boot:run
```

On Windows PowerShell, if required:

```powershell
.\mvnw.cmd spring-boot:run
```

The application runs on:

`http://localhost:8080`

## Testing APIs

The APIs can be tested using Postman or any REST client.

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
* The application currently focuses on the implemented village-management functionality.
* Route planning, tanker tracking, farmer-level collection scheduling and spoilage optimization can be extended on top of the current backend.

## Scope / Exclusions

The current MVP does not implement:

* Live GPS/tanker tracking
* Real-time tanker location updates
* Automatic route optimization using maps
* External map/routing service integration
* Notifications to farmers
* Advanced milk spoilage prediction

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

## Status

MVP backend implementation completed for the currently implemented functionality.
