# Singleton Design Pattern (Java)

This section explains the Singleton Design Pattern in Java.
It ensures that only one object of a class is created and shared globally.

## Topics Covered
- Eager (Early) Instantiation
- Lazy Instantiation
- Synchronized Singleton (Thread-safe but slow)
- Double Checked Locking (Fast & Thread-safe)
- Thread behavior
- Exception safety

## Why Singleton?
- Database connection
- Logger
- Configuration manager
- Shared resources

## Key Rules
- Private constructor
- Private static instance
- Public static getInstance() method

Author: NoyonSoftworks