# openapi-showcase
This demo microservice uses a response envelope class with generics to get a specific JSON response.
The goal is to get a correct parsed OpenAPI definition by the application server.

## JSON response

```json
{
	"data":
	{
		"items":
		[
			{"age":7,"name":"Leo the tiger"},
			{"age":11,"name":"Joe the wolf"}
		],
		"totalItems":2
	}
}
```