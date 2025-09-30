FROM gcc:latest
WORKDIR /app

COPY . /app
RUN apt-get update && apt-get install -y cmake
RUN mkdir build && cd build && cmake .. && make

EXPOSE 9000
CMD ["./build/stub_server"]
