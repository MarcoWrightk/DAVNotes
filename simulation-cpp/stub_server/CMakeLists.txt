cmake_minimum_required(VERSION 3.10)
project(stub_server)

set(CMAKE_CXX_STANDARD 17)

# include the header de httplib if it is in  include/
include_directories(${CMAKE_SOURCE_DIR}/include)

add_executable(stub_server main.cpp)

