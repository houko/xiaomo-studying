cmake_minimum_required(VERSION 3.17)
project(about_c C)

set(CMAKE_C_STANDARD 11)

add_executable(
        about_c
        main.c
        src/max.c
        src/sum.c
        include/fun.h
        src/pyramid.c
        src/sign.c
        src/jiou.c src/dist.c src/prime.c)