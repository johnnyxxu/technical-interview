# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an **Upstart Technical Interview Preparation** repository containing solutions to LeetCode-style coding problems commonly asked in Upstart interviews. The codebase is structured as a Maven project using Java 17 and JUnit 5 for testing.

## Development Commands

### Building and Testing
- **Run all tests**: `mvn test`
- **Run a specific test class**: `mvn test -Dtest=ClassName`
- **Run a specific test method**: `mvn test -Dtest=ClassName#methodName`
- **Compile the project**: `mvn compile`
- **Clean and rebuild**: `mvn clean install`

### Project Structure
```
src/
├── main/java/upstart/          # Solution implementations
└── test/java/upstart/          # JUnit 5 test cases
```

## Code Architecture

### Package Structure
All solutions and tests live under the `upstart` package. This is a flat structure designed for interview practice problems.

### Coding Patterns
- **Solution classes**: Each problem gets its own class (e.g., `CountElements.java`)
- **Test classes**: Corresponding test class with suffix `Test` (e.g., `CountElementsTest.java`)
- **Test coverage**: Tests should include:
  - Examples from the problem statement
  - Edge cases (empty arrays, null inputs, single elements)
  - Boundary conditions
  - Various data patterns (duplicates, negatives, large gaps, etc.)

### Technology Stack
- **Java**: Version 17
- **Testing**: JUnit 5.9.3
- **Build Tool**: Maven 3.x
- **Encoding**: UTF-8

## Interview Problem Reference

The repository includes `upstart-interview-questions.md` and `upstart-interview-questions-detailed.md` which contain:
- 20 most frequently asked Upstart coding problems
- Problem difficulty breakdown (Easy: 35%, Medium: 45%, Hard: 20%)
- Focus areas: Arrays, Hash Tables, System Design
- Interview format: typically 1 medium + 1 hard problem in 1-hour sessions

When implementing solutions, reference these files to understand the problem context and difficulty level.