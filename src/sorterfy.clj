(ns sorterfy
 	(:gen-class)
 	(:require [clojure.java.io :as io])
 	(:require [clojure.string :as str]))

(def lines (atom []))
(def usage "usage: clojure -M -m sorterfy [input-file] [output-file]\n")

(defn get-lines
 	"Reads lines from a file at the given path.
	Prints an error message and exits if the file does not exist."
 	[path]
 	(when-not (.exists (io/file path))
  		(println (str "Error: File \"" path "\" not exists."))
  		(System/exit 1))

 	(with-open [reader (io/reader path)]
	  	(vec (line-seq reader))))

(defn write-lines
 	"Writes the lines stored in the global atom `lines` to a file at the given path."
 	[path]
 	(spit path (str/join "\n" @lines)))

(defn sort-lines
 	"Sorts the lines read from a file and updates the global atom `lines` with the sorted lines."
 	[path]
 	(reset! lines (->
                		(get-lines path)
                		(sort))))

(defn -main
 	"Main entry point of the program.
	Expects two arguments: the input file path and the output file path.
	Prints an error message and exits if the arguments are not provided."
 	[& args]
 	(if (not= 2 (count args))
  		(do
   			(println "Error: Missing parameters.")
   			(println usage)
   			(System/exit 1))
  		(do
   			(sort-lines (first args))
   			(write-lines (second args))
   			(println "The file has been successfully sorted."))))
