# 🛠️ Java Utilities Practice

## 📝 Description

This repository includes practical Java exercises designed to strengthen your understanding of file system interaction, object serialization, and configuration management using Java utilities. It emphasizes clean and portable coding practices, command-line execution, and the use of relative paths for platform independence.

## 🚀 Objectives

- Learn to work with Java's File I/O system.
- Understand recursion, file reading/writing, and directory traversal.
- Implement object serialization and deserialization.
- Use Java Properties files to externalize configuration.
- Practice command-line compilation and execution with portable code.

## 📚 Exercise Overview

### 🔹 Level 1

#### Exercise 1 – Alphabetical Directory Lister

- **What it does:** Lists files and directories in alphabetical order based on a directory path received via parameter.
- **Learning focus:** File object manipulation, sorting, command-line arguments.

#### Exercise 2 – Recursive Directory Tree

- **What it does:** Enhances the previous exercise by recursively traversing subdirectories, showing file type (D or F) and last modified date.
- **Learning focus:** Recursion, metadata access, directory structure representation.

#### Exercise 3 – Save Directory Tree to TXT

- **What it does:** Writes the output of Exercise 2 into a `.txt` file instead of printing to console.
- **Learning focus:** File output using BufferedWriter or FileWriter.

#### Exercise 4 – Read TXT File Content

- **What it does:** Reads a `.txt` file and prints its content to the console.
- **Learning focus:** File input using BufferedReader or Scanner.

#### Exercise 5 – Serialize & Deserialize Object

- **What it does:** Demonstrates how to serialize a Java object to a `.ser` file and read it back (deserialization).
- **Learning focus:** Serializable interface, Object streams.

### 🔹 Level 2

#### Exercise 1 – Configurable Directory Tree Export

- **What it does:** Parametrizes Exercise 3 using a `.properties` config file (or Apache Commons Configuration). Configuration includes input directory and output file path.
- **Learning focus:** Configuration externalization, Java Properties API, flexibility.

## ⚙️ Technologies Used

- Java 17
- Eclipse or IntelliJ IDEA
- GitHub

## 📋 Requirements

- Java JDK 17 or higher
- Git for version control
- IDE (Eclipse or IntelliJ)

## 🛠️ Installation

```bash
git clone https://github.com/Apani13/s1-05-java-utils.git
```

Open the project in IntelliJ IDEA or Eclipse and make sure Java 17+ is selected as the SDK.

## ▶️ Execution

All exercises are executable via **terminal**. Example structure:

```
/<project-root>
├── src/
│   └── level01/exercise1/...  (Java source files)
└── bin/                      (compiled class files)
```

### Compile

```bash
javac -d bin src/level01/exercise1/*.java
```

### Run

```bash
java -cp bin level01.exercise1.Main
```

### For Level 2 (with properties):

```bash
javac -d bin -cp "lib/*" src/com/utils/ConfigurableDirectoryTreeToFile.java
java -cp "bin:lib/*" com.utils.ConfigurableDirectoryTreeToFile
```

*(Use **``** instead of **``** on Windows)*

## 🤝 Contributions

1. Fork the repository.
2. Create your branch: `git checkout -b feature/MyFeature`
3. Commit changes: `git commit -m "Add MyFeature"`
4. Push your branch: `git push origin feature/MyFeature`
5. Open a pull request.

## ✅ Author Notes

These Java utility-focused exercises are designed to build strong fundamentals for handling files, directories, and configurations using clean, portable, and scalable practices. Running everything via the command line ensures deep understanding of Java build and execution processes.

Happy coding! 🚀