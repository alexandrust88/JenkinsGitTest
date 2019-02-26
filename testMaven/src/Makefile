build: helloWorld

helloWorld: main.o
	g++ $^ -o $@

main.o: main.cpp
	g++ -c $^

clean:
	rm helloWorld main.o
