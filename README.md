# Sorterfy

Sorterfy is a simple (and experimental) Clojure program designed to read lines from an input file, sort them, and write the sorted lines to an output file. This project is a great starting point for learning Clojure, especially for those new to the language.

This project serves as a proof of concept for my Clojure language studies.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Reads lines from a specified input file.
- Sorts the lines alphabetically.
- Writes the sorted lines to a specified output file.
- Provides error handling for missing files or incorrect parameters.

## Installation

To run Sorterfy, you need to have Clojure installed on your system. You can download Clojure from the [official website](https://clojure.org/guides/getting_started).

Once Clojure is installed, clone this repository to your local machine:

```bash
git clone https://github.com/yourusername/sorterfy.git
cd sorterfy
```

## Usage

To use Sorterfy, run the following command in your terminal. You will use the standalone jar file stored in target:

```bash
java -jar target/sorterfy-0.1.0-standalone.jar [input-file] [output-file]
```

Replace `[input-file]` with the path to the file you want to sort and `[output-file]` with the path where you want to save the sorted lines.

For example:

```bash
java -jar target/sorterfy-0.1.0-standalone.jar unsorted.txt sorted.txt
```

This command will read lines from `unsorted.txt`, sort them, and write the sorted lines to `sorted.txt`.

## Contributing

Contributions are welcome! If you find a bug or have a feature request, please open an issue on GitHub. If you'd like to contribute code, please fork the repository and submit a pull request.

## License

Sorterfy is open-source software licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
