cmake_minimum_required(VERSION 3.10)

# Declare the project
project(noclue)

# Get the main file from the example/ dir and create executable
add_executable(noclue noclue.c)

install(TARGETS noclue DESTINATION bin)