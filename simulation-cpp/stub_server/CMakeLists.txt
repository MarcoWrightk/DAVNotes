cmake_minimum_required(VERSION 3.10)
project(stub_server)

set(CMAKE_CXX_STANDARD 17)

# Incluir el header de httplib si está en include/
include_directories(${CMAKE_SOURCE_DIR}/include)

add_executable(stub_server main.cpp)

