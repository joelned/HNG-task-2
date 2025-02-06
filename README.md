# Number Classification API

## Overview

This API allows you to classify a number and returns interesting mathematical properties about it, along with a fun fact. The classification includes whether the number is prime, perfect, Armstrong, and whether it is odd or even.

## Features

- Classifies numbers as Armstrong, odd, even, prime, or perfect.
- Calculates the sum of digits for the number.
- Retrieves a fun fact about the number from the Numbers API.

## API Endpoint

### `GET /api/classify-number?number=371`

Classifies the given number and returns its properties.

**Request Parameter:**
- `number` (required): The number to classify (should be a valid integer).

**Response:**

- If the number is valid:
  ```json
  {
    "number": 371,
    "isPrime": false,
    "isPerfect": false,
    "properties": ["armstrong", "odd"],
    "digitSum": 11,
    "funFact": "371 is a narcissistic number."
  }
  ```
  - If the number is invalid (e.g., a string or non-integer value)
    ```json
    {
      "number": "alphabet",
      "error": true
    }
    ```
  - 400 Bad Request: If the input is not a valid integer
      ```json
    {
      "number": "alphabet",
      "error": true
    }
      ```
    

  
