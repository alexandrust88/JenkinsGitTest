CC = gcc
CFLAGS = -Wall -g
INCLUDES = -I/usr/include -I.
LFLAGS =
LIBS =
SRCS=$(wildcard *.c)
OBJS = $(patsubst %.c,%.o,$(SRCS))
OBJ = $(TARGET_DIR)/$(OBJS)
TARGET_DIR = ../../../target/bin
MAIN = Hello

.PHONY: depend clean

all: $(MAIN)
	@echo "Successfully compiled Hello project"

$(MAIN): $(OBJS)
	$(CC) $(CFLAGS) $(INCLUDES) -o $(TARGET_DIR)/$(MAIN) $(OBJ) $(LFLAGS) $(LIBS)

.c.o:
	$(CC) $(CFLAGS) $(INCLUDES) -c $< -o $(TARGET_DIR)/$@

clean:
	$(RM) $(TARGET_DIR)/*.o $(TARGET_DIR)/$(MAIN)

depend: $(SRCS)
	makedepend $(INCLUDES) $^

