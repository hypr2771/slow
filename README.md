## Slow

This service is used to perform simulate locally a slow, non-reactive HTTP service.

### Setup

- checkout the project
- run the `SlowApplication` with `-Dserver.port=<port>`

### API

You will simply need to do a:

```http
GET http://localhost:<port>/test/delay?delay=<delay_before_answer>
```
