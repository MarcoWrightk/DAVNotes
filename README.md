# DAVNotes — Voice, Sketch & Intelligent Memory

DAVNotes is a hybrid application that lets users capture spontaneous ideas through voice notes and quick sketches, organize them semantically, and retrieve them intelligently. Designed for creators, visual thinkers, and anyone who needs a natural way to record and rediscover their thoughts.


# Purpose

DAVNotes is not just a note-taking app. It’s a system that:

Captures voice and sketch input simultaneously.
Analyzes both modalities using high-performance C++ modules.
Organizes notes through a robust Java backend.
Offers an interactive JavaScript-based web interface.
Enables semantic search and intelligent visualization.


# Tech Stack

Java (Spring Boot) — Modular, secure backend
JavaScript (React) — Responsive, interactive frontend
C++ — High-performance simulation and analysis
Docker — Cross-platform deployment


# Quick Setup

Clone the repository
git clone https://github.com/MarcoWrightk/DAVNotes.git
cd DAVNotes

Backend (Java)
cd backend-java
./mvnw spring-boot:run

Frontend (React)
cd ../frontend-js
npm install
npm start

Simulation (C++)
cd ../simulation-cpp
mkdir build && cd build
cmake ..
make

