#!/bin/bash

echo "Creating test note..."
curl -X POST http://localhost:8080/api/notes/create \
  -H "Content-Type: application/json" \
  -d '{
    "audioBase64": "dGVzdC1hdWRpbw==",
    "sketchBase64": "dGVzdC1za2V0Y2g="
  }'

echo -e "\n\nFetching all notes..."
curl -X GET http://localhost:8080/api/notes/all

