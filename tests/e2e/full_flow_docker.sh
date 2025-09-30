#!/bin/bash

echo "🛠️ Building and starting services..."
docker-compose up -d --build

echo "⏳ Waiting for backend to be ready..."
sleep 10

echo "🚀 Running integration test..."
bash tests/integration/create_note_flow.sh

echo "🧹 Stopping services..."
docker-compose down

